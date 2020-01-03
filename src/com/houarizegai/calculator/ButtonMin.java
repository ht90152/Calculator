package com.houarizegai.calculator;

import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonMin extends ButtonOp {
	ButtonMin(Pos pos) {
		super("-");
		
		addKey(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, 0));
		addKey(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, KeyEvent.SHIFT_MASK));
		newButton(pos);
	}
	
}
