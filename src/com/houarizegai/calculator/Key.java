package com.houarizegai.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;

import javax.swing.KeyStroke;

public class Key {
	private String name;
	private ActionListener listener;
	private KeyStroke key;
	
	public String getName() {
		return name;
	}
	public void setKey(String name) {
		this.name = name;
	}
	
	public ActionListener getListener() {
		return listener;
	}
	public void setListener(ActionListener listener) {
		this.listener = listener;
	}
	
	public KeyStroke getKey() {
		return key;
	}
	public void setKey(KeyStroke key) {
		this.key = key;
	}
	
	Key(String string, CalcArg args){
		name = string;
		setKey(KeyStroke.getKeyStroke(string.charAt(0), 0));
		
		if(isInteger(string)) {
			listener = eventInt(args);
		} else if(string.equals("C")) {
			listener = eventClear(args);
		} else if(string.equals("<-")) {
			listener = eventBack(args);
			setKey(KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, 0));
		} else if(string.equals("%")) {
			listener = eventSign(string.charAt(0), args);
			setKey(KeyStroke.getKeyStroke(KeyEvent.VK_5, KeyEvent.SHIFT_MASK));
		} else if(string.equals("/")) {
			listener = eventSign(string.charAt(0), args);
			setKey(KeyStroke.getKeyStroke(KeyEvent.VK_DIVIDE, 0));
		} else if(string.equals("*")) {
			listener = eventSign(string.charAt(0), args);
			setKey(KeyStroke.getKeyStroke(KeyEvent.VK_MULTIPLY, 0));
		} else if(string.equals("-")) {
			listener = eventSign(string.charAt(0), args);
			setKey(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, 0));
		} else if(string.equals("+")) {
			listener = eventSign(string.charAt(0), args);
			setKey(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, 0));
		} else if(string.equals(".")) {
			listener = eventPoint(args);
		} else if(string.equals("=")) {
			listener = eventEqual(args);
		} else if(string.equals("Toggle Colors")) {
			listener = eventStyle(args);
			setKey(KeyStroke.getKeyStroke(KeyEvent.VK_T, 0));
		}
	}
	
	
	private static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    // only got here if we didn't return false
	    return true;
	}
	private ActionListener eventInt(CalcArg args) {
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){
//				repaintFont();
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
	
	private ActionListener eventClear(CalcArg args) {
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){
//				repaintFont();
	            Ui.setText("0");
	            args.setOpt(' ');
	            args.setVal(0);
			}
		};
	}
	
	private ActionListener eventBack(CalcArg args) {
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){
//				repaintFont();
				String str = Ui.getText();
				StringBuilder str2 = new StringBuilder();
				for (int i = 0; i < (str.length() - 1); i++) {
					str2.append(str.charAt(i));
				}
				if (str2.toString().equals("")) {
					Ui.setText("0");
				} else {
					Ui.setText(str2.toString());
				}
			}
		};
	}
	
	private double calc(double x, String input, char opt) {
//        inText.setFont(inText.getFont().deriveFont(Font.BOLD));
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
//        inText.setFont(inText.getFont().deriveFont(Font.PLAIN));
        return y;
    }
	private ActionListener eventSign(char sign, CalcArg args) {
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){
//				repaintFont();
				if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", Ui.getText()))
					 if (args.getGo()) {
						args.setVal(calc(args.getVal(), Ui.getText(), args.getOpt()));
	                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(args.getVal()))) {
	                    	Ui.setText(String.valueOf((int) args.getVal()));
	                    } else {
	                        Ui.setText(String.valueOf(args.getVal()));
						}
	                    args.setOpt(sign);
						args.setGo(false);
	                    args.setAddWrite(false);
					} else {
						if(sign != '%')
							args.setOpt(sign);
					}
				}
		};
	}
	private ActionListener eventPoint(CalcArg args) {
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){
//				repaintFont();
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
	private ActionListener eventEqual(CalcArg args) {
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", Ui.getText()))
		        	if (args.getGo()) {
		            	args.setVal(calc(args.getVal(), Ui.getText(), args.getOpt()));
		            	if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(args.getVal()))) {
		            		Ui.setText(String.valueOf((int) args.getVal()));
		            	} else {
		                	Ui.setText(String.valueOf(args.getVal()));
		            	}
		            	args.setOpt('=');
		             	args.setAddWrite(false);
		         	}
			}
		};
	}
	
	private ActionListener eventStyle(CalcArg args) {
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){
//				System.out.println(Ui.getStyle().getName());
				if(Ui.getStyle().getName().equals("color"))
					Ui.setStyle(new Style("default"));
				else
					Ui.setStyle(new Style("color"));
				Ui.getStyle().Change();
			}
		};
	}
	
}
