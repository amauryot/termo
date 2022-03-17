package view;

import javax.swing.JMenuItem;

import controller.Controller;
import view.frame.Frame;
import view.frame.MenuItem;
import view.panel.PanelMain;
import view.subpanel.buttons.SubPanelButtons;
import view.subpanel.keyboard.SubPanelKeyboard;
import view.subpanel.textfields.SubPanelTextFields;

public class Window {

	private Frame frame;
	private PanelMain panelMain;
	private SubPanelTextFields subPanelTextFields;
	private SubPanelKeyboard subPanelKeyboard;
	private SubPanelButtons subPanelButtons;

	public Window() {
		initialize();
	}

	public JMenuItem getMenuItem(MenuItem menuItem) {
		return frame.menuItemList().get(menuItem.index());
	}
	
	public void addController(Controller controller) {
		frame.menuItemList().forEach(menuItem -> menuItem.addActionListener(controller));
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
