package com.AdventureTime.Items;

import com.AdventureTime.Main.ModCreativeTabs;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;


// *REMEBER* Change "ItemPickaxe" to ItemAxe, ItemHoe, ItemSword, etc if you are making those tools!
public class DemonSword extends ItemSword {
	
public DemonSword(ToolMaterial material){
super(material);
setCreativeTab(ModCreativeTabs.tabATime); }

public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
{
par1ItemStack.damageItem(1, par3EntityLivingBase);
par2EntityLivingBase.addPotionEffect(
new PotionEffect(Potion.blindness.id, 80, 30));
return false;
}



}