package com.houarizegai.calculator;

import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonAdd extends ButtonSign {
	ButtonAdd(Pos pos, CalcArg args) {
		super("+", pos, args);
		
		setKey(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, 0));
		keyBind();
	}
	
}
