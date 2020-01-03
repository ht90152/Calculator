package com.houarizegai.calculator;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JTextField;

public class ButtonOp extends ButtonFunc {
	ButtonOp(String sign, Pos pos, CalcArg args){
		name = sign;
		newButton(pos, args);
		
		keyBind();
	}
	
	@Override
	protected ActionListener event(CalcArg args) {
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (Pattern.matches("([-]?\\d+[.]\\d*)|([-]?\\d+)", Ui.getText()))
					 if (args.getGo()) {
						args.setVal(calc(args.getVal(), Ui.getText(), args.getOpt()));
	                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(args.getVal()))) {
	                    	Ui.setText(String.valueOf((int) args.getVal()));
	                    } else {
	                        Ui.setText(String.valueOf(args.getVal()));
						}
	                    args.setOpt(name.charAt(0));
	                    if(name.charAt(0) != '=')
	                    	args.setGo(false);
						args.setAddWrite(false);
					} else {
						if(name.charAt(0) != '%' && name.charAt(0) != '=')
							args.setOpt(name.charAt(0));
					}
				}
		};
	}
	private double calc(double x, String input, char opt) {
		JTextField inText = Ui.getJText();
        inText.setFont(inText.getFont().deriveFont(Font.BOLD));
        double y = Double.parseDouble(input);
        if (opt == '+') {
            return x + y;
        } else if (opt == '-') {
            return x - y;
        } else if (opt == '*') {
            return x * y;
        } else if (opt == '/') {
            return x / y;
        } else if (opt == '%') {
            return x % y;
        }
        inText.setFont(inText.getFont().deriveFont(Font.PLAIN));
        return y;
    }
	
}
