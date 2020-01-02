package com.houarizegai.calculator;

import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonEqual extends ButtonSign {
	ButtonEqual(Pos pos, CalcArg args){
		super("=", pos, args);
		
		key = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0);
		keyBind();
	}
	
}
