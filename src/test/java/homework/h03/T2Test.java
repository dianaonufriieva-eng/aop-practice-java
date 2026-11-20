package homework.h03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void calculatesFirstExample() {
    assertThat(T2.differenceOfSums(10, 3)).isEqualTo(19);
  }

  @Test
  void calculatesSecondExample() {
    assertThat(T2.differenceOfSums(5, 6)).isEqualTo(15);
  }

  @Test
  void calculatesThirdExample() {
    assertThat(T2.differenceOfSums(5, 1)).isEqualTo(-15);
  }

  @Test
  void handlesEqualNumbers() {
    assertThat(T2.differenceOfSums(1, 1)).isEqualTo(-1);
  }

  @Test
  void handlesDivisorGreaterThanMaximum() {
    assertThat(T2.differenceOfSums(3, 5)).isEqualTo(6);
  }

  @Test
  void handlesMaximumNWithUnitDivisor() {
    assertThat(T2.differenceOfSums(1000, 1)).isEqualTo(-500_500);
  }

  @Test
  void handlesMaximumNWithMaximumDivisor() {
    assertThat(T2.differenceOfSums(1000, 1000)).isEqualTo(498_500);
  }
}
