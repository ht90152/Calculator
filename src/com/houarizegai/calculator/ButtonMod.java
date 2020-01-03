package com.houarizegai.calculator;

import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonMod extends ButtonOp {
	ButtonMod(Pos pos) {
		super("%");
		
		addKey(KeyStroke.getKeyStroke(KeyEvent.VK_5, KeyEvent.SHIFT_MASK));
		newButton(pos);
	}
	
}
