package AdventureTime.Entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityPB extends EntityMob implements IBossDisplayData
{
    private int conversionTime = 0;
    public String npcName;

    public EntityPB(World var1)
    {
        super(var1);
        this.tasks.addTask(33, new EntityAIWander(this, 0.3D));
        this.tasks.addTask(32, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(31, new EntityAILookIdle(this));
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(35, new EntityAIMoveIndoors(this));
        this.tasks.addTask(36, new EntityAIRestrictOpenDoor(this));
        this.tasks.addTask(43, new EntityAIOpenDoor(this, true));
        this.tasks.addTask(15, new EntityAIAttackOnCollide(this, EntitySkeleton.class, 1.0D, false));
        this.tasks.addTask(16, new EntityAIAttackOnCollide(this, EntityZombie.class, 1.0D, true));
        this.tasks.addTask(17, new EntityAIAttackOnCollide(this, EntityCreeper.class, 1.0D, false));
        this.tasks.addTask(18, new EntityAIAttackOnCollide(this, EntityPigZombie.class, 1.0D, true));
        this.tasks.addTask(19, new EntityAIAttackOnCollide(this, EntityEnderman.class, 1.0D, false));
        this.tasks.addTask(20, new EntityAIAttackOnCollide(this, EntitySpider.class, 1.0D, true));
        this.tasks.addTask(21, new EntityAIAttackOnCollide(this, EntitySlime.class, 1.0D, false));
        this.tasks.addTask(22, new EntityAIAttackOnCollide(this, EntityMagmaCube.class, 1.0D, true));
        this.tasks.addTask(23, new EntityAIAttackOnCollide(this, EntityCaveSpider.class, 1.0D, false));
        this.tasks.addTask(24, new EntityAIAttackOnCollide(this, EntityBlaze.class, 1.0D, true));
        this.tasks.addTask(25, new EntityAIAttackOnCollide(this, EntityWither.class, 1.0D, false));
        this.tasks.addTask(26, new EntityAIAttackOnCollide(this, EntityIceKing.class, 1.0D, true));
        this.tasks.addTask(26, new EntityAIAttackOnCollide(this, EntityDragon.class, 1.0D, true));
        this.tasks.addTask(27, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySkeleton.class, 0, false, false));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityZombie.class, 0, false, false));
        this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityCreeper.class, 0, false, false));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityPigZombie.class, 0, false, false));
        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntityEnderman.class, 0, false, false));
        this.targetTasks.addTask(7, new EntityAINearestAttackableTarget(this, EntitySpider.class, 0, false, false));
        this.targetTasks.addTask(8, new EntityAINearestAttackableTarget(this, EntitySlime.class, 0, false, false));
        this.targetTasks.addTask(9, new EntityAINearestAttackableTarget(this, EntityMagmaCube.class, 0, false, false));
        this.targetTasks.addTask(10, new EntityAINearestAttackableTarget(this, EntityCaveSpider.class, 0, false, false));
        this.targetTasks.addTask(11, new EntityAINearestAttackableTarget(this, EntityBlaze.class, 0, false, false));
        this.targetTasks.addTask(12, new EntityAINearestAttackableTarget(this, EntityWither.class, 0, false, false));
        this.targetTasks.addTask(13, new EntityAINearestAttackableTarget(this, EntityIceKing.class, 0, false, false));
        this.targetTasks.addTask(14, new EntityAINearestAttackableTarget(this, EntityDragon.class, 0, false, false));
        //this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityLich.class, 0, false, false));       
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
    }

	/**
     * Determines if an entity can be despawned, used on idle far away entities
     */
    protected boolean canDespawn()
    {
        return false;
    }

    protected void entityInit()
    {
        super.entityInit();
        this.getDataWatcher().addObject(12, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(13, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(14, Byte.valueOf((byte)0));
    }
    
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.25D);
    }


    public float getMobMaxHealth()
    {
        return 40.0F;
    }
    
    public boolean attackEntityAsMob(Entity par1Entity)
    {
        boolean flag = super.attackEntityAsMob(par1Entity);


        return flag;
    }

    /**
     * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
     */
    public int getTotalArmorValue()
    {
        int var1 = super.getTotalArmorValue() + 2;

        if (var1 > 20)
        {
            var1 = 20;
        }

        return var1;
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    protected boolean isAIEnabled()
    {
        return true;
    }

    /**
     * If Animal, checks if the age timer is negative
     */
    public boolean isChild()
    {
        return this.getDataWatcher().getWatchableObjectByte(12) == 1;
    }

    public void setChild(boolean var1)
    {
        this.getDataWatcher().updateObject(12, Byte.valueOf((byte)1));
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return null;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return null;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return null;
    }

    /**
     * Plays step sound at given x, y, z for the entity
     */
    protected void playStepSound(int var1, int var2, int var3, int var4)
    {
        this.playSound("mob.zombie.step", 0.15F, 1.0F);
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     * @return 
     */

    public ItemStack getHeldItem()
    {
    return null;
    }
    
}