package com.houarizegai.calculator;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class Button {
	protected String name;
	private Pos pos;
	protected KeyStroke key;
	protected JButton btn;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Pos getPos() {
		return pos;
	}
	public void setPos(Pos pos) {
		this.pos = pos;
	}
	
	public KeyStroke getKey() {
		return key;
	}
	public void setKey(KeyStroke key) {
		this.key = key;
	}
	
	public JButton getBtn() {
		return btn;
	}
	public void setBtn(JButton btn) {
		this.btn = btn;
	}
	
	protected void newButton(Pos pos, CalcArg args){
		btn = new JButton(name);
		btn.setToolTipText(name);
        btn.setBounds(pos.x, pos.y, pos.width, pos.height);
//      btn.setFont(btnFont);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.addActionListener(event(args));
        key = KeyStroke.getKeyStroke(name.charAt(0), 0);
	}
	protected void keyBind() {
		btn.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(key, name+" key");
		btn.getActionMap().put(name+" key", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                btn.doClick();
            }
        });
	}
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
