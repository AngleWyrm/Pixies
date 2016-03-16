package net.anglewyrm.pixies;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Constants.modid, name = Constants.name, version = Constants.version)
public class PixiesMain {
	
	// TODO: singletons to Constants.java
	
    @EventHandler
    public void init(FMLInitializationEvent event){
    	// TODO: Logger
		System.out.println("Messaged from PixiesMain startup");
	}

}
