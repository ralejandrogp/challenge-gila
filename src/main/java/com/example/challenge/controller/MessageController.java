package com.example.challenge.controller;

import com.example.challenge.controller.dto.RequestSendNotification;
import com.example.challenge.exception.MessageEmptyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/message")
public class MessageController {

    @PostMapping("/sendMessage")
    public ResponseEntity<?> sendNotification(@RequestBody RequestSendNotification requestBody) {
        if (!StringUtils.hasText(requestBody.getMessage())) {
            throw new MessageEmptyException("Message cannot be empty, bad request in the body", new Throwable());
        }

        //TODO insert the message

        return ResponseEntity.ok("The message was sent correctly");
    }

}
