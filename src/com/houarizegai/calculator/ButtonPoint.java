package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPoint extends Button {
	ButtonPoint(Pos pos, CalcArg args){
		name = ".";
		newButton(pos, args);
		
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
	protected void change() {
		if(Ui.getStyle() instanceof DefaultStyle) {
			setBack(null);
			setFore(Color.BLACK);
		} else if(Ui.getStyle() instanceof ColorStyle) {
    		setBack(Color.MAGENTA);
    		setFore(Color.WHITE);
		}
	}
	
}
