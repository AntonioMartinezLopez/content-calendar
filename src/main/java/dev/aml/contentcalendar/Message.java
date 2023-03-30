package dev.aml.contentcalendar;

import org.springframework.stereotype.Component;
//Component -> Singleton, Basic Bean of all. class-level
@Component
public class Message {

    public String getMessage() {
        return "Hello World!";
    }
}
