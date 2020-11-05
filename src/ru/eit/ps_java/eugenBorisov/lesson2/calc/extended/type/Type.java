package ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.type;

import ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.type.plain.Result;

import static ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.tool.Tools.isNumber;

public class Type extends Result {

    public Type(Object result) {
        super(result);
    }

    public boolean isNul(){
        boolean result = false
                ,intIsNul = false
                ,floatIsNul = false
        ;
        Object value = getResult();
        int intValue;
        float floatValue;
        try {
            intValue = (Integer)value;
            if(intValue == 0) result = true;
        } catch (Exception e1) {
            try{
                floatValue = (Float)value;
                if(floatValue==0f) result = true;
            }catch (Exception e2){
                throw new NullPointerException("Can't assert nul result");
            }
        }
        return result;
    }

}
