package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonPoint extends ButtonFunc {
	ButtonPoint(Pos pos){
		name = ".";
		newButton(pos);
		
		keyBind();
		key = KeyStroke.getKeyStroke(KeyEvent.VK_DECIMAL, 0);
		keyBind();
	}
	
	@Override
	protected ActionListener event(CalcArg args) {
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (args.getAddWrite()) {
					Ui.setText(Ui.getText() + ".");
				} else {
					Ui.setText("0.");
					args.setAddWrite(true);
				}
				args.setGo(true);
			}
		};
	}
	
	@Override
	protected void changeStyle() {
		if(Ui.getStyle() instanceof DefaultStyle) {
			setBack(null);
			setFore(Color.BLACK);
		} else if(Ui.getStyle() instanceof ColorStyle) {
    		setBack(Color.MAGENTA);
    		setFore(Color.WHITE);
		}
	}
	
}
