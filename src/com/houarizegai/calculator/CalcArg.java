package com.houarizegai.calculator;

import java.awt.Font;

import javax.swing.JTextField;

public class CalcArg {
	private char opt = ' ';             // Storage Oparator
    private boolean go = true,          // Faire Calcule Avec Opt != (=)
            addWrite = true;    // Racordé des Nombres dans l'Affichage
    private double val = 0;
	
	CalcArg(){
		opt = ' ';
		go = true;
		addWrite = true;
		val = 0;
	}
	
	public char getOpt() {
		return opt;
	}
	public void setOpt(char opt) {
		this.opt = opt;
	}
	
	public boolean getGo() {
		return go;
	}
	public void setGo(boolean bool) {
		go = bool;
	}
	public boolean getAddWrite() {
		return addWrite;
	}
	public void setAddWrite(boolean bool) {
		addWrite = bool;
	}

	public double getVal() {
		return val;
	}
	public void setVal(double val) {
		this.val = val;
	}
	
	protected static double calc(double x, String input, char opt) {
		JTextField inText = Ui.getJText();
        inText.setFont(inText.getFont().deriveFont(Font.BOLD));
        double y = Double.parseDouble(input);
        if (opt == '+') {
            return x + y;
        } else if (opt == '-') {
            return x - y;
        } else if (opt == '*') {
            return x * y;
        } else if (opt == '/') {
            return x / y;
        } else if (opt == '%') {
            return x % y;
        }
        inText.setFont(inText.getFont().deriveFont(Font.PLAIN));
        return y;
    }
	
}
