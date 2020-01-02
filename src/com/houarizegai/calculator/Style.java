package com.houarizegai.calculator;

import java.awt.Color;
import java.awt.Component;
import java.util.Arrays;

import javax.swing.JButton;

public class Style {
	private String name = "default";
	
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	
	Style(String string){
		setName(string);
	}
	
	public void Change() {
		Component[] component = Ui.getComponents();
//		System.out.println(component.length);
		for(int i=0; i<component.length; i++)
	    {
	        if (component[i] instanceof JButton)
	        {
	        	JButton btn = (JButton)component[i];
	        	if (name.equals("default")) {
	        		btn.setBackground(null);
	            	if(btn.getText().equals("Untoggle Colors")) {
	            		btn.setText("Toggle Colors");
	            		btn.setBackground(Color.GREEN.darker());
	            		btn.setForeground(Color.WHITE);
	            	} else{
	            		String[] arr = {"C","<-","%","/","*","-","+",".","="};
	            		if(Arrays.asList(arr).contains(btn.getText()))
	            			btn.setForeground(Color.BLACK);
	            	}
	        	} else if(name.equals("color")){
	            	if(btn.getText().equals("Toggle Colors")) {
	            		btn.setText("Untoggle Colors");
	            		btn.setBackground(null);
	            		btn.setForeground(Color.BLACK);
	            	} else{
	            		String[] arr = {"C","<-","%","/","*","-","+",".","="};
	            		if(Arrays.asList(arr).contains(btn.getText())) {
	            			btn.setForeground(Color.WHITE);
	            			
	            			int index = Arrays.asList(arr).indexOf(btn.getText());
	            			if(index == 0) {
	            				btn.setBackground(Color.RED);
	            			} else if(index == 1) {
	            				btn.setBackground(Color.ORANGE);
	            			} else if(index == 2) {
	            				btn.setBackground(Color.GREEN);
	            			} else if(index == 7) {
	            				btn.setBackground(Color.MAGENTA);
	            			} else if(index == 8) {
	            				btn.setBackground(Color.BLUE);
	            			} else {
	            				btn.setBackground(Color.PINK);
	            			}
	            		} else {
//	            			btn.setBackground(Color.WHITE);
	            		}
	            	}
	        	}
	        }
	    }
	}
	
}
