package net.claymorwan.cubemi;

import net.claymorwan.cubemi.block.ModBlocks;
import net.claymorwan.cubemi.item.ModItemGroups;
import net.claymorwan.cubemi.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CubEmi implements ModInitializer {
	public static final String MOD_ID = "cubemi";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Wtf am I doing");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}