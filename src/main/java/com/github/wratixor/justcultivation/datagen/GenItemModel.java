package com.github.wratixor.justcultivation.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.github.wratixor.justcultivation.JustCultivation.MODID;

public class GenItemModel extends ItemModelProvider {
    public GenItemModel(PackOutput output, ExistingFileHelper helper) {
        super(output, MODID, helper);
    }
    @Override
    protected void registerModels() {

    }
}
