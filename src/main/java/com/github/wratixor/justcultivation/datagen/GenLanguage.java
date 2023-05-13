package com.github.wratixor.justcultivation.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import static com.github.wratixor.justcultivation.JustCultivation.MODID;

public class GenLanguage extends LanguageProvider {
    public GenLanguage(PackOutput packOutput, String locale) {
        super(packOutput, MODID, locale);
    }
    @Override
    protected void addTranslations() {
        add("itemGroup." + MODID + ".all", "Just Cultivation");
    }
}
