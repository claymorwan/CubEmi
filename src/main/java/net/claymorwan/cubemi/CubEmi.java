package net.claymorwan.cubemi;

import net.claymorwan.cubemi.block.ModBlocks;
import net.claymorwan.cubemi.item.ModItemGroups;
import net.claymorwan.cubemi.item.ModItems;
import net.claymorwan.cubemi.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.util.Identifier;
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
		ModSounds.registerSounds();


		// Custom portal
		CustomPortalBuilder.beginPortal()
				.frameBlock(ModBlocks.EMI_BLOCK) //Block used to make the portal
				.lightWithFluid(Fluids.WATER)
				.destDimID(new Identifier(CubEmi.MOD_ID, "melodim"))
				.tintColor(80,133,178)
				.registerPortal();
	}
}