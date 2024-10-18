package com.example.challenge.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LogNotificationDTO {

    @JsonProperty("idMessage")
    private String idMessage;

    @JsonProperty("user")
    private String user;

    @JsonProperty("category")
    private String category;

    @JsonProperty("channel")
    private String channel;

    @JsonProperty("status")
    private String status;

    @JsonProperty("dateDelivered")
    private String dateDelivered;
}
