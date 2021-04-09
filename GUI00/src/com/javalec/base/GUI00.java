package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class GUI00 {

	private JFrame frmGui;
	private JButton btnNewButton;
	private JLabel lblTset;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI00 window = new GUI00();
					window.frmGui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI00() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGui = new JFrame();
		frmGui.setTitle("GUI00");
		frmGui.setBounds(100, 100, 450, 300);
		frmGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGui.getContentPane().setLayout(null);
		frmGui.getContentPane().add(getBtnNewButton());
		frmGui.getContentPane().add(getLblTset());
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("OK");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Message");
					lblTset.setText("Button을 클릭했습니다.");
				}
			});
			btnNewButton.setBounds(158, 55, 117, 29);
		}
		return btnNewButton;
	}
	private JLabel getLblTset() {
		if (lblTset == null) {
			lblTset = new JLabel("New label");
			lblTset.setBounds(113, 27, 264, 16);
		}
		return lblTset;
	}
}
