package com.example.demo.components;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Items {
	 private String nome;
	 private Double prezzo;
}
