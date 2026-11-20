package homework.h07;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/fizz-buzz/

public class T1 {
  public static List<String> fizzBuzz(int limit) {
    List<String> answer = new ArrayList<>();

    for (int value = 1; value <= limit; value++) {
      if (value % 15 == 0) {
        answer.add("FizzBuzz");
      } else if (value % 3 == 0) {
        answer.add("Fizz");
      } else if (value % 5 == 0) {
        answer.add("Buzz");
      } else {
        answer.add(Integer.toString(value));
      }
    }

    return answer;
  }
}
