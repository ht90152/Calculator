package com.houarizegai.calculator;

import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonMul extends ButtonSign {
	ButtonMul(Pos pos, CalcArg args) {
		super("*", pos, args);
		
		setKey(KeyStroke.getKeyStroke(KeyEvent.VK_MULTIPLY, 0));
		keyBind();
	}
	
}
