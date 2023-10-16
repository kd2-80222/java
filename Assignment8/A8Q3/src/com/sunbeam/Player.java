package com.sunbeam;

public abstract class Player {
	private int id;
	private int age;
	private String name;
	private int matchesPlayed;

	public Player() {}
	
	public Player(int id, int age, String name, int matchesPlayed) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.matchesPlayed = matchesPlayed;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", age=" + age + ", name=" + name + ", matchesPlayed=" + matchesPlayed + "]";
	}
	
}
