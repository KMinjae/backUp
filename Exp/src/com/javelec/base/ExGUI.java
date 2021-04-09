package com.javelec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExGUI {

	private JFrame frame;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblText;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExGUI window = new ExGUI();
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
	public ExGUI() {
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
		frame.getContentPane().add(getBtnNewButton());
		frame.getContentPane().add(getBtnNewButton_1());
		frame.getContentPane().add(getBtnNewButton_2());
		frame.getContentPane().add(getLblText());
		frame.getContentPane().add(getBtnNewButton_3());
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("1");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lblText.setText("1");
				}
			});
			btnNewButton.setBounds(48, 190, 117, 29);
		}
		return btnNewButton;
	}

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("2");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lblText.setText("2");
				}
			});
			btnNewButton_1.setBounds(170, 190, 117, 29);
		}
		return btnNewButton_1;
	}

	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("3");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lblText.setText("3");
				}
			});
			btnNewButton_2.setBounds(299, 190, 117, 29);
		}
		return btnNewButton_2;
	}

	private JLabel getLblText() {
		if (lblText == null) {
			lblText = new JLabel("New label");
			lblText.setBounds(48, 33, 340, 16);
		}
		return lblText;
	}

	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("CLEAR");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lblText.setText("");;
				}
			});
			btnNewButton_3.setBounds(48, 149, 117, 29);
		}
		return btnNewButton_3;
	}
}
