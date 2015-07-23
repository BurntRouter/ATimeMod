package com.AdventureTime.Entity;

import net.minecraft.block.Block;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityFP extends EntityMob
{
    public String npcName;

    public EntityFP(World var1)
    {
        super(var1);
        this.isImmuneToFire = true;
        this.tasks.addTask(6, new EntityAIWander(this, 0.3D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, 0.4D, true));
        this.tasks.addTask(4, new EntityAIOpenDoor(this, true));
        this.tasks.addTask(3, new EntityAIRestrictOpenDoor(this));
        this.tasks.addTask(2, new EntityAIMoveIndoors(this));
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

    public float getMobMaxHealth()
    {
        return 40.0F;
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
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        super.onLivingUpdate();

        if (this.isWet())
        {
            this.attackEntityFrom(DamageSource.drown, 1.0F);
        }

        int i = MathHelper.floor_double(this.posX);
        MathHelper.floor_double(this.posZ);


        for (i = 0; i < 4; ++i)
        {
            MathHelper.floor_double(this.posX + (double)((float)(i % 2 * 2 - 1) * 0.25F));
            MathHelper.floor_double(this.posY);
            MathHelper.floor_double(this.posZ + (double)((float)(i / 2 % 2 * 2 - 1) * 0.25F));

        }
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
     */
    protected Block getDropItemId()
    {
        return Blocks.fire;
    }
    
    protected void EntityPigZombie(World par1World)
    {
        this.isImmuneToFire = true;
    }
    
    public float getMobMaxSpeed()
    {
    	return 1.15F;
    }

    protected void dropRareDrop(int var1)
    {
        switch (this.rand.nextInt(3))
        {
            case 0:
                this.dropItem(Items.emerald, 1);
                break;

            case 1:
                this.dropItem(Items.diamond, 4);
        }
    }
}
