package homework.h01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void returnsTenForFive() {
    assertThat(T1.smallestEvenMultiple(5)).isEqualTo(10);
  }

  @Test
  void returnsSixForSix() {
    assertThat(T1.smallestEvenMultiple(6)).isEqualTo(6);
  }

  @Test
  void returnsTwoForMinimumInput() {
    assertThat(T1.smallestEvenMultiple(1)).isEqualTo(2);
  }

  @Test
  void returnsMaximumInputWhenItIsEven() {
    assertThat(T1.smallestEvenMultiple(150)).isEqualTo(150);
  }

  @Test
  void doublesLargestOddInput() {
    assertThat(T1.smallestEvenMultiple(149)).isEqualTo(298);
  }
}
