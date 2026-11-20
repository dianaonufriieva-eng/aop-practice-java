package homework.h01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void countsOddsInFirstExample() {
    assertThat(T2.countOdds(3, 7)).isEqualTo(3);
  }

  @Test
  void countsOddsInSecondExample() {
    assertThat(T2.countOdds(8, 10)).isEqualTo(1);
  }

  @Test
  void returnsOneForSingleOddNumber() {
    assertThat(T2.countOdds(3, 3)).isEqualTo(1);
  }

  @Test
  void returnsZeroForSingleEvenNumber() {
    assertThat(T2.countOdds(4, 4)).isEqualTo(0);
  }

  @Test
  void handlesZeroRange() {
    assertThat(T2.countOdds(0, 0)).isEqualTo(0);
  }

  @Test
  void handlesMaximumRange() {
    assertThat(T2.countOdds(0, 1_000_000_000)).isEqualTo(500_000_000);
  }

  @Test
  void handlesMaximumOddBoundary() {
    assertThat(T2.countOdds(999_999_999, 1_000_000_000)).isEqualTo(1);
  }
}
