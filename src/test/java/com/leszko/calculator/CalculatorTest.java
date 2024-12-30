package com.leszko.calculator;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
@SpringBootTest
public class CalculatorTest { 
     private Calculator calculator = new Calculator(); 
 
     @Test 
     public void testSum() { 
          assertEquals(5, calculator.sum(2, 3)); 
     } 
} 
