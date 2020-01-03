package com.houarizegai.calculator;

import javax.swing.KeyStroke;

public class ButtonNum extends ButtonFunc {
	ButtonNum(String num, Pos pos){
		name = num;
		newButton(pos);
		
		keyBind();
		key = KeyStroke.getKeyStroke(name.charAt(0)+0x30, 0);
		keyBind();
	}
	
}
