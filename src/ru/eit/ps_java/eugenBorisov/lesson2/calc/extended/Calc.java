package ru.eit.ps_java.eugenBorisov.lesson2.calc.extended;

import ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.packageInvoker.PackageInvoker;
import ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.type.plain.Result;

public class Calc extends PackageInvoker {

    public Calc(Class classType) {
        super(classType);
    }

    String solve(String expression) {
        String result = null;
        String[] elements = expression.split(" ");
//        int[] arg = new int[2];
        if(elements.length<3)throw new NullPointerException("Too few arguments");
        try {
            arg[0] = Integer.parseInt(elements[0]);
            arg[1] = Integer.parseInt(elements[2]);
        } catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
        }
        switch ( elements[1].charAt(0) ){
            case '+':
                result = Integer.toString( (int)(
                        (Result) this.invokeMain( String.valueOf(elements[1].charAt(0) ), arg[0], arg[1])
                ).getResult() );
                break;
            case '-':
                result = Integer.toString( (int)(
                        (Result) this.invokeMain( String.valueOf(elements[1].charAt(0) ), arg[0], arg[1])
                ).getResult() );
                break;
            case '*':
                result = Integer.toString( (int)(
                        (Result) this.invokeMain( String.valueOf(elements[1].charAt(0) ), arg[0], arg[1])
                ).getResult() );
                break;
            case '/':
                result = Float.toString( (int)(
                        (Result) this.invokeMain( String.valueOf(elements[1].charAt(0) ), arg[0], arg[1])
                ).getResult() );
/*
                result = arg[1] == 0 ? "Error: divide by zero"
                        : Float.toString( solveDiv(arg[0], arg[1]) );
*/
                break;
            default:
                throw new NullPointerException("Unknown operation");
        }
        return result;
    }

}
