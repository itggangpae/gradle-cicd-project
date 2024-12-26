package com.leszko.calculator; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.bind.annotation.RestController; 
 
@RestController
class CalculatorController { 
     @Autowired
     private  Calculator calculator;

     private final Logger logger = LoggerFactory.getLogger(CalculatorController.class);

     @RequestMapping("/sum") 
     String sum(@RequestParam("a") Integer a,  
                @RequestParam("b") Integer b) {
          logger.debug("a: {}, b: {}", a, b);
          return String.valueOf(calculator.sum(a, b)); 
     } 
} 
