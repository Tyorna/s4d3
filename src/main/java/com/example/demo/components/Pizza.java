package com.example.demo.components;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pizza extends Edibili{
	public Pizza(String nome, double prezzo, double calorie) {
		super(nome, prezzo, calorie);
	}

	@Override
	public String toString() {
		return "Pizza [Nome = " + getNome() + ", Calorie = " + getCalorie() + ", Prezzo = " + getPrezzo() + "€]";
	}
}
