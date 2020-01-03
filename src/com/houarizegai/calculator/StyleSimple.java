package com.houarizegai.calculator;

import java.awt.Color;

public class StyleSimple extends Style {
	protected void changeStyle(){
		Ui.getWin().getContentPane().setBackground(null);
		Ui.getJText().setBackground(Color.WHITE);
		for(Button btn:Ui.getAllBtns()) {
			btn.setBack(null);
	    	if(btn instanceof ButtonChangeStyle) {
	    		btn.setBack(Color.GREEN.darker());
	    		btn.setFore(Color.WHITE);
	    	} else if(btn instanceof ButtonFunc){
	    		btn.setFore(Color.BLACK);
	    	}
		}
	}
	
	protected Style getNext() {
		return new StyleColor();
	}
	
}
