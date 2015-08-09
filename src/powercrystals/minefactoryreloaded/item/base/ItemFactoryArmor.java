package powercrystals.minefactoryreloaded.item.base;

import cofh.core.item.ItemArmorAdv;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Locale;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import powercrystals.minefactoryreloaded.MFRRegistry;
import powercrystals.minefactoryreloaded.MineFactoryReloadedCore;

public class ItemFactoryArmor extends ItemArmorAdv {

	public static final ItemArmor.ArmorMaterial PLASTIC_ARMOR = EnumHelper.
			addArmorMaterial("plastic", 3, new int[]{1, 2, 2, 1}, 7);

	public ItemFactoryArmor(ItemArmor.ArmorMaterial mat, int type) {
		super(mat, type);
		setMaxStackSize(1);
		String prefix = MineFactoryReloadedCore.armorTextureFolder + mat.name().toLowerCase(Locale.US);
		setArmorTextures(new String[] { prefix + "_layer_1.png", prefix + "_layer_2.png" });
	}

	@Override
	public Item setUnlocalizedName(String name) {
		super.setUnlocalizedName(name);
		MFRRegistry.registerItem(this, getUnlocalizedName());
		return this;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon("minefactoryreloaded:" + getUnlocalizedName());
	}

}
