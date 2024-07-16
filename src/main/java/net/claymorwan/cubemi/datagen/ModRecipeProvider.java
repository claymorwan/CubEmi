package net.claymorwan.cubemi.datagen;

import net.claymorwan.cubemi.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.EMI_BLOCK, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', Items.GLOWSTONE)
                .criterion(hasItem(Items.GLOWSTONE), conditionsFromItem(Items.GLOWSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.EMI_BLOCK)));
    }
}
