package com.mart.rpgbot.service;

import com.google.gson.Gson;
import com.mart.rpgbot.eventhandlers.CharacterHandler;
import com.mart.rpgbot.eventhandlers.OnReadyEvent;
import com.mart.rpgbot.repository.PlayerRepository;
import com.mysql.jdbc.Connection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sx.blah.discord.api.ClientBuilder;

import sx.blah.discord.api.EventDispatcher;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.util.DiscordException;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.List;

@Service
public class DiscordService {

    private String email, password;
    public static IDiscordClient pub;
    public static Connection conn = null;

    public List<Object> queuedSubscribers;

    @PostConstruct
    private void initialize() throws FileNotFoundException, DiscordException {
        LoginDetails details = new Gson().fromJson(new FileReader(new File("C:\\Development\\Discord\\Spartacus\\details.txt")), LoginDetails.class);
        IDiscordClient client = new ClientBuilder().withLogin(details.email, details.pass).build();
        client.login();
        pub = client;
        EventDispatcher dispatcher = client.getDispatcher();
        dispatcher.registerListener(new OnReadyEvent());
        //dispatcher.registerListener(new CharacterHandler());
    }

    /*@Retryable(maxAttempts = 10, backoff = @Backoff(delay = 10000L))
    public void login(){

    }*/

    public class LoginDetails {
        public String email;
        public String pass;
    }

    public void subscribe(Object subscriber) {
        if (pub != null && pub.isReady()) {
            System.out.println("Subscribing {}" + subscriber.getClass().getCanonicalName());
            pub.getDispatcher().registerListener(subscriber);
        }
        queuedSubscribers.add(subscriber);
    }

}
