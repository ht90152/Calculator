package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonDiv extends ButtonOp {
	ButtonDiv(Pos pos) {
		super("/");
		
		addKey(KeyStroke.getKeyStroke(KeyEvent.VK_DIVIDE, 0));
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
