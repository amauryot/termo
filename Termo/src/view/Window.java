package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JMenuItem;

import controller.Controller;
import view.frame.Frame;
import view.frame.MenuItem;
import view.panel.PanelMain;
import view.subpanel.buttons.Button;
import view.subpanel.buttons.SubPanelButtons;
import view.subpanel.keyboard.SubPanelKeyboard;
import view.subpanel.textfields.SubPanelTextFields;

public class Window {

	private final int WORDS = 6;
	private final int LETTERS = 5;
	
	private Frame frame;
	private PanelMain panelMain;
	private SubPanelTextFields subPanelTextFields;
	private SubPanelKeyboard subPanelKeyboard;
	private SubPanelButtons subPanelButtons;
	private int actualRow;
	
	public Window() {
		initialize();
		selectRow(0);
	}

	public JMenuItem getMenuItem(MenuItem menuItem) {
		return frame.menuItemList().get(menuItem.index());
	}
	
	public JButton getButton(Button button) {
		return subPanelButtons.buttonList().get(button.index());
	}
	
	public int getLetters() {
		return LETTERS;
	}
	
	public String userWord() {
		String word = "";
		
		for (int column = 0; column < LETTERS; column++) {
			word += subPanelTextFields.textFieldArray()[actualRow][column].getText();
		}
		
		return word;
	}
	
	public String userLetter(int column) {
		return subPanelTextFields.textFieldArray()[actualRow][column].getText();
	}
	
	public void paint(int column, Color color) {
		subPanelTextFields.textFieldArray()[actualRow][column].setBackground(color);
		subPanelKeyboard.keyList().forEach(key -> {
			if (key.getText().equals(subPanelTextFields.textFieldArray()[actualRow][column].getText())) {
				key.setBackground(color);
			}
		});
	}
	
	private void selectRow(int row) {
		actualRow = row;
		
		for (int column = 0; column < LETTERS; column++) {
			subPanelTextFields.textFieldArray()[actualRow][column].setEditable(true);
		}
		
		subPanelTextFields.textFieldArray()[actualRow][0].requestFocusInWindow();
	}
	
	public void nextRow() {
		selectRow(actualRow + 1);
	}
	
	public void clearActualRow() {
		for (int column = 0; column < LETTERS; column++) {
			subPanelTextFields.textFieldArray()[actualRow][column].setText("");
			subPanelTextFields.textFieldArray()[actualRow][column].setBackground(Color.WHITE);
		}
		
		subPanelKeyboard.keyList().forEach(key -> key.setBackground(null));
		
		subPanelTextFields.textFieldArray()[actualRow][0].requestFocusInWindow();
	}
	
	public void reset() {
		for (int row = 0; row < WORDS; row++) {
			for (int column = 0; column < LETTERS; column++) {
				subPanelTextFields.textFieldArray()[row][column].setText("");
				subPanelTextFields.textFieldArray()[row][column].setBackground(null);
				subPanelTextFields.textFieldArray()[row][column].setEditable(false);
			}
		}
		
		subPanelKeyboard.keyList().forEach(key -> key.setBackground(null));
		
		selectRow(0);
	}
	
	public void addController(Controller controller) {
		frame.menuItemList().forEach(menuItem -> menuItem.addActionListener(controller));
		subPanelButtons.buttonList().forEach(button -> button.addActionListener(controller));
	}
	
	public void show() {
		frame.setVisible(true);
	}

	public void close() {
		frame.dispose();
	}
	
	private void initialize() {
		frame = new Frame();
		
		panelMain = new PanelMain();
		frame.getContentPane().add(panelMain);
		
		subPanelTextFields = new SubPanelTextFields();
		panelMain.add(subPanelTextFields);
		
		subPanelKeyboard = new SubPanelKeyboard();
		panelMain.add(subPanelKeyboard);
		
		subPanelButtons = new SubPanelButtons();
		panelMain.add(subPanelButtons);
	}
}
