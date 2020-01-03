package com.houarizegai.calculator;

import javax.swing.KeyStroke;

public class ButtonNum extends ButtonFunc {
	ButtonNum(String num, Pos pos){
		setName(num);
		addKey(KeyStroke.getKeyStroke(name.charAt(0)+0x30, 0));
		newButton(pos);
	}
	
}
