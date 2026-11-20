package homework.h05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void calculatesFirstExample() {
    assertThat(T2.sortedSquares(new int[] {-4, -1, 0, 3, 10})).containsExactly(0, 1, 9, 16, 100);
  }

  @Test
  void calculatesSecondExample() {
    assertThat(T2.sortedSquares(new int[] {-7, -3, 2, 3, 11})).containsExactly(4, 9, 9, 49, 121);
  }

  @Test
  void handlesSingleNegativeValue() {
    assertThat(T2.sortedSquares(new int[] {-5})).containsExactly(25);
  }

  @Test
  void handlesSingleZero() {
    assertThat(T2.sortedSquares(new int[] {0})).containsExactly(0);
  }

  @Test
  void handlesAllNegativeValues() {
    assertThat(T2.sortedSquares(new int[] {-4, -3, -2, -1})).containsExactly(1, 4, 9, 16);
  }

  @Test
  void handlesExtremeValues() {
    assertThat(T2.sortedSquares(new int[] {-10_000, 10_000}))
        .containsExactly(100_000_000, 100_000_000);
  }

  @Test
  void handlesDuplicatedValues() {
    assertThat(T2.sortedSquares(new int[] {-1, 2, 2})).containsExactly(1, 4, 4);
  }
}
