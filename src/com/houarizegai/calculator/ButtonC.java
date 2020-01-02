package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.KeyStroke;

public class ButtonC extends Button {
	ButtonC(Pos pos, CalcArg args){
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
	protected void change() {
		if(Ui.getStyle() instanceof DefaultStyle) {
			setBack(null);
			setFore(Color.BLACK);
		} else if(Ui.getStyle() instanceof ColorStyle) {
			setBack(Color.RED);
			setFore(Color.WHITE);
		}
	}
	
}
