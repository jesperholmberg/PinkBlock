package PinkBlock;

{@Mod(modId="PinkBlock",
		name="Pink Block Mod",
		version="1.1", 
		dependencies = "required-after:forge@[13.20.0.2222,);")
public class PinkBlock {
    // Populate this field with the instance of the mod created by FML
    @Instance("PinkBlock")
    public PinkBlock instance;

    // Mark this method for receiving an FMLEvent (in this case, it's the FMLPreInitializationEvent)
    @EventHandler public void preInit(FMLPreInitializationEvent event)
    {
        // Do stuff in pre-init phase (read config, create blocks and items, register them)
    }
    
    public void
}
}
/*

package mymod;
// Declare that this is a mod with modId "MyModId", name "My example mod", version "1.0" and dependency on FML.
{@Mod(modId="MyModId",name="My example mod",version="1.0",dependencies="required-after:FML")
public class MyMod {
     // Populate this field with the instance of the mod created by FML
     @Instance("MyModId")
     public MyMod instance;

     // Mark this method for receiving an FMLEvent (in this case, it's the FMLPreInitializationEvent)
     @EventHandler public void preInit(FMLPreInitializationEvent event)
     {
         // Do stuff in pre-init phase (read config, create blocks and items, register them)
     }
}
}
*/