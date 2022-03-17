package model;

import java.util.Random;

public class Word {

	private Random random;
	private Database database;
	private int index;
	
	public Word() {
		random = new Random();
		database = new Database();
		nextWord();
		System.out.println(word());
	}
	
	public void nextWord() {
		index = random.nextInt(database.size());
	}
	
	public String word() {
		return database.getWord(index);
	}
	
	public String letter(int column) {
		return word().split("")[column];
	}
}
