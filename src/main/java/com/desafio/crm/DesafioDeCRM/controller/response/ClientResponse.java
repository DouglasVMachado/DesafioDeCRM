package com.desafio.crm.DesafioDeCRM.controller.response;

import lombok.Builder;

@Builder
public record ClientResponse(Long id,
                             String name,
                             String email) {
}
