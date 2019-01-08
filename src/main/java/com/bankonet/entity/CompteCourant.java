package com.bankonet.entity;
import javax.persistence.*;

@Entity
public class CompteCourant extends Compte  {

    @Column(name ="decouvert")
	private double decouvert ;

    public CompteCourant() {
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }


}

