package net.claymorwan.cubemi.item;

import net.claymorwan.cubemi.CubEmi;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

//    Items
    public static final Item EMI_GEM = registerItem("emi_gem", new Item(new FabricItemSettings()));

//    Registering Items
    public static Item registerItem(String name, Item item) {
        // Create identifier for the item
        Identifier id = Identifier.of(CubEmi.MOD_ID, name);
        return Registry.register(Registries.ITEM, id, item);
    }

    public static void registerModItems(){
        CubEmi.LOGGER.info("Registering ModItems for " + CubEmi.MOD_ID);
    }
}
