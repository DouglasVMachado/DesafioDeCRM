package com.desafio.crm.DesafioDeCRM.controller.response;

public record ContactResponse(Long id,
                              String type,
                              String amount,
                              Long clientId) {
}
