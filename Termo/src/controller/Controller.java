package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.OptionPane;
import view.Window;
import view.frame.MenuItem;

public class Controller implements ActionListener {

	private OptionPane optionPane;
	private Window window;
	
	public Controller() {
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
			// TODO
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
	}
}
