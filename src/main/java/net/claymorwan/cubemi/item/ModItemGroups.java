package net.claymorwan.cubemi.item;

import net.claymorwan.cubemi.CubEmi;
import net.claymorwan.cubemi.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup Cubbed_Emi = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CubEmi.MOD_ID, "cubbed_emi"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.cubbed_emi"))
                    .icon(() -> new ItemStack(ModBlocks.EMI_BLOCK)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.EMI_BLOCK);

                    }).build());


    public static void registerItemGroups(){
        CubEmi.LOGGER.info("Registering ModItemGroups for " + CubEmi.MOD_ID + " :3");
    }
}
