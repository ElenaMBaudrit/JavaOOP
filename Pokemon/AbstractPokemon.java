package com.codingdojo.pokemon;

//Create an abstract class that only implements createPokemon and attackPokemon from the PokemonInterface.

public abstract class AbstractPokemon implements PokemonInterface {
	
    public Pokemon createPokemon (String name, int health, String type) {
        Pokemon pokemon = new Pokemon (name, health, type);
        return pokemon;
	}
    
	public void attackPokemon(Pokemon pokemon) {
			PokemonInterface.attackPokemon(pokemon);
	}

}
