package net.anglewyrm.pixies;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Recipes {

	public static void registerRecipes() 
	{
		// Pixie Book
		GameRegistry.addRecipe( new ItemStack(Constants.pixieBook),
				new Object[]{
						"BM", 'B',Item.itemRegistry.getObject("book"), 
						      'M',Item.itemRegistry.getObject("mushroom")
				});
		
		/* Pixie Dust
		GameRegistry.addRecipe( new ItemStack(PixiesMain.townHall), new Object[]{
				"BIB","ICI","BIB", 'B',Item.book, 'I',Item.ingotIron, 'C',BlockContainer.chest});
		*/
	
	}

}
