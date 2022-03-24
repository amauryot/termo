package view.subpanel.textfields;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class SubPanelTextFields extends JPanel {

	private static final long serialVersionUID = -8858760640724548839L;

	private final int GRID_ROWS = 6;
	private final int GRID_COLS = 5;
	private final int GRID_HGAP = 10;
	private final int GRID_VGAP = 10;
	
	private final int SUBPANEL_X      = 70;
	private final int SUBPANEL_Y      = 10;
	private final int SUBPANEL_WIDTH  = 290;
	private final int SUBPANEL_HEIGHT = 350;
	
	private JTextField[][] textFieldArray;
	
	public SubPanelTextFields() {
		super();
		initialize();
	}
	
	public JTextField[][] textFieldArray() {
		return textFieldArray;
	}
	
	private void initialize() {
		
		/* SUBPANEL */
		
		this.setLayout(new GridLayout(GRID_ROWS, GRID_COLS, GRID_HGAP, GRID_VGAP));
		this.setBounds(SUBPANEL_X, SUBPANEL_Y, SUBPANEL_WIDTH, SUBPANEL_HEIGHT);
		
		/* FONT */
		
		Font textFieldFont = new Font("Tahoma", Font.PLAIN, 35);
		
		/* TEXT FIELDS */
		
		textFieldArray = new JTextField[GRID_ROWS][GRID_COLS];
		
		for (int row = 0; row < GRID_ROWS; row++) {
			for (int column = 0; column < GRID_COLS; column++) {
				JTextField textField = new JTextField();
				textField.setHorizontalAlignment(JTextField.CENTER);
				textField.setFont(textFieldFont);
				textField.setEditable(false);
				this.add(textField);
				textFieldArray[row][column] = textField;
			}
		}
	}
}
