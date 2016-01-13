package com.kevinjohnmatte.kevsmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION, dependencies = "required-after:FML")
public class Main 
{
	public static final String MODID = "kevsmod";
	public static final String MODNAME = "Kevins Mod";
	public static final String VERSION = "1.0";
		
	@Instance(value = MODID)
	public static Main instance;
	
	@SidedProxy(modId=MODID, clientSide="com.kevinjohnmatte.kevsmod.ClientProxy", serverSide="com.kevinjohnmatte.kevsmod.ServerProxy")
	public static CommonProxy proxy;
	
	public static CustomBlock Runite_Ore;
	public static CustomBlock Adamantite_Ore;
	public static CustomBlock Rune_Essence_Ore;
	public static CustomBlock Pure_Essence_Ore;
	public static CustomBlock Tin_Ore;
	public static CustomBlock Copper_Ore;
	public static CustomBlock Mithril_Ore;
	public static CustomBlock Silver_Ore;
	public static CustomItem Runite; 
	public static CustomItem Bronze;
	public static CustomItem Silver; 
	public static CustomItem Mithril;
	public static CustomItem Adamantite; 
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) 
	{
		proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) 
	{
		proxy.postInit(e);
	}
}
