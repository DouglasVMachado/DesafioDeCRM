package com.desafio.crm.DesafioDeCRM.controller;


import com.desafio.crm.DesafioDeCRM.controller.request.ClientRequest;
import com.desafio.crm.DesafioDeCRM.controller.response.ClientResponse;
import com.desafio.crm.DesafioDeCRM.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    public ResponseEntity<ClientResponse> create(@RequestBody ClientRequest clientRequest){

    }

}
