package com.houarizegai.calculator;

import java.awt.Color;

public class GrayStyle extends Style {
	@Override
	protected void changeStyle() {
		Ui.getWin().getContentPane().setBackground(Color.GRAY);
		Ui.getJText().setBackground(Color.LIGHT_GRAY);
		for(Button btn:Ui.getAllBtns()) {
	    	if(btn instanceof ButtonStyleToggle) {
	    		btn.setBack(Color.BLUE);
	    		btn.setFore(Color.WHITE);
	    	} else if(btn instanceof ButtonFunc){
	    		btn.setBack(Color.DARK_GRAY);
	    		btn.setFore(Color.WHITE);
	    	}
		}
	}

	@Override
	protected Style getNext() {
		return new DefaultStyle();
	}

}
