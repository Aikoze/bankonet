package com.bankonet.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import javax.persistence.*;
import java.util.List;


@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;


    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnoreProperties("client")
    private List<CompteCourant> compteCourantList;


    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY,  cascade = CascadeType.ALL)
    @JsonIgnoreProperties("client")
    private List<CompteEpargne> compteEpargneList;


    public Client() {
    }

    public Client(String nom, String prenom) {
        this.prenom = prenom;
        this.nom = nom;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<CompteCourant> getCompteCourantList() {
        return compteCourantList;
    }

    public void setCompteCourantList(List<CompteCourant> compteCourantList) {
        this.compteCourantList = compteCourantList;
    }

    public List<CompteEpargne> getCompteEpargneList() {
        return compteEpargneList;
    }

    public void setCompteEpargneList(List<CompteEpargne> compteEpargneList) {
        this.compteEpargneList = compteEpargneList;
    }

    @Override
    public String toString() {
        return this.id + " : " + this.nom + " " + this.prenom;
    }



}
