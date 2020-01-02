package com.houarizegai.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPoint extends Button {
	ButtonPoint(Pos pos, CalcArg args){
		name = ".";
		newButton(pos, args);
		
		keyBind();
	}
	
	@Override
	protected ActionListener event(CalcArg args) {
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			}
		};
	}
	
}
