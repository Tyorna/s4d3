package com.example.demo.components;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Menu {
	List<Pizza> listaPizza = new ArrayList<>(); 
	List<Bevande> listaBevande = new ArrayList<>(); 
	List<Souvenirs> listaSouvenir = new ArrayList<>(); 
	List<Toppings> listaToppings = new ArrayList<>(); 
}
