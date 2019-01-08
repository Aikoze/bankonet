package com.bankonet.services;

import com.bankonet.entity.Client;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ClientService  {

    List<Client> findAll();

    void Addclient(String prenom,String nom);

    void deleteClient(Long id);

   Client findClientbyId(Long id);
}
