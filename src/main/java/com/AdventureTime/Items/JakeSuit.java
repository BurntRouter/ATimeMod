package com.AdventureTime.Items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class JakeSuit extends ItemArmor {
	public ArmorMaterial mat;
	private String texturePath = "adventuretime:textures/model/armor/";

	public JakeSuit(int par1, ArmorMaterial par2EnumArmorMaterial,
			int par3, int par4, String name) {
		super(par2EnumArmorMaterial, par3, par4);
		mat = par2EnumArmorMaterial;
		mat.getDamageReductionAmount(par4);
		setMaxDamage(mat.getDurability(par4));
		maxStackSize = 1;
		this.setTextureName(name, par4);
	}

	public void setTextureName(String type, int armorPart) {
		if (armorType == 0 || armorType == 1 || armorType == 3) {
			this.texturePath += type + "_layer_1.png";
		} else {
			this.texturePath += type + "_layer_2.png";
		}
	}

	public String getArmorTexture(ItemStack stack, Entity ent, int slot,
			int layer) {
		return texturePath;
	}

}
