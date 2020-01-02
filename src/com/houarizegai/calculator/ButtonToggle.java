package com.houarizegai.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonToggle extends Button {
	ButtonToggle(Pos pos, CalcArg args){
		name = "Toggle Colors";
		newButton(pos, args);
		
		key = KeyStroke.getKeyStroke(KeyEvent.VK_T, 0);
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
