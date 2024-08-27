package net.claymorwan.cubemi.block;

import net.claymorwan.cubemi.CubEmi;
import net.claymorwan.cubemi.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

//    Blocks
    public static final Block EMI_BLOCK = registerBlock("emi_block",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.GLOWSTONE)
                    .sounds(ModSounds.EMI_BLOCK_SOUNDS)
                    .strength(2f)),
        true);

//    Registering blocks :3
    private static Block registerBlock(String name, Block block, boolean shouldRegisterItem) {

        // Create an identifier for the block
        Identifier id = Identifier.of(CubEmi.MOD_ID, name);

        // If true, will also register the block as an item
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new FabricItemSettings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        Block registeredBlock = Registry.register(Registries.BLOCK,id, block);
        return registeredBlock;
    }

    public static void registerModBlocks(){
        CubEmi.LOGGER.info("Registering ModBlocks for " + CubEmi.MOD_ID);
    }
}
