package homework.h05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void calculatesFirstExample() {
    assertThat(T1.maxProductDifference(new int[] {5, 6, 2, 7, 4})).isEqualTo(34);
  }

  @Test
  void calculatesSecondExample() {
    assertThat(T1.maxProductDifference(new int[] {4, 2, 5, 9, 7, 4, 8})).isEqualTo(64);
  }

  @Test
  void handlesMinimumLengthWithEqualValues() {
    assertThat(T1.maxProductDifference(new int[] {1, 1, 1, 1})).isEqualTo(0);
  }

  @Test
  void calculatesDifferenceForFourDistinctValues() {
    assertThat(T1.maxProductDifference(new int[] {1, 2, 3, 4})).isEqualTo(10);
  }

  @Test
  void handlesDuplicatedExtremes() {
    assertThat(T1.maxProductDifference(new int[] {1, 1, 4, 4})).isEqualTo(15);
  }

  @Test
  void handlesMaximumValues() {
    assertThat(T1.maxProductDifference(new int[] {10_000, 10_000, 10_000, 10_000})).isEqualTo(0);
  }

  @Test
  void calculatesLargestPossibleDifference() {
    assertThat(T1.maxProductDifference(new int[] {1, 1, 10_000, 10_000})).isEqualTo(99_999_999);
  }
}
