package ru.eit.ps_java.eugenBorisov.lesson2.calc.simple;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {

    @Test
    public void testSolve(){
        Calc simple = new Calc();
        assertEquals( 3, simple.solvePlus(1, 2) );
        assertEquals( -1, simple.solveMinus(1, 2) );
        assertEquals( 4, simple.solveMult(2, 2) );
        assertEquals( Float.toString(2f), Float.toString(simple.solveDiv(6, 3)) );
        assertEquals(2f, simple.solveDiv(6, 3), 0.001);
    }

    @Test
    public void testOperatePlusMinus(){
        Calc simple = new Calc();
        assertEquals("3", simple.solveByWhitespaceDelimiter("1 + 2") );
        assertEquals("2", simple.solveByWhitespaceDelimiter("3 - 1") );
    }

    @Test
    public void testOperateMult(){
        Calc simple = new Calc();
        assertEquals("4", simple.solveByWhitespaceDelimiter("2 * 2") );
    }

    @Test
    public void testOperateDiv(){
        Calc simple = new Calc();
        assertEquals(Float.toString(2f), simple.solveByWhitespaceDelimiter("6 / 3"));
        assertEquals("Error", simple.solveByWhitespaceDelimiter("6 / 0").substring(0,5));
    }


}