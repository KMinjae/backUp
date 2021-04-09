package com.javelec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExGUI02 {

	public static JFrame frame;
	public static JTextField tfNum1;
	public static JTextField tfNum2;
	public static JTextField tfNum3;
	public static JTextField tfNum4;
	public static JTextField tfNum5;
	public static JButton btnAdd;
	public static JButton btnMinus;
	public static JButton btnMul;
	public static JButton btnDiv;
	public static JLabel lblOperator;
	public static JLabel lblResult;
	

	public static double SumNum1;
	public static double SumNum2;
	public static int Operator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExGUI02 window = new ExGUI02();
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
	public ExGUI02() {
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
		frame.getContentPane().add(getTfNum1());
		frame.getContentPane().add(getTfNum2());
		frame.getContentPane().add(getTfNum3());
		frame.getContentPane().add(getTfNum4());
		frame.getContentPane().add(getTfNum5());
		frame.getContentPane().add(getBtnAdd());
		frame.getContentPane().add(getBtnMinus());
		frame.getContentPane().add(getBtnMul());
		frame.getContentPane().add(getBtnDiv());
		frame.getContentPane().add(getLblOperator());
		frame.getContentPane().add(getLblResult());
	}

	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setHorizontalAlignment(SwingConstants.CENTER);
			tfNum1.setBounds(6, 6, 70, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setHorizontalAlignment(SwingConstants.CENTER);
			tfNum2.setColumns(10);
			tfNum2.setBounds(6, 44, 70, 26);
		}
		return tfNum2;
	}
	private JTextField getTfNum3() {
		if (tfNum3 == null) {
			tfNum3 = new JTextField();
			tfNum3.setHorizontalAlignment(SwingConstants.CENTER);
			tfNum3.setColumns(10);
			tfNum3.setBounds(6, 141, 70, 26);
		}
		return tfNum3;
	}
	private JTextField getTfNum4() {
		if (tfNum4 == null) {
			tfNum4 = new JTextField();
			tfNum4.setHorizontalAlignment(SwingConstants.CENTER);
			tfNum4.setColumns(10);
			tfNum4.setBounds(106, 141, 70, 26);
		}
		return tfNum4;
	}
	private JTextField getTfNum5() {
		if (tfNum5 == null) {
			tfNum5 = new JTextField();
			tfNum5.setHorizontalAlignment(SwingConstants.CENTER);
			tfNum5.setColumns(10);
			tfNum5.setBounds(219, 141, 70, 26);
		}
		return tfNum5;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("＋");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Operator = 1;
					ExGUI02_Object.Operator();
				}
			});
			btnAdd.setBounds(106, 6, 45, 29);
		}
		return btnAdd;
	}
	private JButton getBtnMinus() {
		if (btnMinus == null) {
			btnMinus = new JButton("ー");
			btnMinus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Operator = 2;
					ExGUI02_Object.Operator();
				}
			});
			btnMinus.setBounds(163, 6, 45, 29);
		}
		return btnMinus;
	}
	private JButton getBtnMul() {
		if (btnMul == null) {
			btnMul = new JButton("x");
			btnMul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Operator = 3;
					ExGUI02_Object.Operator();
				}
			});
			btnMul.setBounds(219, 6, 45, 29);
		}
		return btnMul;
	}
	private JButton getBtnDiv() {
		if (btnDiv == null) {
			btnDiv = new JButton("/");
			btnDiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Operator = 4;
					ExGUI02_Object.Operator();
				}
			});
			btnDiv.setBounds(276, 6, 45, 29);
		}
		return btnDiv;
	}
	private JLabel getLblOperator() {
		if (lblOperator == null) {
			lblOperator = new JLabel("+");
			lblOperator.setHorizontalAlignment(SwingConstants.CENTER);
			lblOperator.setBounds(61, 146, 61, 16);
		}
		return lblOperator;
	}
	private JLabel getLblResult() {
		if (lblResult == null) {
			lblResult = new JLabel("=");
			lblResult.setHorizontalAlignment(SwingConstants.CENTER);
			lblResult.setBounds(173, 146, 61, 16);
		}
		return lblResult;
	}
	
	
}
