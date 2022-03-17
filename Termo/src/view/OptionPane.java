package view;

import javax.swing.JOptionPane;

public class OptionPane {

	private final String MESSAGE_WINNER = "Parabéns! Você acertou a palavra.";
	private final String WINNER_TITLE = "Vencedor!";
	private final String MESSAGE_TITLE = "Sobre Termo";
	private final String MESSAGE_ABOUT = 
		"Termo"
		+ "\nCopyright © Mar 2022"
		+ "\n\nVersão: 0.4.1"
		+ "\n\nAmaury Tavares"
		+ "\namauryot@gmail.com\n\n";
	
	public void showMessageAbout() {
		JOptionPane.showMessageDialog(null, MESSAGE_ABOUT, MESSAGE_TITLE, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void showMessageWinner() {
		JOptionPane.showMessageDialog(null, MESSAGE_WINNER, WINNER_TITLE, JOptionPane.INFORMATION_MESSAGE);
	}
}
