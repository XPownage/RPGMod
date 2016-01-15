package com.xpownage.rpgmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION, dependencies = "required-after:FML")
public class Main {
	public static final String MODID = "Runescape Remake";
	public static final String MODNAME = "RPG MMO Mod";
	public static final String VERSION = "1.0";

	@Instance(value = MODID)
	public static Main instance;

	@SidedProxy(modId = MODID, clientSide = "com.xpownage.rpgmod.ClientProxy", serverSide = "com.xpownage.rpgmod.ServerProxy")
	public static CommonProxy proxy;
	
	//Blocks
	
	public static CustomBlock Runite_Ore;
	public static CustomBlock Adamantite_Ore;
	public static CustomBlock Rune_Essence_Ore;
	public static CustomBlock Pure_Essence_Ore;
	public static CustomBlock Tin_Ore;
	public static CustomBlock Copper_Ore;
	public static CustomBlock Mithril_Ore;
	public static CustomBlock Silver_Ore;
	
	//Items
	
	public static CustomItem Runite;
	public static CustomItem Bronze;
	public static CustomItem Silver;
	public static CustomItem Mithril;
	public static CustomItem Adamantite;
	
	//ItemOre 
	
	public static CustomItem RuniteOre; 
	public static CustomItem AdamantiteOre; 
	public static CustomItem Rune_EssenceOre;
	public static CustomItem Pure_EssenceOre;
	public static CustomItem TinOre;
	public static CustomItem CopperOre; 
	public static CustomItem MithrilOre;
	public static CustomItem SilverOre;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
}
