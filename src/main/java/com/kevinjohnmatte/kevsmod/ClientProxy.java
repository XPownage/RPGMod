package com.kevinjohnmatte.kevsmod;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy 
{	
	@Override
	public void preInit(FMLPreInitializationEvent e)
	{
		super.preInit(e);
	}

	@Override
	public void init(FMLInitializationEvent e)
	{
		super.init(e);		
		
		//Blocks
		
		Main.Tin_Ore.RegisterRenderer("tin_ore");
		Main.Copper_Ore.RegisterRenderer("copper_ore");
		Main.Pure_Essence_Ore.RegisterRenderer("pure_essence");
		Main.Rune_Essence_Ore.RegisterRenderer("rune_essence");
		Main.Mithril_Ore.RegisterRenderer("mithril_ore");
		Main.Adamantite_Ore.RegisterRenderer("adamantite_ore");
		Main.Runite_Ore.RegisterRenderer("runite_ore");
		Main.Silver_Ore.RegisterRenderer("silver_ore");
		
		
		//Items
		
		Main.Runite.RegisterRenderer("runite");
		Main.Adamantite.RegisterRenderer("adamantite");
		
		
		
	}

	@Override
	public void postInit(FMLPostInitializationEvent e)
	{
		super.postInit(e);
	}
}