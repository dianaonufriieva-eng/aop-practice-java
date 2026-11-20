package homework.h02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void reducesThirtyEightToTwo() {
    assertThat(T1.addDigits(38)).isEqualTo(2);
  }

  @Test
  void returnsZeroForZero() {
    assertThat(T1.addDigits(0)).isEqualTo(0);
  }

  @Test
  void keepsSingleDigit() {
    assertThat(T1.addDigits(9)).isEqualTo(9);
  }

  @Test
  void reducesTenToOne() {
    assertThat(T1.addDigits(10)).isEqualTo(1);
  }

  @Test
  void reducesMaximumInputToOne() {
    assertThat(T1.addDigits(Integer.MAX_VALUE)).isEqualTo(1);
  }

  @Test
  void reducesAllNinesToNine() {
    assertThat(T1.addDigits(999_999_999)).isEqualTo(9);
  }
}
