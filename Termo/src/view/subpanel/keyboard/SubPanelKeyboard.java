package view.subpanel.keyboard;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class SubPanelKeyboard extends JPanel {

	private static final long serialVersionUID = 7179741503899190282L;

	private final int GRID_1_ROWS = 1;
	private final int GRID_1_COLS = 10;
	private final int GRID_1_HGAP = 10;
	private final int GRID_1_VGAP = 0;
	
	private final int GRID_2_ROWS = 1;
	private final int GRID_2_COLS = 9;
	private final int GRID_2_HGAP = 10;
	private final int GRID_2_VGAP = 0;
	
	private final int GRID_3_ROWS = 1;
	private final int GRID_3_COLS = 7;
	private final int GRID_3_HGAP = 10;
	private final int GRID_3_VGAP = 0;
	
	private final int SUBPANEL_X      = 10;
	private final int SUBPANEL_Y      = 370;
	private final int SUBPANEL_WIDTH  = 410;
	private final int SUBPANEL_HEIGHT = 190;
	
	private final int SUBPANEL_1_X      = 10;
	private final int SUBPANEL_1_Y      = 10;
	private final int SUBPANEL_1_WIDTH  = 390;
	private final int SUBPANEL_1_HEIGHT = 50;
	
	private final int SUBPANEL_2_X      = 30;
	private final int SUBPANEL_2_Y      = 70;
	private final int SUBPANEL_2_WIDTH  = 350;
	private final int SUBPANEL_2_HEIGHT = 50;
	
	private final int SUBPANEL_3_X      = 70;
	private final int SUBPANEL_3_Y      = 130;
	private final int SUBPANEL_3_WIDTH  = 270;
	private final int SUBPANEL_3_HEIGHT = 50;
	
	private JPanel subPanel1;
	private JPanel subPanel2;
	private JPanel subPanel3;
	
	private ArrayList<JButton> keyList;
	
	public SubPanelKeyboard() {
		super();
		initialize();
	}
	
	public ArrayList<JButton> keyList() {
		return keyList;
	}
	
	private JPanel subPanel(int index) {
		if (index < 10) return subPanel1;
		if (index < 19) return subPanel2;
		return subPanel3;
	}
	
	private void initialize() {
		
		/* SUBPANELS */
		
		this.setLayout(null);
		this.setBounds(SUBPANEL_X, SUBPANEL_Y, SUBPANEL_WIDTH, SUBPANEL_HEIGHT);
		this.setBorder(new EtchedBorder());
		
		subPanel1 = new JPanel();
		subPanel1.setLayout(new GridLayout(GRID_1_ROWS, GRID_1_COLS, GRID_1_HGAP, GRID_1_VGAP));
		subPanel1.setBounds(SUBPANEL_1_X, SUBPANEL_1_Y, SUBPANEL_1_WIDTH, SUBPANEL_1_HEIGHT);
		this.add(subPanel1);
		
		subPanel2 = new JPanel();
		subPanel2.setLayout(new GridLayout(GRID_2_ROWS, GRID_2_COLS, GRID_2_HGAP, GRID_2_VGAP));
		subPanel2.setBounds(SUBPANEL_2_X, SUBPANEL_2_Y, SUBPANEL_2_WIDTH, SUBPANEL_2_HEIGHT);
		this.add(subPanel2);
		
		subPanel3 = new JPanel();
		subPanel3.setLayout(new GridLayout(GRID_3_ROWS, GRID_3_COLS, GRID_3_HGAP, GRID_3_VGAP));
		subPanel3.setBounds(SUBPANEL_3_X, SUBPANEL_3_Y, SUBPANEL_3_WIDTH, SUBPANEL_3_HEIGHT);
		this.add(subPanel3);

		/* FONT */
		
		Font keyFont = new Font("Tahoma", Font.BOLD, 16);
		
		/* BUTTONS */
		
		keyList = new ArrayList<JButton>();
		
		for (Key key : Key.values()) {
			JButton button = new JButton(key.title());
			button.setFont(keyFont);
			button.setMargin(new Insets(0, 0, 0, 0));
			button.setFocusable(false);
			subPanel(key.index()).add(button);
			keyList.add(button);
		}
	}
}
