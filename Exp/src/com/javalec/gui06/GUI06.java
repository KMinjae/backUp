package com.javalec.gui06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class GUI06 {

	private JFrame frame;
	private JTextField tfResult;
	private JButton btnNum7;
	private JButton btnNum4;
	private JButton btnNum1;
	private JButton btnNum8;
	private JButton btnNum5;
	private JButton btnNum2;
	private JButton btnNum9;
	private JButton btnNum6;
	private JButton btnNum3;
	private JButton btnMultiplication;
	private JButton btnMinus;
	private JButton btnPlus;
	private JButton btnDivision;
	private JButton btnResult;
	private JButton btnNum0;

	private double sum;
	ArrayList<Double> resultList = new ArrayList<Double>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI06 window = new GUI06();
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
	public GUI06() {
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
		frame.getContentPane().add(getTfResult());
		frame.getContentPane().add(getBtnNum1());
		frame.getContentPane().add(getBtnNum2());
		frame.getContentPane().add(getBtnNum3());
		frame.getContentPane().add(getBtnNum4());
		frame.getContentPane().add(getBtnNum5());
		frame.getContentPane().add(getBtnNum6());
		frame.getContentPane().add(getBtnNum7());
		frame.getContentPane().add(getBtnNum8());
		frame.getContentPane().add(getBtnNum9());
		frame.getContentPane().add(getBtnMultiplication());
		frame.getContentPane().add(getBtnMinus());
		frame.getContentPane().add(getBtnPlus());
		frame.getContentPane().add(getBtnDivision());
		frame.getContentPane().add(getBtnResult());
		frame.getContentPane().add(getBtnNum0());
		frame.getContentPane().add(getBtnClear());
	}

	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setText("0");
			tfResult.setEditable(false);
			tfResult.setHorizontalAlignment(SwingConstants.RIGHT);
			tfResult.setBounds(6, 6, 438, 26);
			tfResult.setColumns(10);
		}
		return tfResult;
	}

	private JButton getBtnNum7() {
		if (btnNum7 == null) {
			btnNum7 = new JButton("7");
			btnNum7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ResultList(7);
				}
			});
			btnNum7.setBounds(172, 114, 59, 29);
		}
		return btnNum7;
	}

	private JButton getBtnNum4() {
		if (btnNum4 == null) {
			btnNum4 = new JButton("4");
			btnNum4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ResultList(4);
				}
			});
			btnNum4.setBounds(172, 155, 59, 29);
		}
		return btnNum4;
	}

	private JButton getBtnNum0() {
		if (btnNum0 == null) {
			btnNum0 = new JButton("0");
			btnNum0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ResultList(0);
				}
			});
			btnNum0.setBounds(172, 237, 59, 29);
		}
		return btnNum0;
	}

	private JButton getBtnNum1() {
		if (btnNum1 == null) {
			btnNum1 = new JButton("1");
			btnNum1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ResultList(1);
				}
			});
			btnNum1.setBounds(172, 196, 59, 29);
		}
		return btnNum1;
	}

	private JButton getBtnNum8() {
		if (btnNum8 == null) {
			btnNum8 = new JButton("8");
			btnNum8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ResultList(8);
				}
			});
			btnNum8.setBounds(243, 114, 59, 29);
		}
		return btnNum8;
	}

	private JButton getBtnNum5() {
		if (btnNum5 == null) {
			btnNum5 = new JButton("5");
			btnNum5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ResultList(5);
				}
			});
			btnNum5.setBounds(243, 155, 59, 29);
		}
		return btnNum5;
	}

	private JButton getBtnNum2() {
		if (btnNum2 == null) {
			btnNum2 = new JButton("2");
			btnNum2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ResultList(2);
				}
			});
			btnNum2.setBounds(243, 196, 59, 29);
		}
		return btnNum2;
	}

	private JButton getBtnNum9() {
		if (btnNum9 == null) {
			btnNum9 = new JButton("9");
			btnNum9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ResultList(9);
				}
			});
			btnNum9.setBounds(314, 114, 59, 29);
		}
		return btnNum9;
	}

	private JButton getBtnNum6() {
		if (btnNum6 == null) {
			btnNum6 = new JButton("6");
			btnNum6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ResultList(6);
				}
			});
			btnNum6.setBounds(314, 155, 59, 29);
		}
		return btnNum6;
	}

	private JButton getBtnNum3() {
		if (btnNum3 == null) {
			btnNum3 = new JButton("3");
			btnNum3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ResultList(3);
				}
			});
			btnNum3.setBounds(314, 196, 59, 29);
		}
		return btnNum3;
	}

	private JButton getBtnMultiplication() {
		if (btnMultiplication == null) {
			btnMultiplication = new JButton("x");
			btnMultiplication.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Operator("*");
				}
			});
			btnMultiplication.setBounds(385, 155, 59, 29);
		}
		return btnMultiplication;
	}

	private JButton getBtnMinus() {
		if (btnMinus == null) {
			btnMinus = new JButton("-");
			btnMinus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Operator("-");
				}
			});
			btnMinus.setBounds(385, 196, 59, 29);
		}
		return btnMinus;
	}

	private JButton getBtnPlus() {
		if (btnPlus == null) {
			btnPlus = new JButton("+");
			btnPlus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Operator("+");
				}
			});
			btnPlus.setBounds(385, 237, 59, 29);
		}
		return btnPlus;
	}

	private JButton getBtnDivision() {
		if (btnDivision == null) {
			btnDivision = new JButton("/");
			btnDivision.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Operator("/");
				}
			});
			btnDivision.setBounds(385, 114, 59, 29);
		}
		return btnDivision;
	}

	private JButton getBtnResult() {
		if (btnResult == null) {
			btnResult = new JButton("=");
			btnResult.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Operator("=");
				}
			});
			btnResult.setBounds(314, 237, 59, 29);
		}
		return btnResult;
	}

	private JButton getBtnClear() { //All clear
		if (btnClear == null) {
			btnClear = new JButton("AC");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					value = 0;
					operator = "";
					binResult = 0;
					value01 = 0;
					tfResult.setText("0");
				}
			});
			btnClear.setBounds(243, 237, 59, 29);
		}
		return btnClear;
	}
