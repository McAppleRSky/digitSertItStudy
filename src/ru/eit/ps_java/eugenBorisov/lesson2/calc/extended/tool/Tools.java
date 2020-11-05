package ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.tool;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class Tools {

    public static String removeWitespace(String result) {
        while (result.indexOf("  ") != -1)
            result = StringUtils.replace(result, "  ", " ");
        return result;
    }

    public static boolean isNumber(String value) {
        boolean isInt = true, isFloat = false;
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException e1) {
            isInt = false;
            isFloat = true;
            try {
                Float.parseFloat(value);
            } catch (NumberFormatException e2) {
                isFloat = false;
            }
        }
        return isInt ^ isFloat;
    }

    public static Object getNumber(String value) {
        Object result = null;
        try {
            result = (Object) Integer.parseInt(value);
        } catch (NumberFormatException e1) {
            try{
                result = (Object) Float.parseFloat(value);
            } catch (NumberFormatException e2){
                e1.printStackTrace();
                e2.printStackTrace();
            }
        }
        return result;
    }

    public static <T> T[] both(T[] first, T[] second) {
        // with https://stackoverflow.com/questions/80476/how-can-i-concatenate-two-arrays-in-java
        T[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }

}

