package com.brenwwe.aetheraspects;

import com.brenwwe.aetheraspects.aspects.ThaumcraftAspects;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = AetherAspects.MOD_ID, name = "Aether Aspects", version = AetherAspects.VERSION, dependencies = "required-after:aether;required-after:Thaumcraft")
public class AetherAspects
{
	public static final String MOD_ID = "AetherAspects";

	public static final String VERSION = "Alpha 1.7.10-1.0";
	
	@Instance(AetherAspects.MOD_ID)
	public static AetherAspects instance;
	
	/**
	 * Used to represent that a particular ResourceLocation is assigned to the Aether mod.
	 * @return The appropriate address for the Aether mod
	 */
	public static String modAddress()
	{
		return AetherAspects.MOD_ID + ":";
	}
	
	/* AetherAspects Instance */
	public static AetherAspects getInstance()
	{
		return instance;
	}
	
	@SidedProxy(clientSide = "net.aetherteam.aether.client.ClientProxy", serverSide = "net.aetherteam.aether.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		ThaumcraftAspects.init();
	}

}
