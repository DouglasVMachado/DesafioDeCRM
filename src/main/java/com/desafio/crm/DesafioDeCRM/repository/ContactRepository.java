package com.desafio.crm.DesafioDeCRM.repository;

import com.desafio.crm.DesafioDeCRM.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
