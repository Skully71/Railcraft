/*------------------------------------------------------------------------------
 Copyright (c) CovertJaguar, 2011-2016
 http://railcraft.info

 This code is the property of CovertJaguar
 and may only be used with explicit written
 permission unless otherwise specified on the
 license page at http://railcraft.info/wiki/info:license.
 -----------------------------------------------------------------------------*/
package mods.railcraft.common.worldgen;

import mods.railcraft.common.items.Metal;
import net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType;

/**
 *
 * @author CovertJaguar <http://www.railcraft.info>
 */
public class GeneratorMineIron extends GeneratorMine {

    //    public static final EventType EVENT_TYPE = EnumHelper.addEnum(EventType.class, "RC_POOR_IRON", new Class[0], new Object[0]);
    private static final int Y_LEVEL = 40;
    private static final int Y_RANGE = 4;
    private static final int DENSITY = 16;
    private static final int SEED = 26;

    public GeneratorMineIron() {
        super(EventType.CUSTOM, Metal.IRON, DENSITY, Y_LEVEL, Y_RANGE, SEED);
    }

}
