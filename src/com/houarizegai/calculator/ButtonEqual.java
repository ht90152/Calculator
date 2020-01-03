package com.houarizegai.calculator;

import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonEqual extends ButtonOp {
	ButtonEqual(Pos pos){
		super("=");
		
		addKey(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0));
		newButton(pos);
	}
	
}
