package com.houarizegai.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.KeyStroke;

public class ButtonNum extends ButtonFunc {
	ButtonNum(String num, Pos pos){
		setName(num);
		addKey(KeyStroke.getKeyStroke(name.charAt(0)+0x30, 0));
		newButton(pos);
	}
	
	@Override
	protected ActionListener event(CalcArg args) {
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (args.getAddWrite()) {
		            if (Pattern.matches("[0]*", Ui.getText())) {
		                Ui.setText(name);
		            } else {
		                Ui.setText(Ui.getText() + name);
		            }
		        } else {
		            Ui.setText(name);
		            args.setAddWrite(true);
		        }
		        args.setGo(true);
			}
		};
	}
	
}
