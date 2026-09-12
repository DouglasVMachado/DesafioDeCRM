package com.desafio.crm.DesafioDeCRM.model;


import jakarta.persistence.*;
import lombok.*;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "contacts")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String amount;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

}
