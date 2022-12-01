package mods.officialy.antiblock.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class AntiBlockBlock extends Block {
    public AntiBlockBlock(MaterialColor color) {
        super(Properties.of(Material.STONE, color).strength(1.5F, 6.0F).strength(2.5F, 6.0F));
    }
}
