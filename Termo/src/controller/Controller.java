package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Word;
import view.OptionPane;
import view.Window;
import view.frame.MenuItem;
import view.subpanel.buttons.Button;

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
			for (int column = 0; column < window.getLetters(); column++) {
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
	}
}
