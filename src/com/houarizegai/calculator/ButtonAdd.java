package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonAdd extends ButtonOp {
	ButtonAdd(Pos pos) {
		super("+");
		
		addKey(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, 0));
		addKey(KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, KeyEvent.SHIFT_MASK));
		newButton(pos);
	}
	
	@Override
	protected void changeStyle() {
		if(Ui.getStyle() instanceof DefaultStyle) {
			setBack(null);
			setFore(Color.BLACK);
		} else if(Ui.getStyle() instanceof ColorStyle) {
    		setBack(Color.PINK);
    		setFore(Color.WHITE);
		}
	}
	
}
