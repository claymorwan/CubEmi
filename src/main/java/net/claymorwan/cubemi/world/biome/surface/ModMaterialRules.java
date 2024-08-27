package net.claymorwan.cubemi.world.biome.surface;

import net.claymorwan.cubemi.block.ModBlocks;
import net.claymorwan.cubemi.world.biome.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class ModMaterialRules {
    private static final MaterialRules.MaterialRule DIRT = makeStateRule(Blocks.DIRT);
    private static final MaterialRules.MaterialRule GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final MaterialRules.MaterialRule EMI_BLOCK    = makeStateRule(ModBlocks.EMI_BLOCK);

    public static MaterialRules.MaterialRule makeRules(){
        MaterialRules.MaterialCondition is_at_or_above_water_level = MaterialRules.water(-1, 0);
        MaterialRules.MaterialRule grass_surface = MaterialRules.sequence(MaterialRules.condition(is_at_or_above_water_level, GRASS_BLOCK), DIRT);

        return MaterialRules.sequence(
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.MELO_BIOME),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, EMI_BLOCK)), // changes floor to block
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, EMI_BLOCK)), // changes ceiling to block

                // Default to a grass and dirt surface
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grass_surface)
        );
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}
