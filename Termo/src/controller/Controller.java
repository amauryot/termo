package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Word;
import view.OptionPane;
import view.Window;
import view.frame.MenuItem;
import view.subpanel.buttons.Button;
import view.subpanel.keyboard.Key;

public class Controller implements ActionListener {

	private Word wordDatabase;
	private OptionPane optionPane;
	private Window window;
	
	public Controller() {
		wordDatabase = new Word();
		optionPane = new OptionPane();
		window = new Window();
	}
	
	public void run() {
		window.show();
		window.addController(this);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		/* MENU ITEM NEW GAME */
		
		if (event.getSource() == window.getMenuItem(MenuItem.NEW_GAME)) {
			window.reset();
			wordDatabase.nextWord();
			return;
		}
		
		/* MENU ITEM EXIT */
		
		if (event.getSource() == window.getMenuItem(MenuItem.EXIT)) {
			window.close();
		}
		
		/* MENU ITEM RULES */
		
		if (event.getSource() == window.getMenuItem(MenuItem.RULES)) {
			// TODO
			return;
		}
		
		/* MENU ITEM ABOUT */
		
		if (event.getSource() == window.getMenuItem(MenuItem.ABOUT)) {
			optionPane.showMessageAbout();
			return;
		}
		
		/* BUTTON CHECK */
		
		if (event.getSource() == window.getButton(Button.CHECK)) {
			for (int column = 0; column < window.numberOfLetters(); column++) {
				window.paint(column, Color.GRAY);
				
				if (wordDatabase.word().contains(window.userLetter(column))) {
					window.paint(column, Color.YELLOW);
				}
				
				if (wordDatabase.letter(column).equals(window.userLetter(column))) {
					window.paint(column, Color.GREEN);
				}
			}
			
			if (wordDatabase.word().equals(window.userWord())) {
				optionPane.showMessageWinner();
				window.reset();
				wordDatabase.nextWord();
				return;
			}
			
			window.nextRow();
			return;
		}
		
		/* BUTTON CLEAR */
		
		if (event.getSource() == window.getButton(Button.CLEAR)) {
			window.clearActualRow();
			return;
		}
		
		/* KEY 'Q' */
		
		if (event.getSource() == window.getKey(Key.Q)) {
			window.setLetter("Q");
			return;
		}
		
		/* KEY 'W' */
		
		if (event.getSource() == window.getKey(Key.W)) {
			window.setLetter("W");
			return;
		}
		
		/* KEY 'E' */
		
		if (event.getSource() == window.getKey(Key.E)) {
			window.setLetter("E");
			return;
		}
		
		/* KEY 'R' */
		
		if (event.getSource() == window.getKey(Key.R)) {
			window.setLetter("R");
			return;
		}
		
		/* KEY 'T' */
		
		if (event.getSource() == window.getKey(Key.T)) {
			window.setLetter("T");
			return;
		}
		
		/* KEY 'Y' */
		
		if (event.getSource() == window.getKey(Key.Y)) {
			window.setLetter("Y");
			return;
		}
		
		/* KEY 'U' */
		
		if (event.getSource() == window.getKey(Key.U)) {
			window.setLetter("U");
			return;
		}
		
		/* KEY 'I' */
		
		if (event.getSource() == window.getKey(Key.I)) {
			window.setLetter("I");
			return;
		}
		
		/* KEY 'O' */
		
		if (event.getSource() == window.getKey(Key.O)) {
			window.setLetter("O");
			return;
		}
		
		/* KEY 'P' */
		
		if (event.getSource() == window.getKey(Key.P)) {
			window.setLetter("P");
			return;
		}
		
		/* KEY 'A' */
		
		if (event.getSource() == window.getKey(Key.A)) {
			window.setLetter("A");
			return;
		}
		
		/* KEY 'S' */
		
		if (event.getSource() == window.getKey(Key.S)) {
			window.setLetter("S");
			return;
		}
		
		/* KEY 'D' */
		
		if (event.getSource() == window.getKey(Key.D)) {
			window.setLetter("D");
			return;
		}
		
		/* KEY 'F' */
		
		if (event.getSource() == window.getKey(Key.F)) {
			window.setLetter("F");
			return;
		}
		
		/* KEY 'G' */
		
		if (event.getSource() == window.getKey(Key.G)) {
			window.setLetter("G");
			return;
		}
		
		/* KEY 'H' */
		
		if (event.getSource() == window.getKey(Key.H)) {
			window.setLetter("H");
			return;
		}
		
		/* KEY 'J' */
		
		if (event.getSource() == window.getKey(Key.J)) {
			window.setLetter("J");
			return;
		}
		
		/* KEY 'K' */
		
		if (event.getSource() == window.getKey(Key.K)) {
			window.setLetter("K");
			return;
		}
		
		/* KEY 'L' */
		
		if (event.getSource() == window.getKey(Key.L)) {
			window.setLetter("L");
			return;
		}
		
		/* KEY 'Z' */
		
		if (event.getSource() == window.getKey(Key.Z)) {
			window.setLetter("Z");
			return;
		}
		
		/* KEY 'X' */
		
		if (event.getSource() == window.getKey(Key.X)) {
			window.setLetter("X");
			return;
		}
		
		/* KEY 'C' */
		
		if (event.getSource() == window.getKey(Key.C)) {
			window.setLetter("C");
			return;
		}
		
		/* KEY 'V' */
		
		if (event.getSource() == window.getKey(Key.V)) {
			window.setLetter("V");
			return;
		}
		
		/* KEY 'B' */
		
		if (event.getSource() == window.getKey(Key.B)) {
			window.setLetter("B");
			return;
		}
		
		/* KEY 'N' */
		
		if (event.getSource() == window.getKey(Key.N)) {
			window.setLetter("N");
			return;
		}
		
		/* KEY 'M' */
		
		if (event.getSource() == window.getKey(Key.M)) {
			window.setLetter("M");
			return;
		}
	}
}
