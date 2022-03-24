package model;

import java.util.Random;

public class Word {

	private int index;
	private Random random;
	private Database database;
	
	public Word() {
		random = new Random();
		database = new Database();
		nextWord();
	}
	
	public void nextWord() {
		index = random.nextInt(database.size());
		System.out.println(word());
	}
	
	public String word() {
		return database.getWord(index);
	}
	
	public String letter(int column) {
		return word().split("")[column];
	}
}
