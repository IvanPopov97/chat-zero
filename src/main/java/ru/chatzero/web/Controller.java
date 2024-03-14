package ru.chatzero.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    private final List<String> messages = new ArrayList<>();

    @PostMapping
    public void sendMessage(@RequestParam String message) {
        messages.add(message);
        System.out.println(messages);
    }

    @GetMapping
    public List<String> getMessages() {
        return messages;
    }
}
