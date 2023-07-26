package com.example.demo.components;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Edibili extends Items{
   private Double calorie;
   public Edibili(String nome, Double prezzo, Double calorie) {
	   super(nome, prezzo);
	   this.calorie = calorie;
   }
}
