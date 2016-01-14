package com.xpownage.rpgmod;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import net.minecraft.init.Blocks;
import net.minecraft.block.Block;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {

	}

	public void init(FMLInitializationEvent e) {

		// Blocks

		Main.Copper_Ore = new CustomBlock(Material.rock, "Copper_Ore", 3.0F, 5.0F, CustomBlock.HarvestToolEnum.PICKAXE,
				CustomBlock.HarvestLevelEnum.IRON, CreativeTabs.tabBlock, 1, 6, 15, 10, 32, 128, true, false, false);
		Main.Tin_Ore = new CustomBlock(Material.rock, "Tin_Ore", 3.0F, 5.0F, CustomBlock.HarvestToolEnum.PICKAXE,
				CustomBlock.HarvestLevelEnum.IRON, CreativeTabs.tabBlock, 1, 6, 15, 10, 32, 128, true, false, false);
		Main.Rune_Essence_Ore = new CustomBlock(Material.rock, "Rune_Essence", 3.0F, 5.0F,
				CustomBlock.HarvestToolEnum.PICKAXE, CustomBlock.HarvestLevelEnum.IRON, CreativeTabs.tabBlock, 1, 6, 15,
				10, 32, 128, true, false, false);
		Main.Pure_Essence_Ore = new CustomBlock(Material.rock, "Pure_Essence", 3.0F, 5.0F,
				CustomBlock.HarvestToolEnum.PICKAXE, CustomBlock.HarvestLevelEnum.IRON, CreativeTabs.tabBlock, 1, 6, 15,
				10, 32, 128, true, false, false);
		Main.Mithril_Ore = new CustomBlock(Material.rock, "Mithril_Ore", 3.0F, 5.0F,
				CustomBlock.HarvestToolEnum.PICKAXE, CustomBlock.HarvestLevelEnum.IRON, CreativeTabs.tabBlock, 1, 6, 15,
				10, 32, 128, true, false, false);
		Main.Adamantite_Ore = new CustomBlock(Material.rock, "Adamantite_Ore", 3.0F, 5.0F,
				CustomBlock.HarvestToolEnum.PICKAXE, CustomBlock.HarvestLevelEnum.IRON, CreativeTabs.tabBlock, 1, 6, 15,
				10, 32, 128, true, false, false);
		Main.Runite_Ore = new CustomBlock(Material.rock, "Runite_Ore", 3.0F, 5.0F, CustomBlock.HarvestToolEnum.PICKAXE,
				CustomBlock.HarvestLevelEnum.IRON, CreativeTabs.tabBlock, 1, 6, 15, 10, 32, 128, true, false, false);
		Main.Silver_Ore = new CustomBlock(Material.rock, "Silver_Ore", 3.0F, 5.0F, CustomBlock.HarvestToolEnum.PICKAXE,
				CustomBlock.HarvestLevelEnum.IRON, CreativeTabs.tabBlock, 1, 6, 15, 10, 32, 128, true, false, false);

		// Items

		Main.Runite = new CustomItem("runite", CreativeTabs.tabMaterials, 1);
		Main.Adamantite = new CustomItem("adamantite", CreativeTabs.tabMaterials, 1);
		Main.Bronze = new CustomItem("bronze", CreativeTabs.tabMaterials, 1);
		Main.Silver = new CustomItem("silver", CreativeTabs.tabMaterials, 1);
		Main.Mithril = new CustomItem("mithril", CreativeTabs.tabMaterials, 1);

		//ItemOre
		
		Main.RuniteOre = new CustomItem("runiteore", CreativeTabs.tabMaterials, 1);
		Main.AdamantiteOre = new CustomItem("adamantiteore", CreativeTabs.tabMaterials, 1);
		Main.Rune_EssenceOre = new CustomItem("runeore", CreativeTabs.tabMaterials, 1);
		Main.Pure_EssenceOre = new CustomItem("pureore", CreativeTabs.tabMaterials, 1);
		Main.TinOre = new CustomItem("tinore", CreativeTabs.tabMaterials, 1);
		Main.CopperOre = new CustomItem("copperore", CreativeTabs.tabMaterials, 1);
		Main.SilverOre = new CustomItem("silverore", CreativeTabs.tabMaterials, 1);
		Main.MithrilOre = new CustomItem("mithrilore", CreativeTabs.tabMaterials, 1);
		
		
		
	}

	public void postInit(FMLPostInitializationEvent e) {

	}
}
