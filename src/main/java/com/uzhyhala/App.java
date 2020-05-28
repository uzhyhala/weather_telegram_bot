package com.uzhyhala;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class App {
    public static void main(String[] args) {
        ApiContextInitializer.init();

        try {
            TelegramBotsApi api = new TelegramBotsApi();
            api.registerBot(new Perform());
        } catch (TelegramApiException e) {
            System.err.println(ExceptionUtils.getStackTrace(e));
        }
    }
}
