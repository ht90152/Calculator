package com.houarizegai.calculator;

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
}
