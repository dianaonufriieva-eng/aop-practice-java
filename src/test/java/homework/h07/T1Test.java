package homework.h07;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void returnsFizzBuzzArray() {
    assertThat(T1.fizzBuzz(3)).containsExactly("1", "2", "Fizz");
    assertThat(T1.fizzBuzz(5)).containsExactly("1", "2", "Fizz", "4", "Buzz");
  }
}
