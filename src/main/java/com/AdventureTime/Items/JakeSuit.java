package com.AdventureTime.Items;

import com.AdventureTime.Main.ModCreativeTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class JakeSuit extends ItemArmor {
	public ArmorMaterial mat;
	private String texturePath = "adventuretime:jakesuit";

	public JakeSuit(ArmorMaterial jakearmor,
			int par3, int par4, String name) {
		super(jakearmor, par3, par4);
		mat = jakearmor;
		mat.getDamageReductionAmount(par4);
		setMaxDamage(mat.getDurability(par4));
		maxStackSize = 1;
		this.setTextureName(name, par4);
		this.setCreativeTab(ModCreativeTabs.tabATime);
	}

	public void setTextureName(String type, int armorPart) {
		if (armorType == 0 || armorType == 1 || armorType == 3) {
			this.texturePath += type + "_layer_1";
		} else {
			this.texturePath += type + "_layer_2";
		}
	}
	public String getArmorTexture(ItemStack stack, Entity ent, int slot,
			int layer) {
		return texturePath;
	}

}
