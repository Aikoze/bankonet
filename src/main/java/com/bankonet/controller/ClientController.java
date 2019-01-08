package com.bankonet.controller;

import com.bankonet.entity.Client;
import com.bankonet.repository.ClientRepository;
import com.bankonet.services.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/client")
public class ClientController {

    @Autowired
    ClientServiceImpl clientService;

    @Autowired
     private ClientRepository clientRepository;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public @ResponseBody Iterable<Client> getAllClient() {
        return clientRepository.findAll();
    }

    @RequestMapping(value = "/create")
    public String createClient(@RequestParam("nom") String nom, @RequestParam("prenom") String prenom) {
        clientService.Addclient(nom, prenom);
        return "L'utilisateur " + nom + " " + prenom + "a été créé";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteClient(@PathVariable("id") Long id) {
        clientService.deleteClient(id);
        return "L'utilisateur a été supprimé " + id;
    }

    @PutMapping(value = "/update/{id}")
    public String updateClient(@PathVariable("id") Long id, @RequestParam("nom") String nom, @RequestParam String prenom) throws Exception {
        Client client = new Client(nom, prenom);
        clientRepository.save(client);
        return "L'utilisateur a été modifié";
    }
}