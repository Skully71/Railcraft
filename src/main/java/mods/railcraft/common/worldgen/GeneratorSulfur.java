/*------------------------------------------------------------------------------
 Copyright (c) CovertJaguar, 2011-2016
 http://railcraft.info

 This code is the property of CovertJaguar
 and may only be used with explicit written
 permission unless otherwise specified on the
 license page at http://railcraft.info/wiki/info:license.
 -----------------------------------------------------------------------------*/
package mods.railcraft.common.worldgen;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;

import java.util.Random;

/**
 * @author CovertJaguar <http://www.railcraft.info>
 */
public class GeneratorSulfur extends Generator {

    //    public static final EventType EVENT_TYPE = EnumHelper.addEnum(EventType.class, "SULFUR", new Class[0], new Object[0]);

    public GeneratorSulfur() {
        super(new WorldGenSulfur());
    }

    @Override
    public boolean canGen(World world, Random rand, BlockPos targetPos, Biome biome) {
        return world.provider.getDimension() == 0 && BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.MOUNTAIN);
    }

    @Override
    public void generate(World world, Random rand, BlockPos targetPos, Biome biome) {
        for (int i = 0; i < 90; i++) {
            int x = targetPos.getX() + rand.nextInt(16);
            int y = 6 + rand.nextInt(10);
            int z = targetPos.getZ() + rand.nextInt(16);

            generators[0].generate(world, rand, new BlockPos(x, y, z));
        }
    }
}
