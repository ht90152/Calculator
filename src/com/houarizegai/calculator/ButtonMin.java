package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonMin extends ButtonSign {
	ButtonMin(Pos pos, CalcArg args) {
		super("-", pos, args);
		
		setKey(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, 0));
		keyBind();
	}
	
	@Override
	protected void change() {
		if(Ui.getStyle() instanceof DefaultStyle) {
			setBack(null);
			setFore(Color.BLACK);
		} else if(Ui.getStyle() instanceof ColorStyle) {
    		setBack(Color.PINK);
    		setFore(Color.WHITE);
		}
	}
	
}
