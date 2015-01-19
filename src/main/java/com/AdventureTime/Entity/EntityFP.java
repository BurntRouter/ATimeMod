package com.AdventureTime.Entity;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.EntityWither;
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
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityFP extends EntityMob
{
    private int conversionTime = 0;
    private Entity targetedEntity = null;
    private int explosionStrength;
    public String npcName;

    public EntityFP(World var1)
    {
        super(var1);
        this.isImmuneToFire = true;
        this.tasks.addTask(6, new EntityAIWander(this, 0.3D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, 0.4D, true));
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(4, new EntityAIOpenDoor(this, true));
        this.tasks.addTask(3, new EntityAIRestrictOpenDoor(this));
        this.tasks.addTask(2, new EntityAIMoveIndoors(this));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySkeleton.class, 0, false, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityZombie.class, 0, false, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityCreeper.class, 0, false, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPigZombie.class, 0, false, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityEnderman.class, 0, false, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySpider.class, 0, false, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySlime.class, 0, false, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityMagmaCube.class, 0, false, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityCaveSpider.class, 0, false, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityBlaze.class, 0, false, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityWither.class, 0, false, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityIceKing.class, 0, false, false));
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

    @SideOnly(Side.CLIENT)
    protected void updateEntityActionState()
    {
        this.explosionStrength = this.rand.nextInt(3) + 1;
        double d4 = 64.0D;
        this.targetedEntity = this.worldObj.getClosestVulnerablePlayerToEntity(this, 100.0D);

        if (this.targetedEntity != null && this.targetedEntity.getDistanceSqToEntity(this) < d4 * d4)
        {
            double d5 = this.targetedEntity.posX - this.posX;
            double d6 = this.targetedEntity.boundingBox.minY + (double)(this.targetedEntity.height / 2.0F) - (this.posY + (double)(this.height / 2.0F));
            double d7 = this.targetedEntity.posZ - this.posZ;
            this.renderYawOffset = this.rotationYaw = -((float)Math.atan2(d5, d7)) * 180.0F / (float)Math.PI;

            if (this.canEntityBeSeen(this.targetedEntity))
            {
                this.worldObj.playAuxSFXAtEntity((EntityPlayer)null, 1008, (int)this.posX, (int)this.posY, (int)this.posZ, 0);
                EntityLargeFireball entitylargefireball = new EntityLargeFireball(this.worldObj, this, d5, d6, d7);
                entitylargefireball.field_92057_e = this.explosionStrength;
                double d8 = 4.0D;
                Vec3 vec3 = this.getLook(1.0F);
                entitylargefireball.posX = this.posX + vec3.xCoord * d8;
                entitylargefireball.posY = this.posY + (double)(this.height / 2.0F) + 0.5D;
                entitylargefireball.posZ = this.posZ + vec3.zCoord * d8;
                this.worldObj.spawnEntityInWorld(entitylargefireball);
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

        if (this.worldObj.getBiomeGenForCoords(i, j).getFloatTemperature(j, j, j) < 0.2F)
        {
            this.attackEntityFrom(DamageSource.onFire, 1.0F);
        }

        for (i = 0; i < 4; ++i)
        {
            j = MathHelper.floor_double(this.posX + (double)((float)(i % 2 * 2 - 1) * 0.25F));
            int k = MathHelper.floor_double(this.posY);
            int l = MathHelper.floor_double(this.posZ + (double)((float)(i / 2 % 2 * 2 - 1) * 0.25F));

            if (this.worldObj.getBlockMetadata(j, k, l) == 0 && this.worldObj.getBiomeGenForCoords(j, l).getFloatTemperature(j, k, l) < 0.8F && Blocks.fire.canPlaceBlockAt(this.worldObj, j, k, l))
            {
                this.worldObj.setBlock(j, k, l, Blocks.fire);
            }
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
