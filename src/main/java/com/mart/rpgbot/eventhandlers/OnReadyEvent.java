package com.mart.rpgbot.eventhandlers;

import sx.blah.discord.api.EventSubscriber;
import sx.blah.discord.handle.impl.events.ReadyEvent;

public class OnReadyEvent {

    @EventSubscriber
    public void onReadyEvent(ReadyEvent event) { //This method is called when the ReadyEvent is dispatched
        System.out.println("I'm is running. Make sure ill stay on ;)");
    }

}
