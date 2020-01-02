package com.houarizegai.calculator;

import java.awt.Cursor;

import javax.swing.JButton;
import javax.swing.KeyStroke;

public class ButtonFunc extends Button {
	@Override
	protected void newButton(Pos pos, CalcArg args){
		btn = new JButton(name);
		btn.setToolTipText(name);
        btn.setBounds(pos.x, pos.y, pos.width, pos.height);
        setBtnFont();
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.addActionListener(event(args));
        key = KeyStroke.getKeyStroke(name.charAt(0), 0);
	}
	
}
