package org.example;

public class Calculator {

       public int Add(int a, int b) {
              return a+b;
       }

       public int Multiply(int a, int b) {
              return a-b;
       }

       public String transform(int number) {
              if (number < 12) return "OK";
              if (number == 32) return "My number";
              if (number == 53) return "Your number";
              return "Not OK";
       }
}
