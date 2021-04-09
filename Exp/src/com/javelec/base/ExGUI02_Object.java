package com.javelec.base;

public class ExGUI02_Object extends ExGUI02{
	public ExGUI02_Object() {
		// TODO Auto-generated constructor stub
	}
	
	public static void valueGet() {
		SumNum1 = Double.parseDouble(tfNum1.getText());
		SumNum2 = Double.parseDouble(tfNum2.getText());
		String num1String = tfNum1.getText();
		String num2String = tfNum2.getText();
		tfNum3.setText(num1String);
		tfNum4.setText(num2String);
	}

	public static void Operator() {
		switch (Operator) {
		case 1:
			valueGet();
			tfNum5.setText(Double.toString(SumNum1+SumNum2));
			break;
		case 2:
			lblOperator.setText("-");
			ExGUI02_Object.valueGet();
			tfNum5.setText(Double.toString(SumNum1-SumNum2));
			break;
		case 3:
			ExGUI02_Object.valueGet();
			lblOperator.setText("x");
			tfNum5.setText(Double.toString(SumNum1*SumNum2));
			break;
		case 4:
			lblOperator.setText("/");
			if(SumNum2 == 0) {
				tfNum5.setText("-");
			}else {
				tfNum5.setText(String.format("%.2f",SumNum1/SumNum2));
			}
			break;
		default:
			break;
		}
	}
	
	
}
