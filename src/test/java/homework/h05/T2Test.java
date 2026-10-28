package homework.h05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void returnsSortedSquares() {
    assertThat(T2.sortedSquares(new int[] {-4, -1, 0, 3, 10})).containsExactly(0, 1, 9, 16, 100);
    assertThat(T2.sortedSquares(new int[] {-7, -3, 2, 3, 11})).containsExactly(4, 9, 9, 49, 121);
  }
}
