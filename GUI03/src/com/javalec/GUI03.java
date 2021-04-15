package com.javalec;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.ButtonGroup;

public class GUI03 {

	private JFrame frame;
	private JCheckBox chApple;
	private JCheckBox chBanana;
	private JButton btOk;
	private JTextField tfFruit;
	private JRadioButton rbKBS;
	private JRadioButton rbMbc;
	private JButton btOk02;
	private JTextField tfBorad;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI03 window = new GUI03();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getChApple());
		frame.getContentPane().add(getChBanana());
		frame.getContentPane().add(getBtOk());
		frame.getContentPane().add(getTfFruit());
		frame.getContentPane().add(getRbKBS());
		frame.getContentPane().add(getRbMbc());
		frame.getContentPane().add(getBtOk02());
		frame.getContentPane().add(getTfBorad());
	}
	private JCheckBox getChApple() {
		if (chApple == null) {
			chApple = new JCheckBox("Apple");
			chApple.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck();
				}
			});
			chApple.setBounds(6, 6, 128, 23);
		}
		return chApple;
	}
	private JCheckBox getChBanana() {
		if (chBanana == null) {
			chBanana = new JCheckBox("Banana");
			chBanana.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck();
				}
			});
			chBanana.setBounds(6, 41, 128, 23);
		}
		return chBanana;
	}
	private JButton getBtOk() {
		if (btOk == null) {
			btOk = new JButton("OK");
			btOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck();
				}
			});
			btOk.setBounds(6, 76, 117, 29);
		}
		return btOk;
	}
	private JTextField getTfFruit() {
		if (tfFruit == null) {
			tfFruit = new JTextField();
			tfFruit.setBounds(16, 117, 118, 23);
			tfFruit.setColumns(10);
		}
		return tfFruit;
	}
	// ________________________________________________________

	private void fruitCheck(){
		tfFruit.setText("");
		if(chApple.isSelected() ==true) {
			tfFruit.setText("Apple이 선택 되었습니다.");
		}
		if(chBanana.isSelected() ==true) {
			tfFruit.setText("Banana이(가) 선택 되었습니다.");
		}
		if(chApple.isSelected() ==true && chBanana.isSelected() ==true) {
			tfFruit.setText("Apple & Banana이(가) 선택 되었습니다.");
		}
		
		
		
	}
	private JRadioButton getRbKBS() {
		if (rbKBS == null) {
			rbKBS = new JRadioButton("KBS");
			rbKBS.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			buttonGroup.add(rbKBS);
			rbKBS.setBounds(146, 6, 141, 23);
		}
		return rbKBS;
	}
	private JRadioButton getRbMbc() {
		if (rbMbc == null) {
			rbMbc = new JRadioButton("MBC");
			rbMbc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			buttonGroup.add(rbMbc);
			rbMbc.setBounds(146, 41, 141, 23);
		}
		return rbMbc;
	}
	private JButton getBtOk02() {
		if (btOk02 == null) {
			btOk02 = new JButton("OK");
			btOk02.setBounds(146, 76, 117, 29);
		}
		return btOk02;
	}
	private JTextField getTfBorad() {
		if (tfBorad == null) {
			tfBorad = new JTextField();
			tfBorad.setColumns(10);
			tfBorad.setBounds(146, 116, 118, 23);
		}
		return tfBorad;
	}
	
	private void broadCheck() {
		tfFruit.setText("");
		if(rbKBS.isSelected()==true) {
			tfBorad.setText("KBS가 선택 되었습니다.");
		}
		if(rbMbc.isSelected()==true) {
			tfBorad.setText("MBC가 선택 되었습니다.");
		}
	}
}
