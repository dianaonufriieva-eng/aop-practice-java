package homework.h02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void returnsTrueWhenNoTrailingZeros() {
    assertThat(T2.isSameAfterReversals(526)).isTrue();
  }

  @Test
  void returnsFalseWhenHasTrailingZeros() {
    assertThat(T2.isSameAfterReversals(1800)).isFalse();
  }

  @Test
  void handlesZero() {
    assertThat(T2.isSameAfterReversals(0)).isTrue();
  }
}
