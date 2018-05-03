package com.codingdojo.pokemon;

public class Pokemon {
//name health type
	private String name;
	private int health;
	private String type;
	public static int numberOfPokemons = 0;
	
	public Pokemon (String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		numberOfPokemons++;
	}
	
	public String getName() {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	
	public int getHealth() {
		return health;
	}
	public void setHealth (int health) {
		this.health = health;
	}
	
	public String getType() {
		return type;
	}
	public void setType (String type) {
		this.type = type;
	}
    public static short getNumberOfPokemons () {
        return numberOfPokemons;
}
}