//___________________________________________________-

	double value = 0;
	double value01 = 0; // text를 double로 가저올 빈공간1
	double binResult = 0; // 계산결과를 저장할 빈공간
	String operator = "";// 연산자 빈공간
	private JButton btnClear;
	
	private void ResultList(double num) { // 숫자 증가
		value = (double) (value * 10) + num;
		/*
		 * 맨처음 5 를 누르면 num=5
		 * 0 = (0*10) +5 = 5
		 * 그다음 6 을 누르면 num=6
		 * 0 = (5*10) +6 = 50+6 = 56
		 * 그다음 1 을 누르면 num=6
		 * 0 = (56*10) +1 = 560+1 = 561
		 */
		tfResult.setText(String.format("%.2f", value));
	}
	


	private void Operator(String key) {
		value01 = Double.parseDouble(tfResult.getText());
		if (binResult == 0) { 
			// 결과값이 없으면 0과 value01를 계산 하기 떄문에 맨처음 입력값을 기본값으로 지정해줌
			// 없으면 나눗셈, 곱셈 에러 발생
			binResult += value01;
		} else { // 결과값이 0이 아니면
			Result(); // 연산자 누르면 연산을 시작함
		}
		if(key != "=") {
			operator = key;
		}
		tfResult.setText(String.format("%.2f", binResult));
		value = 0;
	}

	private void Result() { // "=" 버튼 클릭시 계산
		value01 = Double.parseDouble(tfResult.getText());
		switch (operator) {
		case "+":
			binResult += value01;
			break;
		case "-":
			binResult -= value01;
			break;
		case "*":
			binResult *= value01;
			break;
		case "/":
			binResult /= value01;
			break;
		default:
			break;
		}
		tfResult.setText(String.format("%.2f", binResult));
		value = 0;
		operator = "";
	}

}
