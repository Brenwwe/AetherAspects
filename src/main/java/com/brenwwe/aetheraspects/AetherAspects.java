package com.brenwwe.aetheraspects;

import com.brenwwe.aetheraspects.aspects.ThaumcraftAspects;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = AetherAspects.MOD_ID, name = "Aether Aspects", version = AetherAspects.VERSION, dependencies = "required-after:aether;required-after:Thaumcraft")
public class AetherAspects
{
	public static final String MOD_ID = "AetherAspects";

	public static final String VERSION = "Alpha 1.7.10-1.1";
	
	@Instance(AetherAspects.MOD_ID)
	public static AetherAspects instance;
	
	/**
	 * Used to represent that a particular ResourceLocation is assigned to the AetherAspects mod.
	 * @return The appropriate address for the AetherAspects mod
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
	
	@SidedProxy(clientSide = "com.brenwwe.aetheraspects.ClientProxy", serverSide = "com.brenwwe.aetheraspects.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		ThaumcraftAspects.init();
	}

}
