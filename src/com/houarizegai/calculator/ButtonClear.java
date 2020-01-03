package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClear extends ButtonFunc {
	ButtonClear(Pos pos, CalcArg args){
		name = "C";
		newButton(pos, args);
		
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
	
	@Override
	protected void changeStyle() {
		if(Ui.getStyle() instanceof DefaultStyle) {
			setBack(null);
			setFore(Color.BLACK);
		} else if(Ui.getStyle() instanceof ColorStyle) {
			setBack(Color.RED);
			setFore(Color.WHITE);
		}
	}
	
}
