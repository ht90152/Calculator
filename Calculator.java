
package com.houarizegai.calculator;

public class Calculator {
    /*
        Mx Calculator: 
        X = Ligne
        Y = Column
    
        +-------------------+
        |   +-----------+   |   y[0]
        |   |           |   |
        |   +-----------+   |
        |                   |
        |   C  <-   %   /   |   y[1]
        |   7   8   9   *   |   y[2]
        |   4   5   6   -   |   y[3]
        |   1   2   3   +   |   y[4]
        |  +/-  0   .   =   |   y[5]
        +-------------------+
         x[0] x[1] x[2] x[3]
    
    */
    
    /*    
        +-------------------+
        |   +-----------+   |   y[0]
        |   |           |   |
        |   +-----------+   |
        |                   |
        |   0   1   1   3   |   y[1]
        |   4   5   6   7   |   y[2]
        |   8   9   10  11  |   y[3]
        |   12  13  14  15  |   y[4]
        |   16  17  18  19  |   y[5]
        +-------------------+
         x[0] x[1] x[2] x[3]
    
    */
	private static CalcArg args;
	public static CalcArg getArgs() {
		return args;
	}
	public void setArgs(CalcArg args) {
		this.args = args;
	}
	
    private Calculator() {
        setArgs(new CalcArg());
    	new Ui();
    }

    public static void main(String[] args) {
        new Calculator();
    }
}