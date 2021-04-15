package com.javalec.gui04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Password01 {

	private JFrame frame;
	private JTextField tfId;
	private JPasswordField pwPassword;
	private JLabel lblNewLabel;
	private JLabel lblPw;
	private JButton btnChack;
	private JTextField tfPasswordChack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Password01 window = new Password01();
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
	public Password01() {
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
		frame.getContentPane().add(getTfId());
		frame.getContentPane().add(getPwPassword());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblPw());
		frame.getContentPane().add(getBtnChack());
		frame.getContentPane().add(getTfPasswordChack());
	}

	private JTextField getTfId() {
		if (tfId == null) {
			tfId = new JTextField();
			tfId.setBounds(153, 6, 130, 26);
			tfId.setColumns(10);
		}
		return tfId;
	}
	private JPasswordField getPwPassword() {
		if (pwPassword == null) {
			pwPassword = new JPasswordField();
			pwPassword.setBounds(153, 44, 130, 26);
		}
		return pwPassword;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("ID");
			lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel.setBounds(80, 11, 61, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblPw() {
		if (lblPw == null) {
			lblPw = new JLabel("PW");
			lblPw.setHorizontalAlignment(SwingConstants.RIGHT);
			lblPw.setBounds(80, 49, 61, 16);
		}
		return lblPw;
	}
	private JButton getBtnChack() {
		if (btnChack == null) {
			btnChack = new JButton("OK");
			btnChack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					passwordChack();
				}
			});
			btnChack.setBounds(297, 44, 117, 29);
		}
		return btnChack;
	}
	private JTextField getTfPasswordChack() {
		if (tfPasswordChack == null) {
			tfPasswordChack = new JTextField();
			tfPasswordChack.setBounds(153, 82, 130, 26);
			tfPasswordChack.setColumns(10);
		}
		return tfPasswordChack;
	}
	
	private void passwordChack() {
		// TODO Auto-generated method stub
		char[] pw = pwPassword.getPassword();
		String strPassword = new String(pw);
		tfPasswordChack.setText(strPassword);
		
	}
}
