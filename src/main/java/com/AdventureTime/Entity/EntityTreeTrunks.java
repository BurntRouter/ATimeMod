package com.AdventureTime.Entity;

import com.AdventureTime.Items.ModItems;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityTreeTrunks extends EntityMob {
	public String npcName;

	public EntityTreeTrunks(World var1) {
		super(var1);
		this.getNavigator().setBreakDoors(true);
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(6, new EntityAIWander(this, 0.2D));
		this.tasks.addTask(7, new EntityAIWatchClosest(this,
				EntityPlayer.class, 8.0F));
		this.tasks.addTask(7, new EntityAILookIdle(this));
		this.tasks.addTask(1, new EntityAIPanic(this, 0.5D));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
	}

	/**
	 * Determines if an entity can be despawned, used on idle far away entities
	 */
	@Override
	protected boolean canDespawn() {
		return false;
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.getDataWatcher().addObject(12, Byte.valueOf((byte) 0));
		this.getDataWatcher().addObject(13, Byte.valueOf((byte) 0));
		this.getDataWatcher().addObject(14, Byte.valueOf((byte) 0));
	}

	public float getMobMaxHealth() {
		return 16;
	}

	/**
	 * Returns the current armor value as determined by a call to
	 * InventoryPlayer.getTotalArmorValue
	 */
	@Override
	public int getTotalArmorValue() {
		int var1 = super.getTotalArmorValue() + 2;

		if (var1 > 20) {
			var1 = 20;
		}

		return var1;
	}

	/**
	 * Returns true if the newer Entity AI code should be run
	 */
	@Override
	protected boolean isAIEnabled() {
		return true;
	}

	/**
	 * If Animal, checks if the age timer is negative
	 */
	@Override
	public boolean isChild() {
		return this.getDataWatcher().getWatchableObjectByte(12) == 1;
	}

	public void setChild(boolean var1) {
		this.getDataWatcher().updateObject(12, Byte.valueOf((byte) 1));
	}

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	@Override
	protected String getLivingSound() {
		return null;
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	@Override
	protected String getHurtSound() {
		return null;
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	@Override
	protected String getDeathSound() {
		return null;
	}

	/**
	 * Plays step sound at given x, y, z for the entity
	 */
	protected void playStepSound(int var1, int var2, int var3, int var4) {
		this.playSound("mob.zombie.step", 0.15F, 1.0F);
	}

	/**
	 * Returns the item ID for the item the mob drops on death.
	 */
	protected Item getDropItemId() {
		return Items.redstone;
	}


	/**
	 * Get this Entity's EnumCreatureAttribute
	 */
	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEAD;
	}

	@Override
	protected void dropRareDrop(int var1) {
		switch (this.rand.nextInt(3)) {
		case 0:
			this.dropItem(ModItems.applepie, 3);
			break;
		}
	}
}