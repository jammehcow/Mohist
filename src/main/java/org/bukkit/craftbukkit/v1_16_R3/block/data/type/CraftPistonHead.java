package org.bukkit.craftbukkit.v1_16_R3.block.data.type;

import org.bukkit.block.data.type.PistonHead;
import org.bukkit.craftbukkit.v1_16_R3.block.data.CraftBlockData;

public abstract class CraftPistonHead extends CraftBlockData implements PistonHead {

    private static final net.minecraft.state.BooleanProperty SHORT = getBoolean("short");

    @Override
    public boolean isShort() {
        return get(SHORT);
    }

    @Override
    public void setShort(boolean _short) {
        set(SHORT, _short);
    }
}
