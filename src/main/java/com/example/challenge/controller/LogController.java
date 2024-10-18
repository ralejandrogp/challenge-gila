package com.example.challenge.controller;

import com.example.challenge.controller.dto.LogNotificationDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.text.RandomStringGenerator;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@Slf4j
@RestController
@RequestMapping("/logNotification")
public class LogController {

    @GetMapping("/all")
    public List<LogNotificationDTO> getAllLogNotifications() {

        //TODO retrieve all the data from the table

        return createListNotification();
    }

    private List<LogNotificationDTO> createListNotification() {
        Random random = new Random();
        RandomStringGenerator rs = new RandomStringGenerator.Builder().withinRange('a', 'z').build();

        int randomNumber = random.nextInt(1, 1000);

        return IntStream.range(0, randomNumber).mapToObj( i -> {
            return LogNotificationDTO.builder()
                    .user(rs.generate(15))
                    .status(rs.generate(1))
                    .category(rs.generate(5))
                    .channel(rs.generate(5))
                    .dateDelivered(rs.generate(10))
                    .idMessage(rs.generate(5))
                    .build();
        }).toList();
    }
}
