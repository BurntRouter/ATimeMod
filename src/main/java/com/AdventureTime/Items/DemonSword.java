package AdventureTime.Items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import AdventureTime.Main.AdventureTimeMain;


// *REMEBER* Change "ItemPickaxe" to ItemAxe, ItemHoe, ItemSword, etc if you are making those tools!
public class DemonSword extends ItemSword {
	
public DemonSword(int ItemID, EnumToolMaterial material){
super(ItemID, material);
setCreativeTab(AdventureTimeMain.tabATimemain);; }

public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
{
par1ItemStack.damageItem(1, par3EntityLivingBase);
par2EntityLivingBase.addPotionEffect(
new PotionEffect(Potion.blindness.id, 80, 30));
return false;
}



}