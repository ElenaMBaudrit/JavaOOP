package com.codingdojo.pokemon;

//Create an interface for the following methods:
//    createPokemon(String name, int health, String type): This method creates and returns Pokemon.
//    attackPokemon(Pokemon pokemon): This method lowers the attacked Pokemon's health by 10 and returns void
//    pokemonInfo(Pokemon pokemon): This method returns a String with the name, health, and type of the pokemon
public interface PokemonInterface {
	static Pokemon createPokemon (String name, int health, String type) {
		Pokemon newPokemon = new Pokemon();
		return newPokemon;
	}
	static void attackPokemon (Pokemon pokemon) {
		pokemon.setHealth(pokemon.getHealth()-10);
	    
	}
	public String pokemonInfo (Pokemon pokemon) {
		String health = String.valueOf(pokemon.getHealth());
		String result = "Name : "+pokemon.getName()+", Health: "+pokemon.getHealth()+", Type: "+pokemon.getType();
		return result;
	}	
}
