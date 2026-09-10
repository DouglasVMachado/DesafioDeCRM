package com.desafio.crm.DesafioDeCRM.service;

import com.desafio.crm.DesafioDeCRM.model.Contact;
import com.desafio.crm.DesafioDeCRM.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Contact create(Contact contact){
        return contactRepository.save(contact);
    }

    public List<Contact> findAll(){
        return contactRepository.findAll();
    }

    public Optional<Contact> findById(Long id){
        return contactRepository.findById(id);
    }

}
