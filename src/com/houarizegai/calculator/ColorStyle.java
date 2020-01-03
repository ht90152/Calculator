package com.houarizegai.calculator;

import java.awt.Color;

public class ColorStyle extends Style {
	protected void changeStyle(){
		Ui.getWin().getContentPane().setBackground(null);
		Ui.getJText().setBackground(Color.WHITE);
		for(Button btn:Ui.getAllBtns()) {
			if(btn instanceof ButtonStyleToggle) {
				btn.setBack(null);
				btn.setFore(Color.BLACK);
			} else if(btn instanceof ButtonFunc){
				if(btn instanceof ButtonNum) {
				} else {
					btn.setFore(Color.WHITE);
					if(btn instanceof ButtonClear) {
						btn.setBack(Color.RED);
					} else if(btn instanceof ButtonBack) {
						btn.setBack(Color.ORANGE);
					} else if(btn instanceof ButtonMod) {
						btn.setBack(Color.GREEN);
					} else if(btn instanceof ButtonSign) {
						btn.setBack(Color.CYAN);
					} else if(btn instanceof ButtonPoint) {
						btn.setBack(Color.MAGENTA);
					} else if(btn instanceof ButtonEqual) {
						btn.setBack(Color.BLUE);
					} else {
						btn.setBack(Color.PINK);
					}
				}
			}
		}
	}
	
	protected Style getNext() {
		return new GrayStyle();
	}
	
}
