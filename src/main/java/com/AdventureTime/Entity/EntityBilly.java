package AdventureTime.Entity;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import AdventureTime.Main.AdventureTimeMain;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityBilly extends EntityMob implements IBossDisplayData
{
    private ItemStack chest;
    private ItemStack sword;
    int i;

    public EntityBilly(World par1World)
    {
        super(par1World);
        this.chest = new ItemStack(Item.plateDiamond, 1);
        this.sword = new ItemStack(AdventureTimeMain.billygauntlet, 1);
        this.i = 0;
        this.setHealth(this.getMaxHealth());

        if (this.worldObj.difficultySetting == 3)
        {
            EnchantmentHelper.addRandomEnchantment(this.rand, this.sword, 30);
            EnchantmentHelper.addRandomEnchantment(this.rand, this.chest, 30);
        }
        else
        {
            EnchantmentHelper.addRandomEnchantment(this.rand, this.sword, 20);
            EnchantmentHelper.addRandomEnchantment(this.rand, this.chest, 20);
        }

        this.setCurrentItemOrArmor(0, this.sword);
        this.setCurrentItemOrArmor(1, new ItemStack(Item.helmetDiamond));
        this.setCurrentItemOrArmor(3, this.chest);
        this.setCurrentItemOrArmor(2, new ItemStack(Item.legsDiamond));
        this.setCurrentItemOrArmor(4, new ItemStack(Item.bootsDiamond));

        for (int i = 0; i < 5; ++i)
        {
            this.equipmentDropChances[i] = 0.0F;
        }
    }
    
    public void setDead(World world)
    {

        EntityFinn entity = new EntityFinn(world); //This creates the entity
        entity.setPosition(this.posX, this.posY + 30, this.posZ);
        {
        	world.joinEntityInSurroundings(entity);
        }
        System.out.println("[LOOK AT DIIIIIIIIS!!!]Spawned Finn");

        super.setDead();
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return Item.swordDiamond.itemID;
    }

    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean par1, int par2)
    {
        this.entityDropItem(this.chest, 1.0F);
        this.entityDropItem(this.sword, 1.0F);
    }

    protected void entityInit()
    {
        super.entityInit();
        this.getDataWatcher().addObject(12, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(13, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(14, Byte.valueOf((byte)0));
    }

    public float getMobMaxHealth()
    {
        return 200.0F;
    }

    /**
     * Makes entity wear random armor based on difficulty
     */
    protected void addRandomArmor() {}
    
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.15D);
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    @SideOnly(Side.CLIENT)
    public void onLivingUpdate()
    {
    	i++;
    	super.onLivingUpdate();
    	int f = rand.nextInt(30);
    	if (f==0){
    		updateEntityActionState();
    	}
    }
    @SideOnly(Side.CLIENT)
    public float getBossHealth()
    {
        return this.getMaxHealth();
    }
}
