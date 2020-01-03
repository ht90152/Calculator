package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonEqual extends ButtonOp {
	ButtonEqual(Pos pos, CalcArg args){
		super("=", pos, args);
		
		key = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0);
		keyBind();
	}
	
	@Override
	protected void changeStyle() {
		if(Ui.getStyle() instanceof DefaultStyle) {
			setBack(null);
			setFore(Color.BLACK);
		} else if(Ui.getStyle() instanceof ColorStyle) {
    		setBack(Color.BLUE);
    		setFore(Color.WHITE);
		}
	}
	
}
