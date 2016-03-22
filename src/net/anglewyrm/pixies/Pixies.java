package net.anglewyrm.pixies;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Constants.modid, name = Constants.name, version = Constants.version)
public class Pixies {

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		Constants.getMetadata(event);
	}
	
    @EventHandler
    public void init(FMLInitializationEvent event){
    	Recipes.registerRecipes();		
	}
    
    public String Version(){
    	return Constants.version;
    }
}
