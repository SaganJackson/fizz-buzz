package com.tlglearning;

import java.util.Set;

public class Main {

  public static void main(String[] args) {


    int i = 1;
    do {
      Set<FizzBuzz> value = FizzBuzz.valueOf(i);
      System.out.printf("%d: %s%n", i, value);

      i++;
    } while (i <= 100);
  }
}
//while loop - only lets us put the condition inside the statement
    //while (i <= 100) {
      /*  STOP AT 15 = fizzbuzz
      String value = FizzBuzz.valueOf(i);
      System.out.println(value);
      if (value.equals("fizzbuzz")) {
      break;
      }
      i++;
*/

      //System.out.println(FizzBuzz.valueOf(i));
     // i++;

      //same as this for loop
      // for (int i = 1; i <= 100; i++) {
      //  System.out.println(FizzBuzz.valueOf(i)) }





//do example
/*
do {
Set<FizzBuzz value = FizzBuzz.valueOf(i);
System.out.println(value);

i++;
} while (i <= 100);
}
}


 */