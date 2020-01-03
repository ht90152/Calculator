package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonMod extends ButtonOp {
	ButtonMod(Pos pos) {
		super("%");
		
		addKey(KeyStroke.getKeyStroke(KeyEvent.VK_5, KeyEvent.SHIFT_MASK));
		newButton(pos);
	}
	
	@Override
	protected void changeStyle() {
		if(Ui.getStyle() instanceof DefaultStyle) {
			setBack(null);
			setFore(Color.BLACK);
		} else if(Ui.getStyle() instanceof ColorStyle) {
    		setBack(Color.GREEN);
    		setFore(Color.WHITE);
		}
	}
	
}
