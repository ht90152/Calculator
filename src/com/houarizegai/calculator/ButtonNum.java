package com.houarizegai.calculator;

import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonNum extends Button {
	ButtonNum(String num, Pos pos, CalcArg args){
		name = num;
		newButton(pos, args);
		
		keyBind();
		key = KeyStroke.getKeyStroke(name.charAt(0)+0x30, 0);
		keyBind();
	}
	
}
