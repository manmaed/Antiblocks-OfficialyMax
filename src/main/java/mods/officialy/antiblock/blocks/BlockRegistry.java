package mods.officialy.antiblock.blocks;

import mods.officialy.antiblock.AntiBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS;
    public static final DeferredRegister<Item> ITEMS;
    public static final RegistryObject<AntiBlockBlock> BLACK_BLOCK;
    public static final RegistryObject<AntiBlockBlock> BLUE_BLOCK;
    public static final RegistryObject<AntiBlockBlock> BROWN_BLOCK;
    public static final RegistryObject<AntiBlockBlock> CYAN_BLOCK;
    public static final RegistryObject<AntiBlockBlock> GRAY_BLOCK;
    public static final RegistryObject<AntiBlockBlock> GREEN_BLOCK;
    public static final RegistryObject<AntiBlockBlock> LIGHT_BLUE_BLOCK;
    public static final RegistryObject<AntiBlockBlock> LIGHT_GRAY_BLOCK;
    public static final RegistryObject<AntiBlockBlock> LIME_BLOCK;
    public static final RegistryObject<AntiBlockBlock> MAGENTA_BLOCK;
    public static final RegistryObject<AntiBlockBlock> ORANGE_BLOCK;
    public static final RegistryObject<AntiBlockBlock> PINK_BLOCK;
    public static final RegistryObject<AntiBlockBlock> PURPLE_BLOCK;
    public static final RegistryObject<AntiBlockBlock> RED_BLOCK;
    public static final RegistryObject<AntiBlockBlock> YELLOW_BLOCK;
    public static final RegistryObject<AntiBlockBlock> WHITE_BLOCK;
    public static final RegistryObject<BlockItem> BLACK_BLOCK_ITEM;
    public static final RegistryObject<BlockItem> BLUE_BLOCK_ITEM;
    public static final RegistryObject<BlockItem> BROWN_BLOCK_ITEM;
    public static final RegistryObject<BlockItem> CYAN_BLOCK_ITEM;
    public static final RegistryObject<BlockItem> GRAY_BLOCK_ITEM;
    public static final RegistryObject<BlockItem> GREEN_BLOCK_ITEM;
    public static final RegistryObject<BlockItem> LIGHT_BLUE_BLOCK_ITEM;
    public static final RegistryObject<BlockItem> LIGHT_GRAY_BLOCK_ITEM;
    public static final RegistryObject<BlockItem> LIME_BLOCK_ITEM;
    public static final RegistryObject<BlockItem> MAGENTA_BLOCK_ITEM;
    public static final RegistryObject<BlockItem> ORANGE_BLOCK_ITEM;
    public static final RegistryObject<BlockItem> PINK_BLOCK_ITEM;
    public static final RegistryObject<BlockItem> PURPLE_BLOCK_ITEM;
    public static final RegistryObject<BlockItem> RED_BLOCK_ITEM;
    public static final RegistryObject<BlockItem> YELLOW_BLOCK_ITEM;
    public static final RegistryObject<BlockItem> WHITE_BLOCK_ITEM;

    public BlockRegistry() {
    }

    static {
        BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "antiblock");
        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "antiblock");
        BLACK_BLOCK = BLOCKS.register("black_antiblock", () -> {
            return new AntiBlockBlock(MaterialColor.COLOR_BLACK);
        });
        BLUE_BLOCK = BLOCKS.register("blue_antiblock", () -> {
            return new AntiBlockBlock(MaterialColor.COLOR_BLUE);
        });
        BROWN_BLOCK = BLOCKS.register("brown_antiblock", () -> {
            return new AntiBlockBlock(MaterialColor.COLOR_BROWN);
        });
        CYAN_BLOCK = BLOCKS.register("cyan_antiblock", () -> {
            return new AntiBlockBlock(MaterialColor.COLOR_CYAN);
        });
        GRAY_BLOCK = BLOCKS.register("gray_antiblock", () -> {
            return new AntiBlockBlock(MaterialColor.COLOR_GRAY);
        });
        GREEN_BLOCK = BLOCKS.register("green_antiblock", () -> {
            return new AntiBlockBlock(MaterialColor.COLOR_GREEN);
        });
        LIGHT_BLUE_BLOCK = BLOCKS.register("light_blue_antiblock", () -> {
            return new AntiBlockBlock(MaterialColor.COLOR_LIGHT_BLUE);
        });
        LIGHT_GRAY_BLOCK = BLOCKS.register("light_gray_antiblock", () -> {
            return new AntiBlockBlock(MaterialColor.COLOR_LIGHT_GRAY);
        });
        LIME_BLOCK = BLOCKS.register("lime_antiblock", () -> {
            return new AntiBlockBlock(MaterialColor.COLOR_LIGHT_GREEN);
        });
        MAGENTA_BLOCK = BLOCKS.register("magenta_antiblock", () -> {
            return new AntiBlockBlock(MaterialColor.COLOR_MAGENTA);
        });
        ORANGE_BLOCK = BLOCKS.register("orange_antiblock", () -> {
            return new AntiBlockBlock(MaterialColor.COLOR_ORANGE);
        });
        PINK_BLOCK = BLOCKS.register("pink_antiblock", () -> {
            return new AntiBlockBlock(MaterialColor.COLOR_PINK);
        });
        PURPLE_BLOCK = BLOCKS.register("purple_antiblock", () -> {
            return new AntiBlockBlock(MaterialColor.COLOR_PURPLE);
        });
        RED_BLOCK = BLOCKS.register("red_antiblock", () -> {
            return new AntiBlockBlock(MaterialColor.COLOR_RED);
        });
        YELLOW_BLOCK = BLOCKS.register("yellow_antiblock", () -> {
            return new AntiBlockBlock(MaterialColor.COLOR_YELLOW);
        });
        WHITE_BLOCK = BLOCKS.register("white_antiblock", () -> {
            return new AntiBlockBlock(MaterialColor.TERRACOTTA_WHITE);
        });
        BLACK_BLOCK_ITEM = ITEMS.register("black_antiblock", () -> {
            return new BlockItem((Block)BLACK_BLOCK.get(), (new Item.Properties()).tab(AntiBlock.TAB));
        });
        BLUE_BLOCK_ITEM = ITEMS.register("blue_antiblock", () -> {
            return new BlockItem((Block)BLUE_BLOCK.get(), (new Item.Properties()).tab(AntiBlock.TAB));
        });
        BROWN_BLOCK_ITEM = ITEMS.register("brown_antiblock", () -> {
            return new BlockItem((Block)BROWN_BLOCK.get(), (new Item.Properties()).tab(AntiBlock.TAB));
        });
        CYAN_BLOCK_ITEM = ITEMS.register("cyan_antiblock", () -> {
            return new BlockItem((Block)CYAN_BLOCK.get(), (new Item.Properties()).tab(AntiBlock.TAB));
        });
        GRAY_BLOCK_ITEM = ITEMS.register("gray_antiblock", () -> {
            return new BlockItem((Block)GRAY_BLOCK.get(), (new Item.Properties()).tab(AntiBlock.TAB));
        });
        GREEN_BLOCK_ITEM = ITEMS.register("green_antiblock", () -> {
            return new BlockItem((Block)GREEN_BLOCK.get(), (new Item.Properties()).tab(AntiBlock.TAB));
        });
        LIGHT_BLUE_BLOCK_ITEM = ITEMS.register("light_blue_antiblock", () -> {
            return new BlockItem((Block)LIGHT_BLUE_BLOCK.get(), (new Item.Properties()).tab(AntiBlock.TAB));
        });
        LIGHT_GRAY_BLOCK_ITEM = ITEMS.register("light_gray_antiblock", () -> {
            return new BlockItem((Block)LIGHT_GRAY_BLOCK.get(), (new Item.Properties()).tab(AntiBlock.TAB));
        });
        LIME_BLOCK_ITEM = ITEMS.register("lime_antiblock", () -> {
            return new BlockItem((Block)LIME_BLOCK.get(), (new Item.Properties()).tab(AntiBlock.TAB));
        });
        MAGENTA_BLOCK_ITEM = ITEMS.register("magenta_antiblock", () -> {
            return new BlockItem((Block)MAGENTA_BLOCK.get(), (new Item.Properties()).tab(AntiBlock.TAB));
        });
        ORANGE_BLOCK_ITEM = ITEMS.register("orange_antiblock", () -> {
            return new BlockItem((Block)ORANGE_BLOCK.get(), (new Item.Properties()).tab(AntiBlock.TAB));
        });
        PINK_BLOCK_ITEM = ITEMS.register("pink_antiblock", () -> {
            return new BlockItem((Block)PINK_BLOCK.get(), (new Item.Properties()).tab(AntiBlock.TAB));
        });
        PURPLE_BLOCK_ITEM = ITEMS.register("purple_antiblock", () -> {
            return new BlockItem((Block)PURPLE_BLOCK.get(), (new Item.Properties()).tab(AntiBlock.TAB));
        });
        RED_BLOCK_ITEM = ITEMS.register("red_antiblock", () -> {
            return new BlockItem((Block)RED_BLOCK.get(), (new Item.Properties()).tab(AntiBlock.TAB));
        });
        YELLOW_BLOCK_ITEM = ITEMS.register("yellow_antiblock", () -> {
            return new BlockItem((Block)YELLOW_BLOCK.get(), (new Item.Properties()).tab(AntiBlock.TAB));
        });
        WHITE_BLOCK_ITEM = ITEMS.register("white_antiblock", () -> {
            return new BlockItem((Block)WHITE_BLOCK.get(), (new Item.Properties()).tab(AntiBlock.TAB));
        });
    }
}
