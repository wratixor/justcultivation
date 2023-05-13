package com.github.wratixor.justcultivation.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static com.github.wratixor.justcultivation.JustCultivation.MODID;

public class GenBlockTags extends IntrinsicHolderTagsProvider<Block> {
    public GenBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, ExistingFileHelper helper) {
        //noinspection deprecation
        super(output, Registries.BLOCK, provider, block -> block.builtInRegistryHolder().key(), MODID, helper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

    }
}
