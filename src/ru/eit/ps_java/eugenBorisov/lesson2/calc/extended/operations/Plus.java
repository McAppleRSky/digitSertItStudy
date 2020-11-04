package ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.operations;

import ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.type.plain.Result;

public class Plus extends AbstractOperation {

    public Plus() {
        objectId = "+";
    }

    @Override
    public Result mainMethod(Object... argument) {
        int sum = 0;
        for(Object arg:argument) sum += (int) arg;
        return new Result( Integer.valueOf(sum) );
    }

    @Override
    public String getObjectId() {
        return objectId;
    }

}
