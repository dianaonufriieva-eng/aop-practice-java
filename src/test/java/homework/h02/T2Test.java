package homework.h02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void returnsTrueForFiveHundredTwentySix() {
    assertThat(T2.isSameAfterReversals(526)).isTrue();
  }

  @Test
  void returnsFalseForEighteenHundred() {
    assertThat(T2.isSameAfterReversals(1800)).isFalse();
  }

  @Test
  void returnsTrueForZero() {
    assertThat(T2.isSameAfterReversals(0)).isTrue();
  }

  @Test
  void returnsFalseForTen() {
    assertThat(T2.isSameAfterReversals(10)).isFalse();
  }

  @Test
  void returnsFalseForMaximumInput() {
    assertThat(T2.isSameAfterReversals(1_000_000)).isFalse();
  }

  @Test
  void returnsTrueForMaximumInputWithoutTrailingZero() {
    assertThat(T2.isSameAfterReversals(999_999)).isTrue();
  }

  @Test
  void returnsTrueForSingleDigit() {
    assertThat(T2.isSameAfterReversals(7)).isTrue();
  }
}
