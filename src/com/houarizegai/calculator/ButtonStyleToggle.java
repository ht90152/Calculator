package com.houarizegai.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonStyleToggle extends ButtonToggle {
	protected ButtonStyleToggle(Pos pos){
		setName("Change Style");
		addKey(KeyStroke.getKeyStroke(KeyEvent.VK_S, 0));
		newButton(pos);
	}
	
	@Override
	protected ActionListener event(CalcArg args) {
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Style sty = Ui.getStyle();
				Ui.setStyle(sty.getNext());
				sty.changeStyle();
				for(Button btn:Ui.getAllBtns())
			    {
		        	btn.update();
			    }
			}
		};
	}
	
}
