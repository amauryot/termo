package view.subpanel.buttons;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SubPanelButtons extends JPanel {

	private static final long serialVersionUID = 6490841755439655227L;

	private final int GRID_ROWS = 1;
	private final int GRID_COLS = 2;
	private final int GRID_HGAP = 78;
	private final int GRID_VGAP = 0;
	
	private final int SUBPANEL_X      = 86;
	private final int SUBPANEL_Y      = 570;
	private final int SUBPANEL_WIDTH  = 258;
	private final int SUBPANEL_HEIGHT = 30;
	
	private ArrayList<JButton> buttonList;
	
	public SubPanelButtons() {
		super();
		initialize();
	}
	
	public ArrayList<JButton> buttonList() {
		return buttonList;
	}
	
	private void initialize() {
		
		/* SUBPANEL */
		
		this.setLayout(new GridLayout(GRID_ROWS, GRID_COLS, GRID_HGAP, GRID_VGAP));
		this.setBounds(SUBPANEL_X, SUBPANEL_Y, SUBPANEL_WIDTH, SUBPANEL_HEIGHT);
		
		/* FONT */
		
		Font buttonFont = new Font("Tahoma", Font.BOLD, 14);
		
		/* BUTTONS */
		
		buttonList = new ArrayList<JButton>();
		
		for (Button buttonEnum : Button.values()) {
			JButton button = new JButton(buttonEnum.title());
			button.setFont(buttonFont);
			button.setMargin(new Insets(0, 0, 0, 0));
			button.setFocusable(false);
			this.add(button);
			buttonList.add(button);
		}
	}
}
