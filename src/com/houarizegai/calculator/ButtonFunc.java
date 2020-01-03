package com.houarizegai.calculator;

import java.awt.Font;
import java.util.regex.Pattern;

public abstract class ButtonFunc extends Button {
	@Override
	protected void newButton(Pos pos){
		super.newButton(pos);
        setBtnFont();
	}
	
	protected void setBtnFont() {
		btn.setFont(new Font("Code2000", Font.PLAIN, 28));
	}
	
	protected void setTextByType(CalcArg args) {
		if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(args.getVal()))) {
        	Ui.setText(String.valueOf((int) args.getVal()));
        } else {
            Ui.setText(String.valueOf(args.getVal()));
		}
	}
	
}
