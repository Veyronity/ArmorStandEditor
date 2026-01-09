package io.github.rypofalem.armorstandeditor.api;

import org.bukkit.entity.ItemFrame;
import org.bukkit.event.Cancellable;

public abstract class CancellableItemFrameEvent extends ItemFrameEvent implements Cancellable {
    protected boolean cancelled;

    public CancellableItemFrameEvent(ItemFrame itemFrame) {
        super(itemFrame);
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
