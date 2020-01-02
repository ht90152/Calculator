package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ui {
	private static JTextField inText;
	private static Style style;
	private static ArrayList<Button> btns = new ArrayList<Button>();
	
	public static ArrayList<Button> getAllBtns() {
		return btns;
	}
	
	public static JTextField getJText() {
		return inText;
	}
	
	public static Style getStyle() {
		return style;
	}
	public static void setStyle(Style st) {
		style = st;
	}
	
	public static String getText() {
		return inText.getText();
	}
	public static void setText(String string) {
		inText.setText(string);
	}
	
	Ui(CalcArg args) {
		JFrame window = new JFrame("Calculator");
        window.setSize(400,600); // Height And Width Of Window
        window.setLocationRelativeTo(null); // Move Window To Center
        
        int wBtn = 80;// Width Button
        int hBtn = 70;// Height Button
        int marginX = 20;
        int marginY = 60;
        int[] x = {marginX, marginX + 90, marginX + 180, marginX + 270};
        int[] y = {marginY, marginY + 100, marginY + 180, marginY + 260, marginY + 340, marginY + 420};

        inText = new JTextField("0");
        inText.setBounds(x[0],y[0],350,70);
        inText.setEditable(false);
        inText.setBackground(Color.WHITE);
        inText.setFont(new Font("Comic Sans MS", Font.PLAIN, 33));
        window.add(inText);
        
        btns.add(new ButtonNum("0", new Pos(x[1],y[5],wBtn,hBtn), args));
        for(int i = 1;i < 10; i++) {
        	btns.add(new ButtonNum(Integer.toString(i), new Pos(x[(i-1)%3],y[(9-i)/3+2],wBtn,hBtn), args));
        }
        btns.add(new ButtonC(new Pos(x[0],y[1],wBtn,hBtn), args));
        btns.add(new ButtonBack(new Pos(x[1],y[1],wBtn,hBtn), args));
        btns.add(new ButtonMod(new Pos(x[2],y[1],wBtn,hBtn), args));
        btns.add(new ButtonDiv(new Pos(x[3],y[1],wBtn,hBtn), args));
        btns.add(new ButtonMul(new Pos(x[3],y[2],wBtn,hBtn), args));
        btns.add(new ButtonMin(new Pos(x[3],y[3],wBtn,hBtn), args));
        btns.add(new ButtonAdd(new Pos(x[3],y[4],wBtn,hBtn), args));
        btns.add(new ButtonPoint(new Pos(x[0],y[5],wBtn,hBtn), args));
        btns.add(new ButtonEqual(new Pos(x[2],y[5],wBtn*2+10,hBtn), args));
        
        setStyle(new DefaultStyle());
        btns.add(new ButtonStyleToggle(new Pos(200, 30, 140, 18), args));
        
        for(Button btn:btns) {
        	window.add(btn.getBtn());
        }
		
        window.setLayout(null);
        window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // If Click into The Red Button => End The Processus
		window.setVisible(true);
	}
	
}
