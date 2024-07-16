package net.claymorwan.cubemi.block;

import net.claymorwan.cubemi.CubEmi;
import net.claymorwan.cubemi.sound.ModSounds;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

//    Blocks
    public static final Block EMI_BLOCK = registerBlock("emi_block",
            new Block(AbstractBlock.Settings.create().sounds(ModSounds.EMI_BLOCK_SOUNDS).strength(2f)),true);

// Registering blocks :3
    private static Block registerBlock(String name, Block block, boolean shouldRegisterItem){

        Identifier id = Identifier.of(CubEmi.MOD_ID, name);

        if (shouldRegisterItem) { // register as item if true
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }
        return Registry.register(Registries.BLOCK, id, block);
    }

    public static void registerModBlocks(){
        CubEmi.LOGGER.info("Registering ModBlocks for " + CubEmi.MOD_ID + " :3");
    }
}
