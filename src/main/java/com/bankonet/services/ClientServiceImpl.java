package com.bankonet.services;


import com.bankonet.entity.Client;
import com.bankonet.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public List<Client> findAll() {
        List<Client> clients = (List<Client>) clientRepository.findAll();
        return clients;
    }

    @Override
    public void Addclient(String nom, String prenom) {
        Client client = new Client(nom, prenom);
        clientRepository.save(client);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client findClientbyId(Long id) {
        Client client = clientRepository.findById(id).get();
        return client;
    }


}
