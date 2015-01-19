package com.AdventureTime.Entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityIceKing extends EntityMob
{
    private int conversionTime = 0;
    public String npcName;

    public EntityIceKing(World var1)
    {
        super(var1);
        this.tasks.addTask(5, new EntityAIMoveThroughVillage(this, 0.3D, false));
        this.tasks.addTask(6, new EntityAIWander(this, 0.3D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, 0.3D, true));
        this.getNavigator().setAvoidsWater(true);
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityFinn.class, 0, false, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityJake.class, 0, false, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityFP.class, 0, false, false));
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
        return 30.0F;
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
        int j = MathHelper.floor_double(this.posZ);

        if (this.worldObj.getBiomeGenForCoords(i, j).getFloatTemperature(10, 10, 10) > 1.0F)
        {
            this.attackEntityFrom(DamageSource.onFire, 1.0F);
        }

        for (i = 0; i < 4; ++i)
        {
            j = MathHelper.floor_double(this.posX + (double)((float)(i % 2 * 2 - 1) * 0.25F));
            int k = MathHelper.floor_double(this.posY);
            int l = MathHelper.floor_double(this.posZ + (double)((float)(i / 2 % 2 * 2 - 1) * 0.25F));

            if (this.worldObj.getBlockMetadata(j, k, l) == 0 && this.worldObj.getBiomeGenForCoords(j, l).getFloatTemperature(10, 10, 10) < 0.8F && Blocks.snow.canPlaceBlockAt(this.worldObj, j, k, l))
            {
                this.worldObj.setBlock(j, k, l, Blocks.snow);
            }
        }
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
     */
    protected Item getDropItemId()
    {
        return Items.diamond_sword;
    }
    
    public float getMobMaxSpeed()
    {
    	return 0.80F;
    }

    protected void dropRareDrop(int var1)
    {
        switch (this.rand.nextInt(3))
        {
            case 0:
                this.dropItem(Items.snowball, 4);
                break;

            case 1:
                this.dropItem(Items.snowball, 10);
        }
    }
}
