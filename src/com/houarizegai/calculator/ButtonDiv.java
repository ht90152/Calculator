package com.houarizegai.calculator;

import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonDiv extends ButtonOp {
	ButtonDiv(Pos pos) {
		super("/");
		
		addKey(KeyStroke.getKeyStroke(KeyEvent.VK_DIVIDE, 0));
		newButton(pos);
	}
	
}
