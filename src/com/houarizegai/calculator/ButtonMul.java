package com.houarizegai.calculator;

import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonMul extends ButtonOp {
	ButtonMul(Pos pos) {
		super("*");
		
		addKey(KeyStroke.getKeyStroke(KeyEvent.VK_MULTIPLY, 0));
		addKey(KeyStroke.getKeyStroke(KeyEvent.VK_8, KeyEvent.SHIFT_MASK));
		newButton(pos);
	}
	
}
