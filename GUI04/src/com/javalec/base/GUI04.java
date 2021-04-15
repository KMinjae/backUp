package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI04 {

	private JFrame frmPasswordfield;
	private JPasswordField pfInput;
	private JLabel lblNewLabel;
	private JButton btnOK;
	private JTextField tfMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI04 window = new GUI04();
					window.frmPasswordfield.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPasswordfield = new JFrame();
		frmPasswordfield.setTitle("PasswordField");
		frmPasswordfield.setBounds(100, 100, 450, 300);
		frmPasswordfield.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPasswordfield.getContentPane().setLayout(null);
		frmPasswordfield.getContentPane().add(getPfInput());
		frmPasswordfield.getContentPane().add(getLblNewLabel());
		frmPasswordfield.getContentPane().add(getBtnOK());
		frmPasswordfield.getContentPane().add(getTfMessage());
	}
	private JPasswordField getPfInput() {
		if (pfInput == null) {
			pfInput = new JPasswordField();
			pfInput.setBounds(79, 97, 168, 26);
		}
		return pfInput;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Password");
			lblNewLabel.setBounds(6, 102, 61, 16);
		}
		return lblNewLabel;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkPassword();
				}
			});
			btnOK.setBounds(259, 97, 117, 29);
		}
		return btnOK;
	}
	private JTextField getTfMessage() {
		if (tfMessage == null) {
			tfMessage = new JTextField();
			tfMessage.setBounds(79, 135, 130, 26);
			tfMessage.setColumns(10);
		}
		return tfMessage;
	}
	
	
	private void checkPassword() {
		// TODO Auto-generated method stub
//		String str = pfInput.getText(); // getText(); 는 위험하다고 줄이 그어짐
		char[] str = pfInput.getPassword();
		String passString = new String(str);
		
		tfMessage.setText(passString);
	}
}
