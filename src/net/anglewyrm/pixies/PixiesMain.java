package net.anglewyrm.pixies;

import org.apache.logging.log4j.Logger;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Constants.modid, name = Constants.name, version = Constants.version)
public class PixiesMain {
	
    @EventHandler
    public void init(FMLInitializationEvent event){
    	Recipes.registerRecipes();		
	}
    
    public String Version(){
    	return Constants.version;
    }
}
