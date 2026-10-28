package homework.h01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void returnsSameNumberWhenEven() {
    assertThat(T1.smallestEvenMultiple(6)).isEqualTo(6);
  }

  @Test
  void returnsDoubleWhenOdd() {
    assertThat(T1.smallestEvenMultiple(5)).isEqualTo(10);
  }

  @Test
  void handlesMinimumValue() {
    assertThat(T1.smallestEvenMultiple(1)).isEqualTo(2);
  }
}
