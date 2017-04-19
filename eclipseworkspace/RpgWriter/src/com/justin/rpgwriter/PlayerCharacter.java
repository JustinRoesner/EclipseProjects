package com.justin.rpgwriter;

public class PlayerCharacter {
	private String name;
	private int intellect;
	private int strength;
	private int charisma;
	private int stamina;
	public PlayerCharacter(String name, int intellect, int strength, int charisma, int stamina) {
		super();
		this.name = name;
		this.intellect = intellect;
		this.strength = strength;
		this.charisma = charisma;
		this.stamina = stamina;
	}
	public String getName() {
		return name;
	}
	public int getIntellect() {
		return intellect;
	}
	public int getStrength() {
		return strength;
	}
	public int getCharisma() {
		return charisma;
	}
	public int getStamina() {
		return stamina;
	}
	
	
	
}
