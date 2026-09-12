package com.desafio.crm.DesafioDeCRM.controller;


import com.desafio.crm.DesafioDeCRM.controller.request.ClientRequest;
import com.desafio.crm.DesafioDeCRM.controller.response.ClientResponse;
import com.desafio.crm.DesafioDeCRM.mapper.ClientMapper;
import com.desafio.crm.DesafioDeCRM.model.Client;
import com.desafio.crm.DesafioDeCRM.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    public ResponseEntity<ClientResponse> create(@RequestBody ClientRequest clientRequest){
        Client newClient = ClientMapper.toClient(clientRequest);
        Client savedClient = clientService.create(newClient);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    public ResponseEntity<List<ClientResponse>> findAll(){
        List<ClientResponse> clientResponses = clientService.findAll()
                .stream()
                .map(ClientMapper::toClientResponse)
                .toList();
        return ResponseEntity.ok().body(clientResponses);
    }

    public ResponseEntity<ClientResponse> findById(@PathVariable Long id){
        return clientService.findById(id)
                .map(client -> ResponseEntity.ok(ClientMapper.toClientResponse(client)))
                .orElse(ResponseEntity.notFound().build());
    }

}
