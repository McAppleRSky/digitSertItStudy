package ru.eit.ps_java.eugenBorisov.lesson2.calc.strong;

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
        assertEquals("3", simple.solve("1+2") );
        assertEquals("2", simple.solve("3-1") );
    }

    @Test
    public void testOperateMult(){
        Calc simple = new Calc();
        assertEquals("4", simple.solve("2*2") );
    }

    @Test
    public void testOperateDiv(){
        Calc simple = new Calc();
        assertEquals(Float.toString(2f), simple.solve("6/3"));
        assertEquals("Error", simple.solve("6/0").substring(0,5));
    }

}
