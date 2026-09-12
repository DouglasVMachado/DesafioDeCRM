package com.desafio.crm.DesafioDeCRM.controller.response;

import lombok.Builder;

@Builder
public record ContactResponse(Long id,
                              String type,
                              String amount,
                              Long clientId) {
}
