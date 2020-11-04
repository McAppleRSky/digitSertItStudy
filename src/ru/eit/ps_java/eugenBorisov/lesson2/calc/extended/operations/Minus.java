package ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.operations;

import ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.type.plain.Result;

public class Minus extends AbstractOperation {

    public Minus() {
        objectId = "-";
    }

    @Override
    public Result mainMethod(Object... argument) {
        int first = (int)argument[0];
        for (int i = 1;i<argument.length;i++) first -= (int)argument[i];
        return new Result( Integer.valueOf(first) );
    }

    @Override
    public String getObjectId() {
        return objectId;
    }

}
