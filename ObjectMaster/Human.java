package com.codingdojo.objectmaster;

public class Human{
	private int healthLevel;
	private int strengthLevel;
	private int stealthLevel;
	private int intelligenceLevel;
	private int attackLevel;
	
	public Human(){
		healthLevel = 100;
		strengthLevel = 3;
		stealthLevel = 3;
		intelligenceLevel = 3;
		attackLevel = 3;

	}
	public void displayHealth() {
		System.out.println("Health level starts at: " + healthLevel);
	}
	public void displayStrength() {
		System.out.println("Strength level starts at: " + strengthLevel);
	}
	public void displayStealth() {
		System.out.println("Stealth level starts at: " + stealthLevel);
	}
	public void displayIntelligence() {
		System.out.println("Intelligence level starts at: " + intelligenceLevel);
	}

	public int setHealth(int healthVal) {
		healthLevel += strengthLevel;
		return healthLevel;
	}
	public int setStrength(int strengthVal) {
		strengthLevel += strengthVal;
		return strengthLevel;
	}
	public int setStealth(int stealthVal) {
		stealthLevel += stealthVal;
		return stealthLevel;
	}
	public int setIntelligence(int intelligenceVal) {
		intelligenceLevel += intelligenceVal;
		return intelligenceLevel;
	}
}