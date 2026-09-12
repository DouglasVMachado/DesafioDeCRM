package com.desafio.crm.DesafioDeCRM.controller.request;

public record ContactRequest(String type,
                             String amount,
                             Long clientID) {
}
