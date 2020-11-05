package ru.eit.ps_java.eugenBorisov.lesson2.calc.extended;

import ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.packageInvoker.PackageInvoker;
import ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.type.Type;
import ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.type.plain.Result;

import static ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.tool.Tools.*;

public class Calc extends PackageInvoker {

    private final String[] orderedOperationRegex = new String[]{"[+-]", "\\*|\\/"};

    public Calc(Class classType) {
        super(classType);
    }

    String parse(String expressionBrood) {
        return getValueOrSplitIntoTwo(removeWitespace(expressionBrood).trim());
    }

    protected String getValueOrSplitIntoTwo(String expression) {
        char operationSymbol = 0;
        if (isNumber(expression)) return expression;
        else {
            for (String currentLevelOperation : orderedOperationRegex) {
                String[] halfExpr = expression.split(currentLevelOperation, 2);
                Type[] argument = new Type[2];
                if (halfExpr.length == 2) {
                    operationSymbol = expression.charAt(halfExpr[0].length());
                    if (operationSymbol == 0)
                        throw new NullPointerException("Unknown operation"); //todo check list of operation
                    for (var i = 0; i < argument.length; i++)
                        argument[i] = new Type(
                                getNumber (
                                        getValueOrSplitIntoTwo ( halfExpr[i].trim() )
                                    )
                                );
                    if(operationSymbol == '/')
                        if ( argument[1].isNul() ) return "Error: divide by nul";
                        else return Float.toString( (float)(
                                    (Result) this.invokeMain(String.valueOf(operationSymbol),
                                            argument[0].getResult(),
                                            argument[1].getResult())
                            ).getResult()
                        );
                    else  return Integer.toString( (int)(
                                    (Result) this.invokeMain(String.valueOf(operationSymbol),
                                            argument[0].getResult(),
                                            argument[1].getResult())
                            ).getResult()
                    );
                }
            }
            throw new NullPointerException("Can't parse");
        }
    }
}
