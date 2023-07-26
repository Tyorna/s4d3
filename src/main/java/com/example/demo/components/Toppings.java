package com.example.demo.components;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Toppings extends Pizza{
	private Pizza pizza;
	private String nome;
	private Double prezzo;
	private Double calorie;
	
	public Toppings(String nome, double prezzo, double calorie) {
		super(nome, prezzo, calorie);
	}
	
	public Toppings(Pizza pizza, String nome, double prezzo, double calorie) {
		super(nome, prezzo, calorie);
		this.pizza = pizza;
	}

	@Override
	public String toString() {
		return "Topping [Nome = " + getNome() + ", Calorie = " + getCalorie() + ", Prezzo = " + getPrezzo() + "€]";
	}
	
	@Override
	public Double getPrezzo() {
		return this.getPizza().getPrezzo() + this.prezzo;
	}
	
	@Override
	public Double getCalorie() {
		return this.getPizza().getCalorie() + this.calorie;
	}
	
	@Override
	public String getNome() {
		return this.getPizza().getNome() + " con " + this.nome;
	}
}
