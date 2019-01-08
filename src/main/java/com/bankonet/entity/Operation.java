/*
package com.bankonet.entity;

import javax.persistence.*;

@Entity
@Table(name = "operation")
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "numero")
    private CompteCourant idCptDebite;

    @ManyToOne
    @JoinColumn(name = "numero")
    private CompteCourant idCptCredite;

    @Column
    private Double montant;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CompteCourant getIdCptDebite() {
        return idCptDebite;
    }

    public void setIdCptDebite(CompteCourant idCptDebite) {
        this.idCptDebite = idCptDebite;
    }

    public CompteCourant getIdCptCredite() {
        return idCptCredite;
    }

    public void setIdCptCredite(CompteCourant idCptCredite) {
        this.idCptCredite = idCptCredite;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
*/
