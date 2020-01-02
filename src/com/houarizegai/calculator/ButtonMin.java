package com.houarizegai.calculator;

import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonMin extends ButtonSign {
	ButtonMin(Pos pos, CalcArg args) {
		super("-", pos, args);
		
		setKey(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, 0));
		keyBind();
	}
	
}
