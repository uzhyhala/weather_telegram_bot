package com.uzhyhala;

import org.telegram.abilitybots.api.bot.AbilityBot;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Perform extends AbilityBot {

    Perform() {
        super("1219270498:AAHWb9xCR1r56eQ_M4gi3njl70E5vLs3kuo", "Weather by Ulad and Nick");
    }

    @Override
    public int creatorId() {
        return 0;
    }

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage()) {
            System.err.println();

            if(update.getMessage().getText().equals("/start")){
                System.err.println(update.getMessage().getFrom().getFirstName());
            }

        }
    }


}
