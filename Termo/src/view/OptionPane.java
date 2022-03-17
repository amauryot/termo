package view;

import javax.swing.JOptionPane;

public class OptionPane {

	private final String MESSAGE_TITLE = "Sobre Termo";
	private final String MESSAGE_ABOUT = 
		"Termo"
		+ "\nCopyright � Mar 2022"
		+ "\n\nVers�o: 0.3.0"
		+ "\n\nAmaury Tavares"
		+ "\namauryot@gmail.com\n\n";
	
	public void showMessageAbout() {
		JOptionPane.showMessageDialog(null, MESSAGE_ABOUT, MESSAGE_TITLE, JOptionPane.INFORMATION_MESSAGE);
	}
}
