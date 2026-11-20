package homework.h07;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void calculatesFirstExample() {
    assertThat(T1.fizzBuzz(3)).containsExactly("1", "2", "Fizz");
  }

  @Test
  void calculatesSecondExample() {
    assertThat(T1.fizzBuzz(5)).containsExactly("1", "2", "Fizz", "4", "Buzz");
  }

  @Test
  void calculatesThirdExample() {
    assertThat(T1.fizzBuzz(15))
        .containsExactly(
            "1",
            "2",
            "Fizz",
            "4",
            "Buzz",
            "Fizz",
            "7",
            "8",
            "Fizz",
            "Buzz",
            "11",
            "Fizz",
            "13",
            "14",
            "FizzBuzz");
  }

  @Test
  void handlesOne() {
    assertThat(T1.fizzBuzz(1)).containsExactly("1");
  }

  @Test
  void handlesMaximumInput() {
    List<String> answer = T1.fizzBuzz(10_000);

    assertThat(answer).hasSize(10_000);
    assertThat(answer.get(9_999)).isEqualTo("Buzz");
  }
}
