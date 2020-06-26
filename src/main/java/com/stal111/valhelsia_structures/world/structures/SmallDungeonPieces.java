package com.stal111.valhelsia_structures.world.structures;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.stal111.valhelsia_structures.ValhelsiaStructures;
import com.stal111.valhelsia_structures.init.ModStructurePieces;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.jigsaw.JigsawManager;
import net.minecraft.world.gen.feature.jigsaw.JigsawPattern;
import net.minecraft.world.gen.feature.jigsaw.JigsawPiece;
import net.minecraft.world.gen.feature.jigsaw.SingleJigsawPiece;
import net.minecraft.world.gen.feature.structure.AbstractVillagePiece;
import net.minecraft.world.gen.feature.structure.StructurePiece;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.List;

public class SmallDungeonPieces {

    public static void register() {
        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation(ValhelsiaStructures.MOD_ID, "dungeon1/entrances"), new ResourceLocation("empty"), ImmutableList.of(Pair.of(new SingleJigsawPiece(ValhelsiaStructures.MOD_ID + ":dungeon1/entrance"), 1), Pair.of(new SingleJigsawPiece(ValhelsiaStructures.MOD_ID + ":dungeon1/entrance1"), 1)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation(ValhelsiaStructures.MOD_ID, "dungeon1/main_rooms"), new ResourceLocation("empty"), ImmutableList.of(Pair.of(new SingleJigsawPiece(ValhelsiaStructures.MOD_ID + ":dungeon1/main_room"), 1), Pair.of(new SingleJigsawPiece(ValhelsiaStructures.MOD_ID + ":dungeon1/main_room1"), 1), Pair.of(new SingleJigsawPiece(ValhelsiaStructures.MOD_ID + ":dungeon1/main_room2"), 1)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation(ValhelsiaStructures.MOD_ID, "dungeon1/side_rooms"), new ResourceLocation("empty"), ImmutableList.of(Pair.of(new SingleJigsawPiece(ValhelsiaStructures.MOD_ID + ":dungeon1/side_room"), 1), Pair.of(new SingleJigsawPiece(ValhelsiaStructures.MOD_ID + ":dungeon1/side_room1"), 1)), JigsawPattern.PlacementBehaviour.RIGID));
    }

    public static void generate(ChunkGenerator p_215139_0_, TemplateManager p_215139_1_, BlockPos p_215139_2_, List<StructurePiece> p_215139_3_, SharedSeedRandom p_215139_4_) {
        JigsawManager.func_236823_a_(new ResourceLocation(ValhelsiaStructures.MOD_ID, "dungeon1/entrances"), 7, SmallDungeonPiece::new, p_215139_0_, p_215139_1_, p_215139_2_, p_215139_3_, p_215139_4_, true, true);
    }

    public static class SmallDungeonPiece extends AbstractVillagePiece {
        public SmallDungeonPiece(TemplateManager p_i50560_1_, JigsawPiece p_i50560_2_, BlockPos p_i50560_3_, int p_i50560_4_, Rotation p_i50560_5_, MutableBoundingBox p_i50560_6_) {
            super(ModStructurePieces.SMALL_DUNGEON, p_i50560_1_, p_i50560_2_, p_i50560_3_, p_i50560_4_, p_i50560_5_, p_i50560_6_);
        }

        public SmallDungeonPiece(TemplateManager p_i50561_1_, CompoundNBT p_i50561_2_) {
            super(p_i50561_1_, p_i50561_2_, ModStructurePieces.SMALL_DUNGEON);
        }
    }
}