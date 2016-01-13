package com.xpownage.rpgmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CustomItem extends Item {
	public CustomItem(String name, CreativeTabs creativetab, int maxstacksize) {
		this.setUnlocalizedName(name);
		this.setCreativeTab(creativetab);
		this.setMaxStackSize(maxstacksize);

		System.out.println("INITIALIZING ITEM: " + name);

		GameRegistry.registerItem(this, name);
	}

	public void RegisterRenderer(String modelName) {
		System.out.println("REGISTERING ITEM RENDERER: " + modelName);

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(this, 0,
				new ModelResourceLocation(Main.MODID + ":" + modelName, "inventory"));
	}
}
