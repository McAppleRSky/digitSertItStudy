package ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.operations;

import ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.type.plain.Result;

public class Mult extends AbstractOperation {

    public Mult() {
        objectId = "*";
    }

    @Override
    public Result mainMethod(Object... argument) {
        int mult = 1;
        for(Object arg:argument) mult *= (int) arg;
        return new Result( Integer.valueOf(mult) );
    }

    @Override
    public String getObjectId() {
        return objectId;
    }

}
