package com.leszko.calculator;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.bind.annotation.RestController; 
 
@RestController
@RequiredArgsConstructor
class CalculatorController { 

     private  final Calculator calculator;
     private final MemberService memberService;
     private final Logger logger = LoggerFactory.getLogger(CalculatorController.class);
     @RequestMapping("/")
     String save() {

          memberService.save();
          return "Success";
     }

     @RequestMapping("/health")
     String health() {
          return "OK";
     }

     @RequestMapping("/sum") 
     String sum(@RequestParam("a") Integer a,  
                @RequestParam("b") Integer b) {
          logger.debug("a: {}, b: {}", a, b);

          return String.valueOf(calculator.sum(a, b)); 
     } 
} 
