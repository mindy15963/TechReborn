package techreborn.compat.jei;

import mezz.jei.api.JEIManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import techreborn.compat.ICompatModule;

public class JEIPlugin implements ICompatModule {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        JEIManager.pluginRegistry.registerPlugin(new TechRebornPlugin());
    }

    @Override
    public void init(FMLInitializationEvent event) {

    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }

    @Override
    public void serverStarting(FMLServerStartingEvent event) {

    }
}