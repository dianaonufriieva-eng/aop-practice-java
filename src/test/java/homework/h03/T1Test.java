package homework.h03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void calculatesAverageExcludingMinAndMax() {
    assertThat(T1.average(new int[] {4000, 3000, 1000, 2000})).isEqualTo(2500.0);
    assertThat(T1.average(new int[] {1000, 2000, 3000})).isEqualTo(2000.0);
  }
}
