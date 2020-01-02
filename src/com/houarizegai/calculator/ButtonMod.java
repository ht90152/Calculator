package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonMod extends ButtonSign {
	ButtonMod(Pos pos, CalcArg args) {
		super("%", pos, args);
		
		setKey(KeyStroke.getKeyStroke(KeyEvent.VK_5, KeyEvent.SHIFT_MASK));
		keyBind();
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
