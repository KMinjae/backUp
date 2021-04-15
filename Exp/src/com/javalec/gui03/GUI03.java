package com.javalec.gui03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class GUI03 {

	private JFrame frame;
	private JTextField tfValue01;
	private JTextField tfValue02;
	private JLabel lblResult;
	private JRadioButton rbPluse;
	private JRadioButton rbMinus;
	private JRadioButton rbMultiplication;
	private JRadioButton rbDivision;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JCheckBox chPlus;
	private JCheckBox chMinus;
	private JCheckBox chMultiplication;
	private JCheckBox chdivision;

	private double value01;
	private double value02;
	private double result01;
	private int resultChack;
	private double[] result02 = new double[4];
	private double[] lblResult_0 = new double[4]; //
	private JLabel lblResult_1;
	private JLabel lblResult_2;
	private JLabel lblResult_3;
	private JLabel lblResult_4;

	private int[] deleteValue = { 0, 0, 0, 0 };

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
		frame.getContentPane().add(getTfValue01());
		frame.getContentPane().add(getTfValue02());
		frame.getContentPane().add(getLblResult());
		frame.getContentPane().add(getRbPluse());
		frame.getContentPane().add(getRbMinus());
		frame.getContentPane().add(getRbMultiplication());
		frame.getContentPane().add(getRbDivision());
		frame.getContentPane().add(getChPlus());
		frame.getContentPane().add(getChMinus());
		frame.getContentPane().add(getChMultiplication());
		frame.getContentPane().add(getChdivision());
		frame.getContentPane().add(getLblResult_1());
		frame.getContentPane().add(getLblResult_2());
		frame.getContentPane().add(getLblResult_3());
		frame.getContentPane().add(getLblResult_4());
	}

	private JTextField getTfValue01() {
		if (tfValue01 == null) {
			tfValue01 = new JTextField();
			tfValue01.setHorizontalAlignment(SwingConstants.RIGHT);
			tfValue01.setBounds(6, 6, 130, 26);
			tfValue01.setColumns(10);
		}
		return tfValue01;
	}

	private JTextField getTfValue02() {
		if (tfValue02 == null) {
			tfValue02 = new JTextField();
			tfValue02.setHorizontalAlignment(SwingConstants.RIGHT);
			tfValue02.setColumns(10);
			tfValue02.setBounds(6, 44, 130, 26);
		}
		return tfValue02;
	}

	private JLabel getLblResult() {
		if (lblResult == null) {
			lblResult = new JLabel("");
			lblResult.setHorizontalAlignment(SwingConstants.RIGHT);
			lblResult.setBounds(6, 82, 130, 16);
		}
		return lblResult;
	}

	private JRadioButton getRbPluse() {
		if (rbPluse == null) {
			rbPluse = new JRadioButton("+");
			rbPluse.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result(rbPluse.getText());
				}
			});
			buttonGroup.add(rbPluse);
			rbPluse.setBounds(148, 7, 52, 23);
		}
		return rbPluse;
	}

	private JRadioButton getRbMinus() {
		if (rbMinus == null) {
			rbMinus = new JRadioButton("-");
			rbMinus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result(rbMinus.getText());
				}
			});
			buttonGroup.add(rbMinus);
			rbMinus.setBounds(148, 42, 52, 23);
		}
		return rbMinus;
	}

	private JRadioButton getRbMultiplication() {
		if (rbMultiplication == null) {
			rbMultiplication = new JRadioButton("x");
			rbMultiplication.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result(rbMultiplication.getText());
				}
			});
			buttonGroup.add(rbMultiplication);
			rbMultiplication.setBounds(148, 77, 52, 23);
		}
		return rbMultiplication;
	}

	private JRadioButton getRbDivision() {
		if (rbDivision == null) {
			rbDivision = new JRadioButton("/");
			rbDivision.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { // 나누셈 라디오 누를시
					result(rbDivision.getText());
				}
			});
			buttonGroup.add(rbDivision);
			rbDivision.setBounds(148, 112, 52, 23);
		}
		return rbDivision;
	}

	// _________________________________
	public String result(String num) {
		try {
			value01 = Double.parseDouble(tfValue01.getText());
			value02 = Double.parseDouble(tfValue02.getText());
			boolean onOff = false;
			switch (num) {
			case "+":
				lblResult.setText(String.format("%.2f", value01 + value02));
				break;
			case "-":
				lblResult.setText(String.format("%.2f", value01 - value02));
				break;
			case "x":
				lblResult.setText(String.format("%.2f", value01 * value02));
				break;
			case "/":
				if (value02 == 0) {
					lblResult.setText("0");
				}
				lblResult.setText(String.format("%.2f", value01 / value02));
				break;
			}
		} catch (Exception e) {
			lblResult.setText("0");
		}
		return "";
	}

	// ___________________________________________________

	private JCheckBox getChPlus() {
		if (chPlus == null) {
			chPlus = new JCheckBox("+");
			chPlus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					result02(0);
//					value01 = Double.parseDouble(tfValue01.getText());
//					value02 = Double.parseDouble(tfValue02.getText());
//					result02[0] = String.format("%.2f", value01 + value02);
//					if (chPlus.isSelected() == true) {
//						if (lblResult_1.getText() == "") {
//							lblResult_1.setText(result02[0]);
//							deleteValue[0] = 0;
//						} else if (lblResult_2.getText() == "") {
//							lblResult_2.setText(result02[0]);
//							deleteValue[0] = 1;
//						} else if (lblResult_3.getText() == "") {
//							lblResult_3.setText(result02[0]);
//							deleteValue[0] = 2;
//						} else if (lblResult_4.getText() == "") {
//							lblResult_4.setText(result02[0]);
//							deleteValue[0] = 3;
//						}
//					}
//					if (chPlus.isSelected() == false) {
//						if (deleteValue[0] == 0) {
//							lblResult_1.setText("");
//						} else if (deleteValue[0] == 1) {
//							lblResult_2.setText("");
//						} else if (deleteValue[0] == 2) {
//							lblResult_3.setText("");
//						} else if (deleteValue[0] == 3) {
//							lblResult_4.setText("");
//						}
//					}
				}
			});
			chPlus.setBounds(212, 7, 128, 23);
		}
		return chPlus;
	}

	private JCheckBox getChMinus() {
		if (chMinus == null) {
			chMinus = new JCheckBox("-");
			chMinus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result02(1);
				}
			});
			chMinus.setBounds(212, 42, 128, 23);
		}
		return chMinus;
	}

	private JCheckBox getChMultiplication() {
		if (chMultiplication == null) {
			chMultiplication = new JCheckBox("x");
			chMultiplication.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result02(2);
				}
			});
			chMultiplication.setBounds(212, 77, 128, 23);
		}
		return chMultiplication;
	}

	private JCheckBox getChdivision() {
		if (chdivision == null) {
			chdivision = new JCheckBox("/");
			chdivision.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result02(3);
				}
			});
			chdivision.setBounds(212, 112, 128, 23);
		}
		return chdivision;
	}

	private JLabel getLblResult_1() {
		if (lblResult_1 == null) {
			lblResult_1 = new JLabel("");
			lblResult_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblResult_1.setBounds(6, 143, 334, 16);
		}
		return lblResult_1;
	}

	private JLabel getLblResult_2() {
		if (lblResult_2 == null) {
			lblResult_2 = new JLabel("");
			lblResult_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblResult_2.setBounds(6, 171, 334, 16);
		}
		return lblResult_2;
	}

	private JLabel getLblResult_3() {
		if (lblResult_3 == null) {
			lblResult_3 = new JLabel("");
			lblResult_3.setHorizontalAlignment(SwingConstants.RIGHT);
			lblResult_3.setBounds(6, 199, 334, 16);
		}
		return lblResult_3;
	}

	private JLabel getLblResult_4() {
		if (lblResult_4 == null) {
			lblResult_4 = new JLabel("");
			lblResult_4.setHorizontalAlignment(SwingConstants.RIGHT);
			lblResult_4.setBounds(6, 227, 334, 16);
		}
		return lblResult_4;
	}

	// __________________________________________________
	// result02(0~3); 덧셈은0 ~ 나눗셈 체크박스는3
	private void result02(int num) {

		boolean onOff = false; // 기본값 체크안함 표시
		String opperator = "";
		try {// 빈값 대입시 오류 캐치
			if (Double.parseDouble(tfValue02.getText()) != 0) {
				value01 = Double.parseDouble(tfValue01.getText());
				value02 = Double.parseDouble(tfValue02.getText());
			} else if (Double.parseDouble(tfValue02.getText()) == 0) {
				throw new Exception();
			}
		} catch (Exception e) {
			// TODO: handle exception
			value01 = 1;
			value02 = 1;
			tfValue01.setText("1");
			tfValue02.setText("1");
			JOptionPane.showMessageDialog(null, "error!!");
		}
		if (lblResult_1.getText() == "" || lblResult_2.getText() == "" || lblResult_3.getText() == ""
				|| lblResult_4.getText() == "") { // 각 자리에 값이 없을떄만 계
			switch (num) {
			case 0:
				result02[num] = Double.parseDouble(String.format("%.3f", value01 + value02));
				onOff = chPlus.isSelected();
				opperator = " + ";
				break;
			case 1:
				result02[num] = Double.parseDouble(String.format("%.3f", value01 - value02));
				onOff = chMinus.isSelected();
				opperator = " - ";
				break;
			case 2:
				result02[num] = Double.parseDouble(String.format("%.3f", value01 * value02));
				onOff = chMultiplication.isSelected();
				opperator = " * ";
				break;
			case 3:
				result02[num] = Double.parseDouble(String.format("%.3f", value01 / value02));
				onOff = chdivision.isSelected();
				opperator = " / ";
				break;
			}
		}

		if (onOff == true) { // True False 는 체크박스 확인을 위해서 만듬
			if (lblResult_1.getText() == "") { // 1번째 레이블에 입력된값이 없으면
				lblResult_1.setText(value01 + opperator + value02 + " = " + String.format("%.3f", result02[num])); // 해당
																													// 레이블에
																													// 계산결과
																													// 출력
				lblResult_0[0] = result02[num]; // 삭제할 레이블을 찾기위해 계산결과를 0번공간에 저장
			} else if (lblResult_2.getText() == "") {
				lblResult_2.setText(value01 + opperator + value02 + " = " + String.format("%.3f", result02[num]));
				lblResult_0[1] = result02[num];
			} else if (lblResult_3.getText() == "") {
				lblResult_3.setText(value01 + opperator + value02 + " = " + String.format("%.3f", result02[num]));
				lblResult_0[2] = result02[num];
			} else if (lblResult_4.getText() == "") {
				lblResult_4.setText(value01 + opperator + value02 + " = " + String.format("%.3f", result02[num]));
				lblResult_0[3] = result02[num];
			}
		}

		if (onOff == false) { // false (체크박스 해제) 할 때 삭제 및 정렬을 위해서 넣음
			if (lblResult_0[0] == result02[num]) { // 0번 공간의 값(1번레이블) 과 삭제할 num공간 값이 같은지 비교 후 삭제
				lblResult_1.setText(lblResult_2.getText());
				lblResult_0[0] = lblResult_0[1];
				lblResult_2.setText(lblResult_3.getText());
				lblResult_0[1] = lblResult_0[2];
				lblResult_3.setText(lblResult_4.getText());
				lblResult_0[2] = lblResult_0[3];
				lblResult_4.setText("");
				lblResult_0[3] = 0;
				result02[num] = 0;
			} else if (lblResult_0[1] == result02[num]) {
				lblResult_2.setText(lblResult_3.getText());
				lblResult_0[1] = lblResult_0[2];
				lblResult_3.setText(lblResult_4.getText());
				lblResult_0[2] = lblResult_0[3];
				lblResult_4.setText("");
				lblResult_0[3] = 0;
				result02[num] = 0;
			} else if (lblResult_0[2] == result02[num]) {
				lblResult_3.setText(lblResult_4.getText());
				lblResult_0[2] = lblResult_0[3];
				lblResult_4.setText("");
				lblResult_0[3] = 0;
				result02[num] = 0;
			} else if (lblResult_0[3] == result02[num]) {
				lblResult_4.setText("");
				lblResult_0[3] = 0;
				result02[num] = 0;
			}
		}
	}

}
