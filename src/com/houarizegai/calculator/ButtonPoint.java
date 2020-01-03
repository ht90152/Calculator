package com.houarizegai.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonPoint extends ButtonFunc {
	ButtonPoint(Pos pos){
		setName(".");
		addKey(KeyStroke.getKeyStroke(KeyEvent.VK_DECIMAL, 0));
		newButton(pos);
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
	
}
