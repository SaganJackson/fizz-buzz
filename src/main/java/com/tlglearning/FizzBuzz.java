package com.tlglearning;

public class FizzBuzz {

  public static final String FIZZ_RESULT = "fizz";
  public static final String BUZZ_RESULT = "buzz";

  public static String valueOf(int num) {
    String result = "";
    if (num % 3 == 0) {
      //result = result + FIZZ_RESULT;
      result += FIZZ_RESULT;
    }
    if (num % 5 == 0) {
      //result = result + BUZZ_RESULT;
      result += BUZZ_RESULT;
    }
    if (result.isEmpty()) {
      //result += num;
      result = String.valueOf(num);
    }
    return result;
  }

}