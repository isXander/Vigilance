package club.sk1er.vigilance.example

import club.sk1er.elementa.effects.StencilEffect
import net.minecraft.client.Minecraft
//#if MC<=11202
import net.minecraft.client.gui.GuiScreen
import net.minecraftforge.client.ClientCommandHandler
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.fml.common.gameevent.TickEvent
//#else
//$$ import net.minecraftforge.eventbus.api.SubscribeEvent;
//$$ import  net.minecraftforge.event.TickEvent;
//$$ import net.minecraftforge.common.MinecraftForge
//$$ import net.minecraftforge.fml.common.Mod
//$$ import net.minecraft.client.gui.screen.Screen
//$$ import club.sk1er.mods.core.universal.UniversalMinecraft
//$$ import club.sk1er.vigilance.gui.SettingsGui
//$$ import java.util.UUID
//#endif

//#if MC<=11202
@Mod(modid = ExampleMod.MOD_ID, version = ExampleMod.MOD_VERSION)
//#else
//$$ @Mod(value = ExampleMod.MOD_ID)
//$$
//#endif
class ExampleMod {
    //#if MC<=11202
    @Mod.EventHandler
    fun init(event: FMLInitializationEvent) {
        StencilEffect.enableStencil()

        ExampleConfig.preload()
        MinecraftForge.EVENT_BUS.register(this)
        ClientCommandHandler.instance.registerCommand(ExampleCommand())
    }
    //#else
    //$$ init {
    //$$     StencilEffect.enableStencil()
    //$$     MinecraftForge.EVENT_BUS.register(this)
    //$$ }
    //#endif

    @SubscribeEvent
    fun tick(event: TickEvent.ClientTickEvent) {
        //#if MC>11500
        //$$ if(UniversalMinecraft.getWorld() !=null && UniversalMinecraft.getMinecraft().currentScreen == null) {
        //$$            ExampleConfig.randomData = UUID.randomUUID().toString()
        //$$    ExampleMod.gui = SettingsGui(ExampleConfig)
        //$$      }
        //#endif
        if (gui != null) {
            Minecraft.getMinecraft().displayGuiScreen(gui)
            gui = null
        }
    }

    companion object {
        const val MOD_ID = "examplemod2"
        const val MOD_VERSION = "1.0"
        var gui: GuiScreen? = null
    }
}