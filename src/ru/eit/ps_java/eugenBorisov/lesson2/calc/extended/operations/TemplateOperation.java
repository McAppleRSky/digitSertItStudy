package ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.operations;

import ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.type.plain.Result;

public class TemplateOperation extends AbstractOperation {

    public TemplateOperation() {
        objectId = "tmp";
    }

    @Override
    public Object mainMethod(Object... argument) {
        return new Result(null);
    }

    @Override
    public String getObjectId() {
        return objectId;
    }

}
