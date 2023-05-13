package com.github.wratixor.justcultivation.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static com.github.wratixor.justcultivation.JustCultivation.MODID;

public class GenItemTags extends ItemTagsProvider {
    public GenItemTags(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, CompletableFuture<TagLookup<Block>> future, ExistingFileHelper helper) {
        super(output, provider, future, MODID, helper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

    }
}
