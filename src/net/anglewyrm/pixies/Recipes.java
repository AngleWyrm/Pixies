package net.anglewyrm.pixies;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes {

	// called from Pixies.init event
	public static void registerRecipes() 
	{
		// glowstone <-> redstone
		GameRegistry.addShapelessRecipe(
				new ItemStack(Items.glowstone_dust), 
				new ItemStack(Items.redstone)
				);
		GameRegistry.addShapelessRecipe(
				new ItemStack(Items.redstone),
				new ItemStack(Items.glowstone_dust) 
				);
		
		// early game sapling bed
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.bed), 
				"   ",
				"SSS",
				"TTT",
				'S', "treeSapling",
				'T', Items.stick));
				
	} // registerRecipes

} // Recipes class
