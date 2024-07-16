package net.claymorwan.cubemi.item;

import net.claymorwan.cubemi.CubEmi;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CubEmi.MOD_ID, name), item);
    }

    public static void registerModItems(){
        CubEmi.LOGGER.info("Registering ModItems for " + CubEmi.MOD_ID + " :3");
    }
}
