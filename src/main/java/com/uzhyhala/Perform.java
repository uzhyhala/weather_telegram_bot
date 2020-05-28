package com.uzhyhala;

import org.telegram.abilitybots.api.bot.AbilityBot;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Perform extends AbilityBot {

    Perform() {
        super("", "Weather by Ulad and Nick");
    }

    @Override
    public int creatorId() {
        return 0;
    }

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage()) {
            Message message = new Message();

            System.err.println(message.getText());



        }
    }
}
