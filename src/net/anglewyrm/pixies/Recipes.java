package net.anglewyrm.pixies;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

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
		/*
		GameRegistry.addRecipe(new ItemStack(Items.redstone), new Object[]
				{
			"G", 
			'G', Items.iron_ingot
				});		// redstone -> glowstone
		*/
		// sapling bed
		
	} // registerRecipes

} // Recipes class
