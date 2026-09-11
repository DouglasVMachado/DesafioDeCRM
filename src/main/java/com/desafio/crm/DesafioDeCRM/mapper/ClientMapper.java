package com.desafio.crm.DesafioDeCRM.mapper;

import com.desafio.crm.DesafioDeCRM.controller.request.ClientRequest;
import com.desafio.crm.DesafioDeCRM.controller.response.ClientResponse;
import com.desafio.crm.DesafioDeCRM.model.Client;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ClientMapper {

    public Client toClient(ClientRequest clientRequest){
        return Client.builder()
                .name(clientRequest.name())
                .email(clientRequest.email())
                .build();
    }

    public ClientResponse toClientResponse(Client client){
        return ClientResponse.builder()
                .id(client.getId())
                .name(client.getName())
                .email(client.getEmail())
                .build();
    }

}
