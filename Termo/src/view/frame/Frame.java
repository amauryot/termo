package view.frame;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Frame extends JFrame {

	private static final long serialVersionUID = 8296914021670968846L;

	private final String MENU_TITLE = "Menu";
	private final String MENU_HELP_TITLE = "Ajuda";
	private final String FRAME_TITLE = "Termo";
	private final int FRAME_WIDTH = 465;
	private final int FRAME_HEIGHT = 691;
	
	private JMenu menu;
	private JMenu menuHelp;
	private ArrayList<JMenuItem> menuItemList;
	
	public Frame() {
		super();
		initialize();
	}
	
	public ArrayList<JMenuItem> menuItemList() {
		return menuItemList;
	}
	
	private JMenu menu(int index) {
		if (index < 2) return menu;
		return menuHelp;
	}
	
	private void initialize() {
		
		/* FRAME */
		
		this.setTitle(FRAME_TITLE);
		this.getContentPane().setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		/* MENU */
		
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		menu = new JMenu(MENU_TITLE);
		menuBar.add(menu);
		
		menuHelp = new JMenu(MENU_HELP_TITLE);
		menuBar.add(menuHelp);
		
		menuItemList = new ArrayList<JMenuItem>();
		
		for (MenuItem menuItemEnum : MenuItem.values()) {
			JMenuItem menuItem = new JMenuItem(menuItemEnum.title());
			menu(menuItemEnum.index()).add(menuItem);
			menuItemList.add(menuItem);
		}
	}
}
