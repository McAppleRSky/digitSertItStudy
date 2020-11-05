package ru.eit.ps_java.eugenBorisov.lesson2.calc.extended;

import org.junit.Ignore;
import org.junit.Test;
import ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.operations.*;
import ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.packageInvoker.PackageInvoker;
import ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.type.plain.Result;

import static org.junit.Assert.*;
import static ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.tool.Tools.*;

public class CalcTest {

    @Test
    public void testPlus() {
        Plus plus = new Plus();
        assertEquals(3, (int) plus.mainMethod(1, 2).getResult());
        assertEquals(6, (int) plus.mainMethod(1, 2, 3).getResult());
        assertEquals(10, (int) plus.mainMethod(1, 2, 3, 4).getResult());
    }

    @Test
    public void testMinus() {
        Minus minus = new Minus();
        assertEquals(-1, (int) minus.mainMethod(1, 2).getResult());
        assertEquals(-4, (int) minus.mainMethod(1, 2, 3).getResult());
        assertEquals(-8, (int) minus.mainMethod(1, 2, 3, 4).getResult());
    }

    @Test
    public void testMult() {
        Mult mult = new Mult();
        assertEquals(4, (int) mult.mainMethod(2, 2).getResult());
        assertEquals(12, (int) mult.mainMethod(2, 2, 3).getResult());
        assertEquals(48, (int) mult.mainMethod(2, 2, 3, 4).getResult());
    }

    @Test
    public void testDiv() {
        Div div = new Div();
        assertEquals(2f, (float) div.mainMethod(2, 1).getResult(), 0.001);
        assertEquals(1f, (float) div.mainMethod(2, 1, 2).getResult(), 0.001);
        assertEquals(0.333, (float) div.mainMethod(2, 1, 2, 3).getResult(), 0.001);
    }

    @Test
    public void testPlusReflect() {
        PackageInvoker operation = new PackageInvoker(AbstractOperation.class);
        assertEquals(3,
                (int) (
                        (Result) operation.invokeMain("+", 1, 2)
                ).getResult()
        );
    }

    @Test
    public void testMinusReflect() {
        PackageInvoker operation = new PackageInvoker(AbstractOperation.class);
        assertEquals(-1,
                (int) (
                        (Result) operation.invokeMain("-", 1, 2)
                ).getResult()
        );
    }

    @Test
    public void testMultReflect() {
        PackageInvoker operation = new PackageInvoker(AbstractOperation.class);
        assertEquals(4,
                (int) (
                        (Result) operation.invokeMain("*", 2, 2)
                ).getResult()
        );
    }

    @Test
    public void testDivReflect() {
        PackageInvoker operation = new PackageInvoker(AbstractOperation.class);
        assertEquals(2f,
                (float) (
                        (Result) operation.invokeMain("/", 2, 1)
                ).getResult(),
                0.001
        );
    }

    @Test
    public void testRemoveWhitespace() {
        assertEquals(" ", removeWitespace("  "));
        assertEquals("1 + 1 ", removeWitespace("1   +  1  "));
        assertEquals("1 + 1", " 1 + 1  ".strip());
    }

    String[] testInt = new String[]{"0", "1", "01", "55", "666", "-1", "9999999"};
    String[] testFloat = new String[]{"0.1", "-0.1", ".0", "-.1", "0.000000001"};
    @Test
    public void testIsNumber() {
        for (String tstNumb : both(testInt, testFloat))
            assertTrue(isNumber(tstNumb));
    }

    @Test
    public void testNotNumber() {
        String[] testNotNumbers = new String[]{"", "tstNumb", "0,1", "5-5", "1+1", "1 + 1", "/1", "*"};
        for (String tstNotNumb : testNotNumbers)
            assertFalse(isNumber(tstNotNumb));
    }

    @Test
    public void testGetValue() {
        Calc calc = new Calc(AbstractOperation.class);
        for (String tstNumb : both(testInt, testFloat))
            assertEquals( tstNumb, calc.getValueOrSplitIntoTwo(tstNumb) );
    }

    @Test
    public void testGetNumberInt() {
        Integer[] ints = new Integer[]{0, 1, 1, 55, 666, -1, 9999999};
        for (int i = 0; i <ints.length;i++)
            assertEquals( ints[i], getNumber(testInt[i]) );
    }
    @Test
    public void testGetNumberFloat() {
        Float[] floats = new Float[]{0.1f, -0.1f, 0.0f, -.1f, 0.000000001f};
        for (int i = 0; i <floats.length;i++)
            assertEquals( floats[i], (Float)getNumber(testFloat[i]), 0.0001);
    }

    @Test
    public void testGetSimple2Plus2() {
        Calc calc = new Calc(AbstractOperation.class);
        assertEquals( "3", calc.getValueOrSplitIntoTwo("1+2") );
        assertEquals( "6", calc.getValueOrSplitIntoTwo("1+2+3") );
        assertEquals( "10", calc.getValueOrSplitIntoTwo("1+2+3+4") );
    }

    @Test
    public void testGetSimple() {
        Calc calc = new Calc(AbstractOperation.class);
        assertEquals( "-1", calc.getValueOrSplitIntoTwo("1-2") );
        assertEquals( "0", calc.getValueOrSplitIntoTwo("1+2-3") );
        assertEquals( "3", calc.getValueOrSplitIntoTwo("1+2*3-4") );
    }

    @Test
    public void testGetBrood() {
        Calc calc = new Calc(AbstractOperation.class);
        assertEquals("3", calc.getValueOrSplitIntoTwo("1 + 2 * 3 - 4") );
        assertEquals("24", calc.getValueOrSplitIntoTwo("1 * 2 *  3  * 4") );
    }

    @Test
    public void testParser() {
        Calc calc = new Calc(AbstractOperation.class);
        assertEquals("3", calc.parse(" 1 +  2 "));
    }

    @Test
    public void testGetSimpleDiv() {
        String testError = "Error--";
        assertEquals("Error", testError.substring(0,5) );
        Calc calc = new Calc(AbstractOperation.class);
        assertEquals("Error", calc.parse("1/0").substring(0, 5) );
        assertEquals("Error", calc.parse("1 / 0.0").substring(0, 5) );
        assertEquals(String.valueOf(2f), calc.parse("6 / 3") );
    }

    @Test
    @Ignore
    public void testGetComplexDiv() {
        Calc calc = new Calc(AbstractOperation.class);
        assertEquals(String.valueOf(2f), calc.parse("1 + 3 + 6 / 3") );
    }
    
}
