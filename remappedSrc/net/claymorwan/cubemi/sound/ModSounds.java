package net.claymorwan.cubemi.sound;

import net.claymorwan.cubemi.CubEmi;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent EMI_BLOCK_BREAK = registerSoundEvent("emi_block_break");
    public static final SoundEvent EMI_BLOCK_STEP = registerSoundEvent("emi_block_step");
    public static final SoundEvent EMI_BLOCK_PLACE = registerSoundEvent("emi_block_place"); // missing
    public static final SoundEvent EMI_BLOCK_HIT = registerSoundEvent("emi_block_hit");
    public static final SoundEvent EMI_BLOCK_FALL = registerSoundEvent("emi_block_fall");


    public static final BlockSoundGroup EMI_BLOCK_SOUNDS = new BlockSoundGroup(1.0f, 1.25f,
            ModSounds.EMI_BLOCK_BREAK, ModSounds.EMI_BLOCK_STEP, ModSounds.EMI_BLOCK_PLACE, ModSounds.EMI_BLOCK_HIT,ModSounds.EMI_BLOCK_FALL);


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(CubEmi.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }


    public static void registerSounds(){
        CubEmi.LOGGER.info("Registering ModSounds for " + CubEmi.MOD_ID + " :3");
    }
}
