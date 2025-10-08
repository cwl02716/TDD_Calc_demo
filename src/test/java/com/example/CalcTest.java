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
   
}
