package net.claymorwan.cubemi.item;

import net.claymorwan.cubemi.CubEmi;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static Item EMI_GEM = registerItem("emi_gem", new Item(new Item.Settings()));

    public static Item registerItem(String name, Item item) {
        Identifier id = Identifier.of(CubEmi.MOD_ID, name);
        return Registry.register(Registries.ITEM, id, item);
    }

    public static void registerModItems(){
        CubEmi.LOGGER.info("Registering ModItems for " + CubEmi.MOD_ID + " :3");
    }
}
