package io.github.rypofalem.armorstandeditor.api;

import org.bukkit.entity.ArmorStand;
import org.bukkit.event.Cancellable;

public abstract class CancellableArmorStandEvent extends ArmorStandEvent implements Cancellable {
    protected boolean cancelled;

    public CancellableArmorStandEvent(ArmorStand armorStand) {
        super(armorStand);
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
