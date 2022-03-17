package view;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Insets;

public class Window {

	private JFrame frame;

	public Window() {
		initialize();
	}

	public void show() {
		frame.setVisible(true);
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Termo");
		frame.setBounds(100, 100, 483, 696);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("Menu");
		menuBar.add(menu);
		
		JMenuItem menuItemNewGame = new JMenuItem("Novo Jogo");
		menu.add(menuItemNewGame);
		
		JMenuItem menuItemExit = new JMenuItem("Sair");
		menu.add(menuItemExit);
		
		JMenu menuHelp = new JMenu("Ajuda");
		menuBar.add(menuHelp);
		
		JMenuItem menuItemRules = new JMenuItem("Regras");
		menuHelp.add(menuItemRules);
		
		JMenuItem menuItemAbout = new JMenuItem("Sobre");
		menuHelp.add(menuItemAbout);
		frame.getContentPane().setLayout(null);
		
		JPanel panelMain = new JPanel();
		panelMain.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelMain.setBounds(10, 10, 430, 610);
		frame.getContentPane().add(panelMain);
		panelMain.setLayout(null);
		
		JPanel subPanelTextFields = new JPanel();
		subPanelTextFields.setBounds(70, 10, 290, 350);
		panelMain.add(subPanelTextFields);
		subPanelTextFields.setLayout(new GridLayout(6, 5, 10, 10));
		
		JTextField textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_1.setColumns(10);
		subPanelTextFields.add(textField_1);
		
		JTextField textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_2.setColumns(10);
		subPanelTextFields.add(textField_2);
		
		JTextField textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setColumns(10);
		subPanelTextFields.add(textField);
		
		JTextField textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_3.setColumns(10);
		subPanelTextFields.add(textField_3);
		
		JTextField textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_4.setColumns(10);
		subPanelTextFields.add(textField_4);
		
		JTextField textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_6.setColumns(10);
		subPanelTextFields.add(textField_6);
		
		JTextField textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_5.setColumns(10);
		subPanelTextFields.add(textField_5);
		
		JTextField textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_8.setColumns(10);
		subPanelTextFields.add(textField_8);
		
		JTextField textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_7.setColumns(10);
		subPanelTextFields.add(textField_7);
		
		JTextField textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_12.setColumns(10);
		subPanelTextFields.add(textField_12);
		
		JTextField textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_11.setColumns(10);
		subPanelTextFields.add(textField_11);
		
		JTextField textField_18 = new JTextField();
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_18.setColumns(10);
		subPanelTextFields.add(textField_18);
		
		JTextField textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_10.setColumns(10);
		subPanelTextFields.add(textField_10);
		
		JTextField textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_9.setColumns(10);
		subPanelTextFields.add(textField_9);
		
		JTextField textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_13.setColumns(10);
		subPanelTextFields.add(textField_13);
		
		JTextField textField_16 = new JTextField();
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_16.setColumns(10);
		subPanelTextFields.add(textField_16);
		
		JTextField textField_15 = new JTextField();
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_15.setColumns(10);
		subPanelTextFields.add(textField_15);
		
		JTextField textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_14.setColumns(10);
		subPanelTextFields.add(textField_14);
		
		JTextField textField_20 = new JTextField();
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_20.setColumns(10);
		subPanelTextFields.add(textField_20);
		
		JTextField textField_24 = new JTextField();
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_24.setColumns(10);
		subPanelTextFields.add(textField_24);
		
		JTextField textField_17 = new JTextField();
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_17.setColumns(10);
		subPanelTextFields.add(textField_17);
		
		JTextField textField_19 = new JTextField();
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_19.setColumns(10);
		subPanelTextFields.add(textField_19);
		
		JTextField textField_21 = new JTextField();
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_21.setColumns(10);
		subPanelTextFields.add(textField_21);
		
		JTextField textField_26 = new JTextField();
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_26.setColumns(10);
		subPanelTextFields.add(textField_26);
		
		JTextField textField_25 = new JTextField();
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_25.setColumns(10);
		subPanelTextFields.add(textField_25);
		
		JTextField textField_22 = new JTextField();
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_22.setColumns(10);
		subPanelTextFields.add(textField_22);
		
		JTextField textField_23 = new JTextField();
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_23.setColumns(10);
		subPanelTextFields.add(textField_23);
		
		JTextField textField_27 = new JTextField();
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_27.setColumns(10);
		subPanelTextFields.add(textField_27);
		
		JTextField textField_28 = new JTextField();
		textField_28.setHorizontalAlignment(SwingConstants.CENTER);
		textField_28.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_28.setColumns(10);
		subPanelTextFields.add(textField_28);
		
		JTextField textField_29 = new JTextField();
		textField_29.setHorizontalAlignment(SwingConstants.CENTER);
		textField_29.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_29.setColumns(10);
		subPanelTextFields.add(textField_29);
		
		JPanel subPanelKeyboard = new JPanel();
		subPanelKeyboard.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		subPanelKeyboard.setBounds(10, 370, 410, 190);
		panelMain.add(subPanelKeyboard);
		subPanelKeyboard.setLayout(null);
		
		JPanel subPanel1 = new JPanel();
		subPanel1.setBounds(10, 11, 390, 50);
		subPanelKeyboard.add(subPanel1);
		subPanel1.setLayout(new GridLayout(1, 10, 10, 0));
		
		JButton btnNewButton = new JButton("Q");
		btnNewButton.setFocusable(false);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setMargin(new Insets(0, 0, 0, 0));
		subPanel1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Q");
		btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setFocusable(false);
		subPanel1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Q");
		btnNewButton_2.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setFocusable(false);
		subPanel1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Q");
		btnNewButton_3.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setFocusable(false);
		subPanel1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Q");
		btnNewButton_4.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4.setFocusable(false);
		subPanel1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Q");
		btnNewButton_5.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_5.setFocusable(false);
		subPanel1.add(btnNewButton_5);
		
		JButton btnNewButton_1_1 = new JButton("Q");
		btnNewButton_1_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1.setFocusable(false);
		subPanel1.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Q");
		btnNewButton_2_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2_1.setFocusable(false);
		subPanel1.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("Q");
		btnNewButton_3_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3_1.setFocusable(false);
		subPanel1.add(btnNewButton_3_1);
		
		JButton btnNewButton_4_1 = new JButton("Q");
		btnNewButton_4_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4_1.setFocusable(false);
		subPanel1.add(btnNewButton_4_1);
		
		JPanel subPanel2 = new JPanel();
		subPanel2.setBounds(30, 70, 350, 50);
		subPanelKeyboard.add(subPanel2);
		subPanel2.setLayout(new GridLayout(1, 9, 10, 0));
		
		JButton btnNewButton_6 = new JButton("Q");
		btnNewButton_6.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_6.setFocusable(false);
		subPanel2.add(btnNewButton_6);
		
		JButton btnNewButton_1_2 = new JButton("Q");
		btnNewButton_1_2.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_2.setFocusable(false);
		subPanel2.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("Q");
		btnNewButton_2_2.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2_2.setFocusable(false);
		subPanel2.add(btnNewButton_2_2);
		
		JButton btnNewButton_3_2 = new JButton("Q");
		btnNewButton_3_2.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3_2.setFocusable(false);
		subPanel2.add(btnNewButton_3_2);
		
		JButton btnNewButton_4_2 = new JButton("Q");
		btnNewButton_4_2.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_4_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4_2.setFocusable(false);
		subPanel2.add(btnNewButton_4_2);
		
		JButton btnNewButton_5_1 = new JButton("Q");
		btnNewButton_5_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_5_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_5_1.setFocusable(false);
		subPanel2.add(btnNewButton_5_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Q");
		btnNewButton_1_1_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1_1.setFocusable(false);
		subPanel2.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2_1_1 = new JButton("Q");
		btnNewButton_2_1_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2_1_1.setFocusable(false);
		subPanel2.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_3_1_1 = new JButton("Q");
		btnNewButton_3_1_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3_1_1.setFocusable(false);
		subPanel2.add(btnNewButton_3_1_1);
		
		JPanel subPanel3 = new JPanel();
		subPanel3.setBounds(70, 130, 270, 50);
		subPanelKeyboard.add(subPanel3);
		subPanel3.setLayout(new GridLayout(1, 7, 10, 0));
		
		JButton btnNewButton_6_1 = new JButton("Q");
		btnNewButton_6_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_6_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_6_1.setFocusable(false);
		subPanel3.add(btnNewButton_6_1);
		
		JButton btnNewButton_1_2_1 = new JButton("Q");
		btnNewButton_1_2_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_2_1.setFocusable(false);
		subPanel3.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_2_2_1 = new JButton("Q");
		btnNewButton_2_2_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2_2_1.setFocusable(false);
		subPanel3.add(btnNewButton_2_2_1);
		
		JButton btnNewButton_3_2_1 = new JButton("Q");
		btnNewButton_3_2_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3_2_1.setFocusable(false);
		subPanel3.add(btnNewButton_3_2_1);
		
		JButton btnNewButton_4_2_1 = new JButton("Q");
		btnNewButton_4_2_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_4_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4_2_1.setFocusable(false);
		subPanel3.add(btnNewButton_4_2_1);
		
		JButton btnNewButton_5_1_1 = new JButton("Q");
		btnNewButton_5_1_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_5_1_1.setFocusable(false);
		subPanel3.add(btnNewButton_5_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Q");
		btnNewButton_1_1_1_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1_1_1.setFocusable(false);
		subPanel3.add(btnNewButton_1_1_1_1);
		
		JPanel subPanelButtons = new JPanel();
		subPanelButtons.setBounds(86, 570, 258, 30);
		panelMain.add(subPanelButtons);
		subPanelButtons.setLayout(new GridLayout(1, 2, 78, 0));
		
		JButton buttonVerify = new JButton("Verificar");
		buttonVerify.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttonVerify.setFocusable(false);
		subPanelButtons.add(buttonVerify);
		
		JButton buttonClear = new JButton("Limpar");
		buttonClear.setFocusable(false);
		buttonClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		subPanelButtons.add(buttonClear);
	}
}
