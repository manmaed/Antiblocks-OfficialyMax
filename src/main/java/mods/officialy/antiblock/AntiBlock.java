package mods.officialy.antiblock;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("antiblock")
public class AntiBlock {
    public static final CreativeModeTab TAB = new CreativeModeTab("antiblock") {
        public ItemStack makeIcon() {
            return new ItemStack((ItemLike)BlockRegistry.BLACK_BLOCK.get());
        }
    };

    public AntiBlock() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public void clientSetup(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer((Block)BlockRegistry.BLACK_BLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer((Block)BlockRegistry.BLUE_BLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer((Block)BlockRegistry.BROWN_BLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer((Block)BlockRegistry.CYAN_BLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer((Block)BlockRegistry.GRAY_BLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer((Block)BlockRegistry.GREEN_BLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer((Block)BlockRegistry.LIGHT_BLUE_BLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer((Block)BlockRegistry.LIGHT_GRAY_BLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer((Block)BlockRegistry.LIME_BLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer((Block)BlockRegistry.MAGENTA_BLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer((Block)BlockRegistry.ORANGE_BLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer((Block)BlockRegistry.PINK_BLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer((Block)BlockRegistry.PURPLE_BLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer((Block)BlockRegistry.RED_BLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer((Block)BlockRegistry.WHITE_BLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer((Block)BlockRegistry.YELLOW_BLOCK.get(), RenderType.cutout());
    }
}
