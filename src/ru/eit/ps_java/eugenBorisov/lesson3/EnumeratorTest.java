package ru.eit.ps_java.eugenBorisov.lesson3;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.eit.ps_java.eugenBorisov.lesson3.Enumerator.countNumber;
import static ru.eit.ps_java.eugenBorisov.lesson3.Enumerator.counter;

public class EnumeratorTest {

    int[] testTaskNumbers = new int[]{1, 2, 3, 2, 3, 1, 1, 1, 1, 3};

    @Test
    public void textCountNumber(){
        countNumber(counter, testTaskNumbers);
        assertEquals(3, counter.size() );
        assertTrue( counter.containsKey(1) );
        assertTrue( counter.containsKey(2) );
        assertTrue( counter.containsKey(3) );
        assertEquals( Integer.valueOf(5), counter.get(1) );
        assertEquals( Integer.valueOf(2), counter.get(2) );
        assertEquals( Integer.valueOf(3), counter.get(3) );
    }

}