package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonEqual extends ButtonOp {
	ButtonEqual(Pos pos){
		super("=");
		
		addKey(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0));
		newButton(pos);
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
