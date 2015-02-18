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
		items();
		mobs();
	}
	
	private static void blocks()
	{
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.AetherPortal), new int[]{0}, (new AspectList()).add(Aspect.WATER, 4).add(Aspect.TRAVEL, 4));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.AetherDirt), new int[]{0}, (new AspectList()).add(Aspect.EARTH, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.AetherGrass), new int[]{0}, (new AspectList().add(Aspect.PLANT, 1)).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.EnchantedAetherGrass), new int[]{0}, (new AspectList().add(Aspect.PLANT, 1)).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.EnchantedGrass), new int[]{0}, (new AspectList().add(Aspect.PLANT, 1)).add(Aspect.EARTH, 1));
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
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.SkyrootSign), new int[]{0}, (new AspectList()).add(Aspect.TREE, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.HolystoneFurnace), new int[]{0}, (new AspectList()).add(Aspect.EARTH, 3).add(Aspect.ENTROPY, 3).add(Aspect.FIRE, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherBlocks.SkyrootLadder), new int[]{0}, (new AspectList()).add(Aspect.TREE, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.SkyrootBed), new int[]{0}, (new AspectList()).add(Aspect.CRAFT, 3).add(Aspect.CLOTH, 6));
	}
	private static void items()
	{
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.SkyrootSword), new int[]{0}, (new AspectList()).add(Aspect.TREE, 3).add(Aspect.WEAPON, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.SkyrootPickaxe), new int[]{0}, (new AspectList()).add(Aspect.TREE, 3).add(Aspect.MINE, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.SkyrootShovel), new int[]{0}, (new AspectList()).add(Aspect.TREE, 3).add(Aspect.TOOL, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.SkyrootAxe), new int[]{0}, (new AspectList()).add(Aspect.TREE, 3).add(Aspect.TOOL, 1));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.HolystoneSword), new int[]{0}, (new AspectList()).add(Aspect.EARTH, 2).add(Aspect.ENTROPY, 2).add(Aspect.WEAPON, 2).add(Aspect.TREE, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.HolystonePickaxe), new int[]{0}, (new AspectList()).add(Aspect.EARTH, 3).add(Aspect.ENTROPY, 3).add(Aspect.MINE, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.HolystoneShovel), new int[]{0}, (new AspectList()).add(Aspect.TREE, 2).add(Aspect.TOOL, 2).add(Aspect.EARTH, 1).add(Aspect.ENTROPY, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.HolystoneAxe), new int[]{0}, (new AspectList()).add(Aspect.TREE, 3).add(Aspect.EARTH, 3).add(Aspect.ENTROPY, 3).add(Aspect.TOOL, 2));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ZaniteSword), new int[]{0}, (new AspectList()).add(Aspect.CRYSTAL, 5).add(Aspect.WEAPON,3).add(Aspect.TREE, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ZanitePickaxe), new int[]{0}, (new AspectList()).add(Aspect.CRYSTAL, 6).add(Aspect.MINE, 3));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ZaniteShovel), new int[]{0}, (new AspectList()).add(Aspect.CRYSTAL, 4).add(Aspect.TOOL, 3).add(Aspect.TREE, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ZaniteAxe), new int[]{0}, (new AspectList()).add(Aspect.CRYSTAL, 6).add(Aspect.TOOL, 3));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.GravititeSword), new int[]{0}, (new AspectList()).add(Aspect.CRYSTAL, 5).add(Aspect.GREED,5).add(Aspect.WEAPON,4).add(Aspect.TREE, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.GravititePickaxe), new int[]{0}, (new AspectList()).add(Aspect.CRYSTAL, 6).add(Aspect.GREED, 6).add(Aspect.MINE, 4));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.GravititeShovel), new int[]{0}, (new AspectList()).add(Aspect.CRYSTAL, 4).add(Aspect.GREED, 4).add(Aspect.TOOL, 4).add(Aspect.TREE, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.GravititeAxe), new int[]{0}, (new AspectList()).add(Aspect.CRYSTAL, 6).add(Aspect.GREED, 6).add(Aspect.TOOL, 4));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ValkyrieLance), new int[]{0}, (new AspectList()).add(Aspect.METAL, 5).add(Aspect.GREED,5).add(Aspect.WEAPON,4).add(Aspect.TREE, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ValkyriePickaxe), new int[]{0}, (new AspectList()).add(Aspect.METAL, 6).add(Aspect.GREED, 6).add(Aspect.MINE, 4));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ValkyrieShovel), new int[]{0}, (new AspectList()).add(Aspect.METAL, 4).add(Aspect.GREED, 4).add(Aspect.TOOL, 4).add(Aspect.TREE, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ValkyrieAxe), new int[]{0}, (new AspectList()).add(Aspect.METAL, 6).add(Aspect.GREED, 6).add(Aspect.TOOL, 4));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.PigSlayer), new int[]{0}, (new AspectList()).add(Aspect.EARTH, 5).add(Aspect.HUNGER,5).add(Aspect.WEAPON,4).add(Aspect.TREE, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.VampireBlade), new int[]{0}, (new AspectList()).add(Aspect.METAL, 5).add(Aspect.ELDRITCH,5).add(Aspect.WEAPON,4).add(Aspect.TREE, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.FlamingSword), new int[]{0}, (new AspectList()).add(Aspect.METAL, 5).add(Aspect.FIRE,5).add(Aspect.WEAPON,4).add(Aspect.TREE, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.HolySword), new int[]{0}, (new AspectList()).add(Aspect.METAL, 5).add(Aspect.LIGHT,5).add(Aspect.WEAPON,4).add(Aspect.TREE, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.LightningSword), new int[]{0}, (new AspectList()).add(Aspect.METAL, 5).add(Aspect.WEATHER,5).add(Aspect.WEAPON,4).add(Aspect.TREE, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.LightningKnife), new int[]{0}, (new AspectList()).add(Aspect.METAL, 5).add(Aspect.WEATHER,5).add(Aspect.WEAPON,4).add(Aspect.TREE, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.HammerOfNotch), new int[]{0}, (new AspectList()).add(Aspect.METAL, 5).add(Aspect.FLIGHT,5).add(Aspect.WEAPON,4).add(Aspect.TREE, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.CandyCaneSword), new int[]{0}, (new AspectList()).add(Aspect.HUNGER, 5).add(Aspect.LIGHT,5).add(Aspect.WEAPON,4).add(Aspect.TREE, 1));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.DartShooter), new int[]{0,1,2,3}, (new AspectList()).add(Aspect.FLIGHT,2).add(Aspect.WEAPON,3).add(Aspect.TREE, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.Dart), new int[]{0,1,2}, (new AspectList()).add(Aspect.WEAPON,1).add(Aspect.TREE, 3));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.IronBubble), new int[]{0}, (new AspectList()).add(Aspect.METAL,2));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.IronRing), new int[]{0}, (new AspectList()).add(Aspect.METAL,4));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.GoldenRing), new int[]{0}, (new AspectList()).add(Aspect.METAL,4).add(Aspect.GREED,2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ZaniteRing), new int[]{0}, (new AspectList()).add(Aspect.METAL,4));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.IceRing), new int[]{0}, (new AspectList()).add(Aspect.COLD,4));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.IronPendant), new int[]{0}, (new AspectList()).add(Aspect.CLOTH,5).add(Aspect.METAL,1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.GoldenPendant), new int[]{0}, (new AspectList()).add(Aspect.CLOTH,5).add(Aspect.METAL,1).add(Aspect.GREED,2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ZanitePendant), new int[]{0}, (new AspectList()).add(Aspect.CLOTH,5).add(Aspect.METAL,1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.IcePendant), new int[]{0}, (new AspectList()).add(Aspect.CLOTH,5).add(Aspect.COLD,1));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.RegenerationStone), new int[]{0}, (new AspectList()).add(Aspect.LIFE,4));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.PiggieBank), new int[]{0}, (new AspectList()).add(Aspect.EXCHANGE,4));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.GoldenAmber), new int[]{0}, (new AspectList()).add(Aspect.GREED,2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.AechorPetal), new int[]{0}, (new AspectList()).add(Aspect.PLANT,2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.SkyrootStick), new int[]{0}, (new AspectList()).add(Aspect.TREE,1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.AmbrosiumShard), new int[]{0}, (new AspectList()).add(Aspect.LIGHT,1).add(Aspect.CRYSTAL,1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ZaniteGemstone), new int[]{0}, (new AspectList()).add(Aspect.CRYSTAL,1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ContinuumOrb), new int[]{0}, (new AspectList()).add(Aspect.ELDRITCH,2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.SwetJelly), new int[]{0}, (new AspectList()).add(Aspect.FLESH,1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.SkyrootBowl), new int[]{0}, (new AspectList()).add(Aspect.TREE,1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.StomperPop), new int[]{0}, (new AspectList()).add(Aspect.DEATH,2));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.MoaEgg), new int[]{0}, (new AspectList()).add(Aspect.LIFE,2));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.AetherMusicDisc), new int[]{0}, (new AspectList()).add(Aspect.GREED,4).add(Aspect.SENSES,4));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.MoaMusicDisc), new int[]{0}, (new AspectList()).add(Aspect.GREED,4).add(Aspect.SENSES,4));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.AerwhaleMusicDisc), new int[]{0}, (new AspectList()).add(Aspect.GREED,4).add(Aspect.SENSES,4));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.LabyrinthMusicDisc), new int[]{0}, (new AspectList()).add(Aspect.GREED,4).add(Aspect.SENSES,4));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ValkyrieMusicDisc), new int[]{0}, (new AspectList()).add(Aspect.GREED,4).add(Aspect.SENSES,4));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.SkyrootWaterBucket), new int[]{0}, (new AspectList()).add(Aspect.WATER,4).add(Aspect.TREE,8).add(Aspect.VOID,1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.SkyrootPoisonBucket), new int[]{0}, (new AspectList()).add(Aspect.POISON,4).add(Aspect.TREE,8).add(Aspect.VOID,1));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.SkyrootMilkBucket), new int[]{0}, (new AspectList()).add(Aspect.WATER,2).add(Aspect.HUNGER,2).add(Aspect.TREE,8).add(Aspect.HEAL,2).add(Aspect.VOID,1));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.OrbOfArkenzus), new int[]{0}, (new AspectList()).add(Aspect.LIFE,8));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.PinkBabySwet), new int[]{0}, (new AspectList()).add(Aspect.LIFE,8));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.EtherealStone), new int[]{0}, (new AspectList()).add(Aspect.LIFE,8));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.FleetingStone), new int[]{0}, (new AspectList()).add(Aspect.LIFE,8));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.FangrinCapsule), new int[]{0}, (new AspectList()).add(Aspect.LIFE,8));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.DeathSeal), new int[]{0}, (new AspectList()).add(Aspect.LIFE,8));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.KraisithCapsule), new int[]{0}, (new AspectList()).add(Aspect.LIFE,8));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.SoaringStone), new int[]{0}, (new AspectList()).add(Aspect.LIFE,8));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ZaniteHelmet), new int[]{0}, (new AspectList()).add(Aspect.METAL,6).add(Aspect.ARMOR,2));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ZaniteChestplate), new int[]{0}, (new AspectList()).add(Aspect.METAL,6).add(Aspect.ARMOR,5));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ZaniteLeggings), new int[]{0}, (new AspectList()).add(Aspect.METAL,6).add(Aspect.ARMOR,5));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ZaniteBoots), new int[]{0}, (new AspectList()).add(Aspect.METAL,6).add(Aspect.ARMOR,2));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.GravititeHelmet), new int[]{0}, (new AspectList()).add(Aspect.GREED,6).add(Aspect.METAL,6).add(Aspect.ARMOR,3));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.GravititeChestplate), new int[]{0}, (new AspectList()).add(Aspect.GREED,5).add(Aspect.METAL,5).add(Aspect.ARMOR,5));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.GravititeLeggings), new int[]{0}, (new AspectList()).add(Aspect.GREED,6).add(Aspect.METAL,6).add(Aspect.ARMOR,6));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.GravititeBoots), new int[]{0}, (new AspectList()).add(Aspect.GREED,5).add(Aspect.METAL,3).add(Aspect.ARMOR,5));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ObsidianHelmet), new int[]{0}, (new AspectList()).add(Aspect.EARTH,6).add(Aspect.METAL,6).add(Aspect.ARMOR,3));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ObsidianChestplate), new int[]{0}, (new AspectList()).add(Aspect.EARTH,5).add(Aspect.METAL,5).add(Aspect.ARMOR,5));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ObsidianLeggings), new int[]{0}, (new AspectList()).add(Aspect.EARTH,6).add(Aspect.METAL,6).add(Aspect.ARMOR,6));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ObsidianBoots), new int[]{0}, (new AspectList()).add(Aspect.EARTH,5).add(Aspect.METAL,3).add(Aspect.ARMOR,5));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ObsidianHelmet), new int[]{0}, (new AspectList()).add(Aspect.EARTH,6).add(Aspect.METAL,6).add(Aspect.ARMOR,3));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ObsidianChestplate), new int[]{0}, (new AspectList()).add(Aspect.EARTH,5).add(Aspect.METAL,5).add(Aspect.ARMOR,5));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ObsidianLeggings), new int[]{0}, (new AspectList()).add(Aspect.EARTH,6).add(Aspect.METAL,6).add(Aspect.ARMOR,6));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ObsidianBoots), new int[]{0}, (new AspectList()).add(Aspect.EARTH,5).add(Aspect.METAL,3).add(Aspect.ARMOR,5));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.PhoenixHelmet), new int[]{0}, (new AspectList()).add(Aspect.FIRE,6).add(Aspect.METAL,6).add(Aspect.ARMOR,3));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.PhoenixChestplate), new int[]{0}, (new AspectList()).add(Aspect.FIRE,5).add(Aspect.METAL,5).add(Aspect.ARMOR,5));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.PhoenixLeggings), new int[]{0}, (new AspectList()).add(Aspect.FIRE,6).add(Aspect.METAL,6).add(Aspect.ARMOR,6));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.PhoenixBoots), new int[]{0}, (new AspectList()).add(Aspect.FIRE,5).add(Aspect.METAL,3).add(Aspect.ARMOR,5));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.NeptuneHelmet), new int[]{0}, (new AspectList()).add(Aspect.WATER,6).add(Aspect.METAL,6).add(Aspect.ARMOR,3));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.NeptuneChestplate), new int[]{0}, (new AspectList()).add(Aspect.WATER,5).add(Aspect.METAL,5).add(Aspect.ARMOR,5));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.NeptuneLeggings), new int[]{0}, (new AspectList()).add(Aspect.WATER,6).add(Aspect.METAL,6).add(Aspect.ARMOR,6));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.NeptuneBoots), new int[]{0}, (new AspectList()).add(Aspect.WATER,5).add(Aspect.METAL,3).add(Aspect.ARMOR,5));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ValkyrieHelmet), new int[]{0}, (new AspectList()).add(Aspect.AIR,6).add(Aspect.METAL,6).add(Aspect.ARMOR,3));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ValkyrieChestplate), new int[]{0}, (new AspectList()).add(Aspect.AIR,5).add(Aspect.METAL,5).add(Aspect.ARMOR,5));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ValkyrieLeggings), new int[]{0}, (new AspectList()).add(Aspect.AIR,6).add(Aspect.METAL,6).add(Aspect.ARMOR,6));
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.ValkyrieBoots), new int[]{0}, (new AspectList()).add(Aspect.AIR,5).add(Aspect.METAL,3).add(Aspect.ARMOR,5));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(AetherItems.SentryBoots), new int[]{0}, (new AspectList()).add(Aspect.BEAST,5).add(Aspect.METAL,3).add(Aspect.ARMOR,5));	
	}
	
	private static void mobs()
	{
		ThaumcraftApi.registerEntityTag("zephyr", (new AspectList()).add(Aspect.AIR, 2).add(Aspect.FLIGHT, 1));
		ThaumcraftApi.registerEntityTag("cockatrice", (new AspectList()).add(Aspect.POISON, 1).add(Aspect.TAINT, 2).add(Aspect.BEAST, 1));
		ThaumcraftApi.registerEntityTag("swet", (new AspectList()).add(Aspect.SLIME, 1).add(Aspect.TRAP, 1).add(Aspect.MOTION, 1));
		ThaumcraftApi.registerEntityTag("aechorPlant", (new AspectList()).add(Aspect.PLANT, 2).add(Aspect.POISON, 1).add(Aspect.TAINT, 1));
		ThaumcraftApi.registerEntityTag("sentry", (new AspectList()).add(Aspect.MECHANISM, 2).add(Aspect.TRAP, 2).add(Aspect.FIRE, 1));
		ThaumcraftApi.registerEntityTag("mimic", (new AspectList()).add(Aspect.VOID, 2).add(Aspect.MIND, 1).add(Aspect.TRAP, 2));
		ThaumcraftApi.registerEntityTag("phyg", (new AspectList()).add(Aspect.FLIGHT, 2).add(Aspect.MAGIC, 1));
		ThaumcraftApi.registerEntityTag("aerbunny", (new AspectList()).add(Aspect.AIR, 1).add(Aspect.MOTION, 1).add(Aspect.LIFE, 1));
		ThaumcraftApi.registerEntityTag("moa", (new AspectList()).add(Aspect.FLIGHT, 2).add(Aspect.MOTION, 2));
		ThaumcraftApi.registerEntityTag("sheepuff", (new AspectList()).add(Aspect.AIR, 1).add(Aspect.LIFE, 1));
		ThaumcraftApi.registerEntityTag("aerwhale", (new AspectList()).add(Aspect.AIR, 5));
		ThaumcraftApi.registerEntityTag("flyingCow", (new AspectList()).add(Aspect.FLIGHT, 2).add(Aspect.MAGIC, 1));
		ThaumcraftApi.registerEntityTag("slider", (new AspectList()).add(Aspect.ENERGY, 4).add(Aspect.MOTION, 2).add(Aspect.SENSES, 2).add(Aspect.MECHANISM, 2).add(Aspect.ARMOR, 10));
		ThaumcraftApi.registerEntityTag("tempest", (new AspectList()).add(Aspect.WEATHER, 2).add(Aspect.FLIGHT, 1).add(Aspect.DARKNESS, 2));
		ThaumcraftApi.registerEntityTag("trackingGolem", (new AspectList()).add(Aspect.SENSES, 2).add(Aspect.MECHANISM, 2).add(Aspect.ARMOR, 1));
		ThaumcraftApi.registerEntityTag("sentryGolem", (new AspectList()).add(Aspect.SENSES, 2).add(Aspect.MECHANISM, 2).add(Aspect.ARMOR, 1).add(Aspect.CRAFT, 2));
		ThaumcraftApi.registerEntityTag("battleSentry", (new AspectList()).add(Aspect.TRAP, 1).add(Aspect.MECHANISM, 1).add(Aspect.SENSES, 2));
		ThaumcraftApi.registerEntityTag("carrionSprout", (new AspectList()).add(Aspect.PLANT, 2));
		ThaumcraftApi.registerEntityTag("sliderHostMimic", (new AspectList()).add(Aspect.ENERGY, 2).add(Aspect.MOTION, 2).add(Aspect.SENSES, 2).add(Aspect.MECHANISM, 2).add(Aspect.ARMOR, 4));
		ThaumcraftApi.registerEntityTag("labyrinthEye", (new AspectList()).add(Aspect.ENERGY, 2).add(Aspect.MOTION, 2).add(Aspect.SENSES, 2).add(Aspect.MECHANISM, 2).add(Aspect.ARMOR, 4));
		ThaumcraftApi.registerEntityTag("sentryGuardian", (new AspectList()).add(Aspect.ENERGY, 2).add(Aspect.MOTION, 2).add(Aspect.SENSES, 2).add(Aspect.MECHANISM, 2).add(Aspect.ARMOR, 4));
		ThaumcraftApi.registerEntityTag("zephyroo", (new AspectList()).add(Aspect.MOTION, 2).add(Aspect.AIR, 2).add(Aspect.LIFE, 1));
		
		ThaumcraftApi.registerEntityTag("soaringWisp", (new AspectList()).add(Aspect.LIFE, 2));
		ThaumcraftApi.registerEntityTag("fleetingWisp", (new AspectList()).add(Aspect.LIFE, 2));
		ThaumcraftApi.registerEntityTag("etherealWisp", (new AspectList()).add(Aspect.LIFE, 2));
		ThaumcraftApi.registerEntityTag("shadeOfArkenzus", (new AspectList()).add(Aspect.LIFE, 2));
		ThaumcraftApi.registerEntityTag("fangrin", (new AspectList()).add(Aspect.LIFE, 2));
		ThaumcraftApi.registerEntityTag("babyBinkSwet", (new AspectList()).add(Aspect.LIFE, 2));
		ThaumcraftApi.registerEntityTag("kraisith", (new AspectList()).add(Aspect.LIFE, 2));
		ThaumcraftApi.registerEntityTag("nexSpirit", (new AspectList()).add(Aspect.LIFE, 2));
	}
	
}
