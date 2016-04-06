package com.mart.rpgbot.eventhandlers;


import com.mart.rpgbot.entitys.Player;
import com.mart.rpgbot.repository.PlayerRepository;
import com.mart.rpgbot.service.DiscordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sx.blah.discord.api.EventSubscriber;
import sx.blah.discord.handle.impl.events.MessageReceivedEvent;
import sx.blah.discord.handle.obj.IMessage;
import sx.blah.discord.handle.obj.IUser;
import sx.blah.discord.util.DiscordException;
import sx.blah.discord.util.HTTP429Exception;
import sx.blah.discord.util.MessageBuilder;
import sx.blah.discord.util.MissingPermissionsException;

import javax.annotation.PostConstruct;

@Component
public class CharacterHandler {

    private final DiscordService discordService;

    private final PlayerRepository playerRepository;

    @Autowired
    public CharacterHandler(PlayerRepository playerRepository, DiscordService discordService) {
        this.playerRepository = playerRepository;
        this.discordService = discordService;
    }

    @EventSubscriber
    public void onMessageEvent(MessageReceivedEvent event) throws HTTP429Exception, DiscordException, MissingPermissionsException {
        IMessage message = event.getMessage();
        IUser sender = message.getAuthor();
        String content = message.getContent();
        String[] cutMessage = message.toString().split(" ");
        String userID = sender.getID();

        if(content.startsWith("[join")){
            sendMessage("Welcome recruit! Here is a letter with basic information about your newly found life! I wish you " +
                    "the best of luck and dont forget, dont die.", event);
            Player player = new Player(userID, "NULL", 1, 0, 1, 1, 1, 1, 1);
            playerRepository.save(player);
        }
    }

    public void sendMessage(String message, MessageReceivedEvent event) throws HTTP429Exception, DiscordException, MissingPermissionsException {
        String sender = event.getMessage().getAuthor().toString();
        new MessageBuilder(discordService.pub).appendContent(sender+"\n").appendContent(message).withChannel(event.getMessage().getChannel()).build();
    }

    @PostConstruct
    private void configure() {
        discordService.subscribe(this);
    }
}
