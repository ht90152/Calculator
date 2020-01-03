package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonSign extends ButtonFunc {
	ButtonSign(Pos pos){
		setName("+/-");
		addKey(KeyStroke.getKeyStroke(KeyEvent.VK_F9, 0));
		newButton(pos);
	}
	
	@Override
	protected ActionListener event(CalcArg args) {
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){
				args.setOpt(' ');
	            args.setVal(0-Double.parseDouble(Ui.getText()));
	            Ui.setText(String.valueOf(args.getVal()));
			}
		};
	}
	
	@Override
	protected void changeStyle() {
		if(Ui.getStyle() instanceof DefaultStyle) {
			setBack(null);
			setFore(Color.BLACK);
		} else if(Ui.getStyle() instanceof ColorStyle) {
			setBack(Color.CYAN);
			setFore(Color.WHITE);
		}
	}
	
}
