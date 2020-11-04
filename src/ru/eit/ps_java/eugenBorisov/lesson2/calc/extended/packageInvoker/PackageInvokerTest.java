package ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.packageInvoker;

import org.junit.Assert;
import org.junit.Test;
import ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.operations.AbstractOperation;
import ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.type.plain.Result;

import static org.junit.Assert.*;

public class PackageInvokerTest {

    @Test
    public void testEnumerator(){
        PackageInvoker enumeratorOperation = new PackageInvoker(AbstractOperation.class);
        assertEquals( 2, enumeratorOperation.listObject.size() );
    }

    @Test
    public void testTemplate(){
        PackageInvoker enumeratorOperation = new PackageInvoker(AbstractOperation.class);
        Assert.assertEquals( null, ( (Result)enumeratorOperation.invokeMain("tmp") ).getResult() );
    }

    @Test
    public void testSum(){
        PackageInvoker enumeratorOperation = new PackageInvoker(AbstractOperation.class);
        assertEquals( 1, ( (Result)enumeratorOperation.invokeMain("sum", 1) ).getResult() );
        assertEquals( 3, ( (Result)enumeratorOperation.invokeMain("sum", 1, 2) ).getResult() );
        assertEquals( 6, ( (Result)enumeratorOperation.invokeMain("sum", 1, 2, 3) ).getResult() );
    }

}