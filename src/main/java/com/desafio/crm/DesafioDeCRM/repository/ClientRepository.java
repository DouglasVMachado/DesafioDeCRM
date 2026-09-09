package com.desafio.crm.DesafioDeCRM.repository;

import com.desafio.crm.DesafioDeCRM.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
