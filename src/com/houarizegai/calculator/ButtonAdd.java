package com.houarizegai.calculator;

import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonAdd extends ButtonOp {
	ButtonAdd(Pos pos) {
		super("+");
		
		addKey(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, 0));
		addKey(KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, KeyEvent.SHIFT_MASK));
		newButton(pos);
	}
	
}
