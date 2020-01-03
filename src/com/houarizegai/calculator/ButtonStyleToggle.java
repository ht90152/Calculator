package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ButtonStyleToggle extends ButtonToggle {
	protected ButtonStyleToggle(Pos pos){
		name = "Toggle Colors";
		newButton(pos);
		
		key = KeyStroke.getKeyStroke(KeyEvent.VK_T, 0);
		keyBind();
		
		changeStyle();
		update();
	}
	
	@Override
	protected ActionListener event(CalcArg args) {
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){
				for(Button btn:Ui.getAllBtns())
			    {
					btn.changeStyle();
		        	btn.update();
			    }
			}
		};
	}
	
	@Override
	protected void changeStyle() {
		if(Ui.getStyle() instanceof DefaultStyle) {
			setBack(Color.GREEN.darker());
			setFore(Color.WHITE);
			setName("Toggle Colors");
			Ui.setStyle(new ColorStyle());
		} else if(Ui.getStyle() instanceof ColorStyle) {
    		setBack(null);
    		setFore(Color.BLACK);
    		setName("Untoggle Colors");
    		Ui.setStyle(new DefaultStyle());
		}
	}
	
}
