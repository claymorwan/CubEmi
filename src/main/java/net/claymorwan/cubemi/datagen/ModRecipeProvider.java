package net.claymorwan.cubemi.datagen;

import net.claymorwan.cubemi.block.ModBlocks;
import net.claymorwan.cubemi.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        // Emi block
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.EMI_BLOCK, 1)
                        .pattern("##")
                        .pattern("##")
                        .input('#', ModItems.EMI_GEM)
                        .criterion(hasItem(ModItems.EMI_GEM), conditionsFromItem(ModItems.EMI_GEM))
                        .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.EMI_BLOCK)));

//        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.EMI_BLOCK)
//                        .input(ModItems.EMI_GEM)
//                .criterion(hasItem(ModItems.EMI_GEM), conditionsFromItem(ModItems.EMI_GEM))
//                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.EMI_BLOCK)));

        // Emi gem
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EMI_GEM, 1)
                .pattern(" # ")
                .pattern("###")
                .pattern(" # ")
                .input('#', Items.GLOWSTONE)
                .criterion(hasItem(Items.GLOWSTONE), conditionsFromItem(Items.GLOWSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EMI_GEM)));
    }
}
