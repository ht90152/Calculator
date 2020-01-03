package com.houarizegai.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClear extends ButtonFunc {
	ButtonClear(Pos pos){
		setName("C");
		newButton(pos);
		
		keyBind();
	}
	
	@Override
	protected ActionListener event(CalcArg args) {
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Ui.setText("0");
	            args.setOpt(' ');
	            args.setVal(0);
			}
		};
	}
	
}
