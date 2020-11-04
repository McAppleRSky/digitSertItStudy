package ru.eit.ps_java.eugenBorisov.lesson2.calc.extended;

import org.junit.Test;
import ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.operations.*;
import ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.packageInvoker.PackageInvoker;
import ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.type.plain.Result;

import static org.junit.Assert.*;

public class CalcTest {

    @Test
    public void testPlus(){
        Plus plus = new Plus();
        assertEquals( 3, (int)plus.mainMethod(1, 2).getResult() );
        assertEquals( 6, (int)plus.mainMethod(1, 2, 3).getResult() );
        assertEquals( 10, (int)plus.mainMethod(1, 2, 3, 4).getResult() );
    }

    @Test
    public void testMinus(){
        Minus minus = new Minus();
        assertEquals( -1, (int)minus.mainMethod(1, 2).getResult() );
        assertEquals( -4, (int)minus.mainMethod(1, 2, 3).getResult() );
        assertEquals( -8, (int)minus.mainMethod(1, 2, 3, 4).getResult() );
    }

    @Test
    public void testMult(){
        Mult mult = new Mult();
        assertEquals( 4, (int)mult.mainMethod(2, 2).getResult() );
        assertEquals( 12, (int)mult.mainMethod(2, 2, 3).getResult() );
        assertEquals( 48, (int)mult.mainMethod(2, 2, 3, 4).getResult() );
    }

    @Test
    public void testDiv(){
        Div div = new Div();
        assertEquals( 2f, (float)div.mainMethod(2, 1).getResult(), 0.001);
        assertEquals( 1f, (float)div.mainMethod(2, 1, 2).getResult() , 0.001);
        assertEquals( 0.333, (float)div.mainMethod(2, 1, 2, 3).getResult() , 0.001);
    }

    @Test
    public void testPlusReflect(){
        PackageInvoker operation = new PackageInvoker(AbstractOperation.class);
        assertEquals( 3,
                (int)(
                        (Result) operation.invokeMain("+",1, 2)
                ).getResult()
        );
    }

    @Test
    public void testMinusReflect(){
        PackageInvoker operation = new PackageInvoker(AbstractOperation.class);
        assertEquals( -1,
                (int)(
                        (Result) operation.invokeMain("-",1, 2)
                ).getResult()
        );
    }

    @Test
    public void testMultReflect(){
        PackageInvoker operation = new PackageInvoker(AbstractOperation.class);
        assertEquals( 4,
                (int)(
                        (Result) operation.invokeMain("*",2, 2)
                ).getResult()
        );
    }

    @Test
    public void testDivReflect(){
        PackageInvoker operation = new PackageInvoker(AbstractOperation.class);
        assertEquals(2f,
                (float)(
                        (Result) operation.invokeMain("/",2, 1)
                ).getResult(),
                0.001
        );
    }

}