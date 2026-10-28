package homework.h05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void calculatesMaxProductDifference() {
    assertThat(T1.maxProductDifference(new int[] {5, 6, 2, 7, 4})).isEqualTo(34);
    assertThat(T1.maxProductDifference(new int[] {4, 2, 5, 9, 7, 4, 8})).isEqualTo(64);
  }
}
