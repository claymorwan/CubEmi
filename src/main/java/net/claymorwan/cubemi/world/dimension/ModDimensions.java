package net.claymorwan.cubemi.world.dimension;

import net.claymorwan.cubemi.CubEmi;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;

import java.util.OptionalLong;

public class ModDimensions {

    public static final RegistryKey<DimensionOptions> MELODIM_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            Identifier.of(CubEmi.MOD_ID, "melodim"));
    public static final RegistryKey<World> MELODIM_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            Identifier.of(CubEmi.MOD_ID, "melodim"));
    public static final RegistryKey<DimensionType> MELO_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            Identifier.of(CubEmi.MOD_ID, "melodim_type"));

    public static void bootstrapType(Registerable<DimensionType> context) {
        context.register(MELO_DIM_TYPE, new DimensionType(
                OptionalLong.of(12000),
                false,                    // hasSkyLight
                false,                              // hasCeiling
                false,                              // ultrawarm
                true,                               // natural
                1.0,                                // coordinateScale
                true,                               // bedworks
                true,                               // respawnAnchorWorks
                0,                                  // minY
                256,                                // height
                256,                                // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD,     // infiniburn
                DimensionTypes.OVERWORLD_ID,        // effectsLocation
                1.0f,                               // ambiantLight
                new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)
        ));
    }
}
