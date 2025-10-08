package com.example;

// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 3; page ??
// See CalcTest.java, DataDrivenCalcTest.java for JUnit tests

public class Calc
{
   /**
    * Add two integers.
    * @param a first addend
    * @param b second addend
    * @return a + b
    */
   static public int add (int a, int b)
   {
      return a + b;
   }

   /**
    * Subtract two integers.
    * @param a minuend
    * @param b subtrahend
    * @return a - b
    */
   static public int subtract (int a, int b)
   {
      return a - b;
   }

   /**
    * Multiply two integers.
    * @param a multiplicand
    * @param b multiplier
    * @return a * b
    */
   static public int multiply (int a, int b)
   {
      return a * b;
   }

   /**
    * Divide two integers and return a double result.
    * This method throws ArithmeticException on division by zero (explicit design decision).
    * @param a dividend
    * @param b divisor
    * @return (double)a / b
    * @throws ArithmeticException if b == 0
    */
   static public double divide (int a, int b)
   {
      if (b == 0) {
         throw new ArithmeticException("Division by zero");
      }
      return (double)a / b;
   }
}
