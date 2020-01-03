package com.houarizegai.calculator;

import java.awt.Color;

public class DefaultStyle extends Style {
	protected void changeStyle(){
		for(Button btn:Ui.getAllBtns()) {
			btn.setBack(null);
	    	if(btn instanceof ButtonStyleToggle) {
	    		btn.setBack(Color.GREEN.darker());
	    		btn.setFore(Color.WHITE);
	    	} else if(btn instanceof ButtonFunc){
	    		btn.setFore(Color.BLACK);
	    	}
		}
	}
	
	protected Style getNext() {
		return new ColorStyle();
	}
	
}
