package com.houarizegai.calculator;

import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonDiv extends ButtonSign {
	ButtonDiv(Pos pos, CalcArg args) {
		super("/", pos, args);
		
		setKey(KeyStroke.getKeyStroke(KeyEvent.VK_DIVIDE, 0));
		keyBind();
	}
	
}
