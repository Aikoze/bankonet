package com.bankonet.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


@Entity
public class CompteEpargne extends Compte  {

	@Column(name = "taux_interet")
	private double taux_interet;

	public CompteEpargne() {
	}

	private double getTaux_interet() {
		return taux_interet;
	}

	public void setTaux_interet(double taux_interet) {
		this.taux_interet = taux_interet;
	}
}
