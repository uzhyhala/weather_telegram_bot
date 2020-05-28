package com.uzhyhala;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.telegram.abilitybots.api.bot.AbilityBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Perform extends AbilityBot {

    Perform() {
        super("1219270498:AAHWb9xCR1r56eQ_M4gi3njl70E5vLs3kuo", "Weather by Ulad");
    }

    @Override
    public int creatorId() {
        return 0;
    }

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage()) {
            System.err.println();

            if (update.getMessage().getText().equals("/start")) {
                System.err.println(update.getMessage().getFrom().getFirstName());
            }

            SendMessage snd = new SendMessage();
            snd.setChatId(update.getMessage().getChatId());
            snd.setText("Hello " + update.getMessage().getFrom().getFirstName());

            try {
                execute(snd);
            } catch (TelegramApiException e) {
                System.err.println(ExceptionUtils.getStackTrace(e));
            }
        }
    }


}
