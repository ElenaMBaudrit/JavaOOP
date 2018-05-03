package com.codingdojo.pokemon;

//Create a Pokedex class that extends the abstract class above and implements pokemonInfo(Pokemon pokemon).

public class Pokedex extends AbstractPokemon{
	public String pokemonInfo (Pokemon pokemon) {
		return "Name: " + pokemon.getName() + ", Health: " + pokemon.getHealth() + ", Type: " + pokemon.getType();
		
	}

}
