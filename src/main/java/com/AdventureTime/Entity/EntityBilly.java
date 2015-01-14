package com.AdventureTime.Entity;

import com.AdventureTime.Items.ModItems;
import com.AdventureTime.Main.AdventureTimeMain;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
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
        this.chest = new ItemStack(Items.diamond_chestplate, 1);
        this.sword = new ItemStack(ModItems.billygauntlet, 1);
        this.i = 0;
        this.setHealth(this.getMaxHealth());

        this.setCurrentItemOrArmor(0, this.sword);
        this.setCurrentItemOrArmor(1, new ItemStack(Items.diamond_helmet));
        this.setCurrentItemOrArmor(3, this.chest);
        this.setCurrentItemOrArmor(2, new ItemStack(Items.diamond_leggings));
        this.setCurrentItemOrArmor(4, new ItemStack(Items.diamond_boots));

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
    protected Item getDropItemId()
    {
        return Items.diamond_sword;
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
    
    public float getMaxMoveSpeed()
    {
       return 0.55F;
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
}
