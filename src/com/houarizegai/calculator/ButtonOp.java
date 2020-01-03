package com.houarizegai.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

public class ButtonOp extends ButtonFunc {
	ButtonOp(String sign){
		setName(sign);
	}
	
	@Override
	protected ActionListener event(CalcArg args) {
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (Pattern.matches("([-]?\\d+[.]\\d*)|([-]?\\d+)", Ui.getText()))
					 if (args.getGo()) {
						args.setVal(CalcArg.calc(args.getVal(), Ui.getText(), args.getOpt()));
						setTextByType(args);
	                    args.setOpt(name.charAt(0));
	                    if(name.charAt(0) != '=')
	                    	args.setGo(false);
						args.setAddWrite(false);
					 } else {
						args.setOpt(name.charAt(0));
					 }
				}
		};
	}
	
	
}
