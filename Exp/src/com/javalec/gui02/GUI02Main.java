package com.javalec.gui02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class GUI02Main {

	private JFrame frame;
	private JComboBox cbValue01;
	private JComboBox cbOperator01;
	private JComboBox cbValue02;
	private JTextField tfResult01;

	public double value01;
	public double value02;
	public double result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI02Main window = new GUI02Main();
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
	public GUI02Main() {
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
		frame.getContentPane().add(getCbValue01());
		frame.getContentPane().add(getCbOperator01());
		frame.getContentPane().add(getCbValue02());
		frame.getContentPane().add(getTfResult01());
	}

	private JComboBox getCbValue01() {
		if (cbValue01 == null) {
			cbValue01 = new JComboBox();
			cbValue01.setModel(
					new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
			cbValue01.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result();
				}
			});
			cbValue01.setBounds(6, 6, 73, 27);
		}
		return cbValue01;
	}

	private JComboBox getCbOperator01() {
		if (cbOperator01 == null) {
			cbOperator01 = new JComboBox();
			cbOperator01.setModel(new DefaultComboBoxModel(new String[] { "+", "-", "*", "/" }));
			cbOperator01.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result();
				}
			});
			cbOperator01.setBounds(91, 6, 73, 27);
		}
		return cbOperator01;
	}

	private JComboBox getCbValue02() {
		if (cbValue02 == null) {
			cbValue02 = new JComboBox();
			cbValue02.setModel(
					new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
			cbValue02.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result();
				}
			});
			cbValue02.setBounds(176, 6, 73, 27);
		}
		return cbValue02;
	}

	private JTextField getTfResult01() {
		if (tfResult01 == null) {
			tfResult01 = new JTextField();
			tfResult01.setBounds(261, 5, 130, 26);
			tfResult01.setColumns(10);
		}
		return tfResult01;
	}

	private void result() { //필드드변수 생성해놓고 거기에 값 대입 후 계산 결과넣기
		value01 = Double.parseDouble(cbValue01.getSelectedItem().toString());
		value02 = Double.parseDouble(cbValue02.getSelectedItem().toString());
		switch (cbOperator01.getItemCount()) {
		case 0:
			result = value01 + value02;
			break;
		case 1:
			result = value01 - value02;
			break;
		case 2:
			result = value01 * value02;
			break;
		default:
			result = value01 / value02;
			break;
		}
		tfResult01.setText(String.format("%.2f", result));
	};

}
