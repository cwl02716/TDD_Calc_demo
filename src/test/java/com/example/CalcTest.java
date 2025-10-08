package com.example;

import org.junit.*;
import static org.junit.Assert.*;

public class CalcTest
{
   @Test
   public void testAdd()
   {
      assertTrue ("Calc sum incorrect", 5 == Calc.add (2, 3));
   }

   @Test
   public void testSubtract()
   {
      assertTrue("Calc subtract incorrect", 1 == Calc.subtract(3, 2));
   }
   
   @Test
   public void testMultiply()
   {
      assertTrue("Calc multiply incorrect", 6 == Calc.multiply(2, 3));
   }
   
    @Test
    public void testDivide()
    {
       // Decision encoded in test: division returns a double (floating point)
       // Expect 7 / 2 == 3.5
       org.junit.Assert.assertEquals("Calc divide incorrect", 3.5, Calc.divide(7, 2), 1e-9);
    }
   
}
