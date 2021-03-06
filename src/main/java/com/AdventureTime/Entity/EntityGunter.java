package com.AdventureTime.Entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityGunter extends EntityCreature
{
    @SuppressWarnings("unused")
	private int conversionTime = 0;

    public EntityGunter(World var1)
    {
        super(var1);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(6, new EntityAIWander(this, 0.2D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 0.3D));
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

    /**
     * Returns true if the newer Entity AI code should be run
     */
    protected boolean isAIEnabled()
    {
        return true;
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
    @SideOnly(Side.CLIENT)
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
    protected Item getDropItemId()
    {
        return Items.snowball;
    }
    
    public float getMobMaxHealth()
    {
    	return 20F;
    }
    
    public float getMobMaxSpeed()
    {
    	return 0.65F;
    }

    protected void dropRareDrop(int var1)
    {
        switch (this.rand.nextInt(3))
        {
            case 0:
                this.dropItem(Items.snowball, 4);
                break;

            case 1:
                this.dropItem(Items.snowball, 1);
                break;

            case 2:
                this.dropItem(Items.snowball, 1);
        }
    }
}
