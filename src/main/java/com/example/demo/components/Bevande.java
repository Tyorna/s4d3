package com.example.demo.components;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bevande extends Edibili{
 public Bevande(String nome, double prezzo, double calorie) {
		super(nome, prezzo, calorie);
	}

	@Override
	public String toString() {
		return "Bevanda [Nome = " + getNome() + ", Calorie = " + getCalorie() + ", Prezzo = " + getPrezzo() + "€]";
	}
}
