package com.stal111.valhelsia_structures.world.structures;

import com.mojang.serialization.Codec;
import com.stal111.valhelsia_structures.config.StructureGenConfig;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.MarginedStructureStart;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.feature.template.TemplateManager;

import javax.annotation.Nonnull;

public class SmallDungeonStructure extends AbstractValhelsiaStructure {
    public static final String SHORT_NAME = "small_dungeon";

    public SmallDungeonStructure(Codec<NoFeatureConfig> noFeatureConfigCodec) {
        super(noFeatureConfigCodec, SHORT_NAME);
    }

    @Override
    @Nonnull
    public IStartFactory getStartFactory() {
        return Start::new;
    }

    public static class Start extends MarginedStructureStart<NoFeatureConfig> {

        public Start(Structure<NoFeatureConfig> structure, int chunkX, int chunkZ, MutableBoundingBox bounds, int reference, long seed) {
            super(structure, chunkX, chunkZ, bounds, reference, seed);
        }

        @Override
        public void func_230364_a_(ChunkGenerator generator, TemplateManager templateManager, int chunkX, int chunkZ, Biome biome, NoFeatureConfig noFeatureConfig) {
            Rotation rotation = Rotation.values()[this.rand.nextInt(Rotation.values().length)];
            BlockPos pos = new BlockPos(chunkX * 16, 0, chunkZ * 16);
            SmallDungeonPieces.generate(generator, templateManager, pos, this.components, this.rand);
            this.recalculateStructureSize();
        }
    }
}
