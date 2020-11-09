package ru.eit.ps_java.eugenBorisov.lesson5.salary;

import org.junit.Test;

import static org.junit.Assert.*;

public class WorkerTest {

    @Test
    public void testFio(){
        WorkerSource workerSource = new WorkerSource();
        assertEquals("Иванов П.С.", workerSource.genFio("Иванов", "Петр", "Сидорович") );
    }

}