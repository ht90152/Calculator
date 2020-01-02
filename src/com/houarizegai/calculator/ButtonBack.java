package com.houarizegai.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonBack extends Button {
	ButtonBack(Pos pos, CalcArg args){
		name = "<-";
		newButton(pos, args);
		
		key = KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, 0);
		keyBind();
	}
	
	@Override
	protected ActionListener event(CalcArg args) {
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String str = Ui.getText();
				StringBuilder str2 = new StringBuilder();
				for (int i = 0; i < (str.length() - 1); i++) {
					str2.append(str.charAt(i));
				}
				if (str2.toString().equals("")) {
					Ui.setText("0");
				} else {
					Ui.setText(str2.toString());
				}
			}
		};
	}
	
}
