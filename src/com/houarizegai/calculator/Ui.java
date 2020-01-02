package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ui {
	private static JTextField inText;
	
	Ui(CalcArg args) {
		JFrame window = new JFrame("Calculator");
        window.setSize(400,600); // Height And Width Of Window
        window.setLocationRelativeTo(null); // Move Window To Center
        
        int wBtn = 80;// Width Button
        int hBtn = 70;// Height Button
        int marginX = 20;
        int marginY = 60;
        int j = -1;
        int k = -1;
        int[] x = {marginX, marginX + 90, marginX + 180, marginX + 270};
        int[] y = {marginY, marginY + 100, marginY + 180, marginY + 260, marginY + 340, marginY + 420};

        inText = new JTextField("0");
        inText.setBounds(x[0],y[0],350,70);
        inText.setEditable(false);
        inText.setBackground(Color.WHITE);
        inText.setFont(new Font("Comic Sans MS", Font.PLAIN, 33));
        window.add(inText);
        
        window.add(newButton(new Key("0", args), new Pos(x[1],y[5],wBtn,hBtn)));
        for(int i = 1;i < 10; i++) {
        	window.add(newButton(new Key(Integer.toString(i), args), new Pos(x[(i-1)%3],y[(9-i)/3+2],wBtn,hBtn)));
        }
        window.add(newButton(new Key("C", args), new Pos(x[0],y[1],wBtn,hBtn)));
        window.add(newButton(new Key("<-", args), new Pos(x[1],y[1],wBtn,hBtn)));
        window.add(newButton(new Key("%", args), new Pos(x[2],y[1],wBtn,hBtn)));
        window.add(newButton(new Key("/", args), new Pos(x[3],y[1],wBtn,hBtn)));
        window.add(newButton(new Key("*", args), new Pos(x[3],y[2],wBtn,hBtn)));
        window.add(newButton(new Key("-", args), new Pos(x[3],y[3],wBtn,hBtn)));
        window.add(newButton(new Key("+", args), new Pos(x[3],y[4],wBtn,hBtn)));
        window.add(newButton(new Key(".", args), new Pos(x[0],y[5],wBtn,hBtn)));
        window.add(newButton(new Key("=", args), new Pos(x[2],y[5],wBtn*2+10,hBtn)));
        
        window.setLayout(null);
        window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // If Click into The Red Button => End The Processus
		window.setVisible(true);
	}
	
	public static String getText() {
		return inText.getText();
	}
	public static void setText(String string) {
		inText.setText(string);
	}
	
	private JButton newButton(Key key, Pos pos) {
		JButton btn = new JButton(key.getName());
        btn.setBounds(pos.x, pos.y, pos.width, pos.height);
//        btn.setFont(btnFont);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.addActionListener(key.getListener());
        // key
        btn.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(key.getKey(), key.getName()+" key");
//        btn.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("keyPAD"+key.name), key+" key");
        btn.getActionMap().put(key.getName()+" key", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                btn.doClick();
            }
        });
        
        return btn;
	}
}
