package com.brenwwe.aetheraspects.aspects;

import net.aetherteam.aether.blocks.AetherBlocks;
import net.aetherteam.aether.items.AetherItems;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;


public class ThaumcraftAspects
{
	public static void init()
	{
		blocks();
	}
	
	public static void blocks()
	{
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.AetherPortal), new int[]{0}, (new AspectList()).add(Aspect.WATER, 4).add(Aspect.TRAVEL, 4));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.AetherDirt), new int[]{0}, (new AspectList()).add(Aspect.EARTH, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.AetherDirt), new int[]{0}, (new AspectList().add(Aspect.PLANT, 1)).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.Quicksoil), new int[]{0}, (new AspectList()).add(Aspect.MOTION, 1).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.Holystone), new int[]{0}, (new AspectList()).add(Aspect.ENTROPY, 1).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.Icestone), new int[]{0}, (new AspectList()).add(Aspect.COLD, 1).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.Aercloud), new int[]{0}, (new AspectList()).add(Aspect.FLIGHT, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.Aercloud), new int[]{1,2,3,5}, (new AspectList()).add(Aspect.FLIGHT, 1).add(Aspect.MOTION, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.Aercloud), new int[]{0}, (new AspectList()).add(Aspect.FLIGHT, 1).add(Aspect.WEATHER, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.Aerogel), new int[]{0}, (new AspectList()).add(Aspect.WATER, 2).add(Aspect.FIRE, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.Altar), new int[]{0}, (new AspectList()).add(Aspect.GREED, 2).add(Aspect.EARTH, 3));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.Incubator), new int[]{0}, (new AspectList()).add(Aspect.LIGHT, 2).add(Aspect.TREE, 3).add(Aspect.EARTH, 3));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.AetherLog), new int[]{0}, (new AspectList()).add(Aspect.TREE, 4));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.AetherLog), new int[]{1}, (new AspectList()).add(Aspect.GREED, 2).add(Aspect.TREE, 4));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.SkyrootPlank), new int[]{0}, (new AspectList()).add(Aspect.TREE, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.GreenSkyrootLeaves), new int[]{0}, (new AspectList()).add(Aspect.TREE, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.GoldenOakLeaves), new int[]{0}, (new AspectList()).add(Aspect.TREE, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.GreenSkyrootSapling), new int[]{0}, (new AspectList()).add(Aspect.TREE, 1).add(Aspect.PLANT, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.GoldenOakSapling), new int[]{0}, (new AspectList()).add(Aspect.TREE, 1).add(Aspect.PLANT, 1).add(Aspect.GREED, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.AmbrosiumOre), new int[]{0}, (new AspectList()).add(Aspect.LIGHT, 1).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.AmbrosiumTorch), new int[]{0}, (new AspectList()).add(Aspect.LIGHT, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.ZaniteOre), new int[]{0}, (new AspectList()).add(Aspect.METAL, 3).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.GravititeOre), new int[]{0}, (new AspectList()).add(Aspect.METAL, 3).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.EnchantedGravitite), new int[]{0}, (new AspectList()).add(Aspect.METAL, 3).add(Aspect.GREED, 2).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.Trap), new int[]{0}, (new AspectList()).add(Aspect.EARTH, 4).add(Aspect.TRAP, 4));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.SkyrootChestMimic), new int[]{0}, (new AspectList()).add(Aspect.VOID, 4).add(Aspect.TREE, 3).add(Aspect.TRAP, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.DungeonStone), new int[]{0}, (new AspectList()).add(Aspect.EARTH, 4));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.DivineDungeonStone), new int[]{0}, (new AspectList()).add(Aspect.MAGIC, 2).add(Aspect.EARTH, 4));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.DivineLightDungeonStone), new int[]{0}, (new AspectList()).add(Aspect.MAGIC, 2).add(Aspect.LIGHT, 2).add(Aspect.EARTH, 4));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.DivineLightDungeonStone), new int[]{0}, (new AspectList()).add(Aspect.MAGIC, 2).add(Aspect.LIGHT, 2).add(Aspect.EARTH, 4));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.WhiteGoldPillar), new int[]{0,1,3,4}, (new AspectList()).add(Aspect.EARTH, 4));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.ZaniteBlock), new int[]{0,1,3,4}, (new AspectList()).add(Aspect.METAL, 8));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.QuicksoilGlass), new int[]{0}, (new AspectList()).add(Aspect.MOTION, 1).add(Aspect.CRYSTAL, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.QuicksoilGlassPane), new int[]{0}, (new AspectList()).add(Aspect.MOTION, 1).add(Aspect.CRYSTAL, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.WhiteRose), new int[]{0}, (new AspectList()).add(Aspect.PLANT, 1).add(Aspect.LIFE, 1).add(Aspect.SENSES, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.PurpleFlower), new int[]{0}, (new AspectList()).add(Aspect.PLANT, 1).add(Aspect.LIFE, 1).add(Aspect.SENSES, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.Present), new int[]{0}, (new AspectList()).add(Aspect.TRAP, 3));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.BerryBush), new int[]{0}, (new AspectList()).add(Aspect.PLANT, 3).add(Aspect.HUNGER, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.BerryBushStem), new int[]{0}, (new AspectList()).add(Aspect.PLANT, 4));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.HolystoneStairs), new int[]{0}, (new AspectList()).add(Aspect.ENTROPY, 1).add(Aspect.EARTH, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.MossyHolystoneStairs), new int[]{0}, (new AspectList()).add(Aspect.EARTH, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.IcestoneStairs), new int[]{0}, (new AspectList()).add(Aspect.COLD, 2).add(Aspect.EARTH, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.SkyrootStairs), new int[]{0}, (new AspectList()).add(Aspect.TREE, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.CarvedStairs), new int[]{0}, (new AspectList()).add(Aspect.EARTH, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.HolystoneWall), new int[]{0}, (new AspectList()).add(Aspect.ENTROPY, 1).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.MossyHolystoneWall), new int[]{0}, (new AspectList()).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.IcestoneWall), new int[]{0}, (new AspectList()).add(Aspect.COLD, 1).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.CarvedWall), new int[]{0}, (new AspectList()).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.HolystoneWall), new int[]{0}, (new AspectList()).add(Aspect.EARTH, 4));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.SkyrootLogWall), new int[]{0}, (new AspectList()).add(Aspect.TREE, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.TallAetherGrass), new int[]{0}, (new AspectList()).add(Aspect.PLANT, 1).add(Aspect.AIR, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.DarkBlueSkyrootLeaves), new int[]{0}, (new AspectList()).add(Aspect.PLANT, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.BlueSkyrootLeaves), new int[]{0}, (new AspectList()).add(Aspect.PLANT, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.DarkBlueSkyrootSapling), new int[]{0}, (new AspectList()).add(Aspect.TREE, 1).add(Aspect.PLANT, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.BlueSkyrootSapling), new int[]{0}, (new AspectList()).add(Aspect.TREE, 1).add(Aspect.PLANT, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.SkyrootChest), new int[]{0}, (new AspectList()).add(Aspect.VOID, 4).add(Aspect.TREE, 3));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.SliderLabyrinthDoor), new int[]{0}, (new AspectList()).add(Aspect.MECHANISM, 2).add(Aspect.MOTION, 1).add(Aspect.MAGIC, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.PurpleCrystalSapling), new int[]{0}, (new AspectList()).add(Aspect.TREE, 1).add(Aspect.PLANT, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.PurpleCrystalLeaves), new int[]{0}, (new AspectList()).add(Aspect.PLANT, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.PurpleFruitLeaves), new int[]{0}, (new AspectList()).add(Aspect.HUNGER, 1).add(Aspect.PLANT, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.BlockOrangeTree), new int[]{0}, (new AspectList()).add(Aspect.HUNGER, 1).add(Aspect.PLANT, 3));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.ContinuumOre), new int[]{0}, (new AspectList()).add(Aspect.METAL, 3).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.SkyrootCraftingTable), new int[]{0}, (new AspectList()).add(Aspect.CRAFT, 4).add(Aspect.TREE, 3));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.BloodMossHolystone), new int[]{0}, (new AspectList()).add(Aspect.ENTROPY, 1).add(Aspect.EARTH, 1).add(Aspect.FLESH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.DivineCarvedWall), new int[]{0}, (new AspectList()).add(Aspect.MAGIC, 1).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.DivineCarvedStairs), new int[]{0}, (new AspectList()).add(Aspect.MAGIC, 2).add(Aspect.EARTH, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.ColdFire), new int[]{0}, (new AspectList()).add(Aspect.COLD, 4).add(Aspect.FIRE, 4));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.SkyrootDoor), new int[]{0}, (new AspectList()).add(Aspect.TREE, 8).add(Aspect.MECHANISM, 2).add(Aspect.MOTION, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.SkyrootTrapDoor), new int[]{0}, (new AspectList()).add(Aspect.TREE, 2).add(Aspect.MOTION, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.SkyrootBookshelf), new int[]{0}, (new AspectList()).add(Aspect.TREE, 4).add(Aspect.MIND, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.SkyrootBed), new int[]{0}, (new AspectList()).add(Aspect.TREE, 2).add(Aspect.CLOTH, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.SkyrootSign), new int[]{0}, (new AspectList()).add(Aspect.TREE, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.SkyrootSignWall), new int[]{0}, (new AspectList()).add(Aspect.TREE, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.SkyrootSign), new int[]{0}, (new AspectList()).add(Aspect.TREE, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.HolystoneFurnace), new int[]{0}, (new AspectList()).add(Aspect.EARTH, 4).add(Aspect.ENERGY, 2));
		
		
		
		
		
		
	}
	
}
