package com.example.demo.components;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Souvenirs extends NonEdibili{
	 public Souvenirs(String nome, double prezzo) {
			super(nome, prezzo);
		}

		@Override
		public String toString() {
			return "Souvenir [Nome = " + getNome() + ", Prezzo = " + getPrezzo() + "€]";
		}
}
