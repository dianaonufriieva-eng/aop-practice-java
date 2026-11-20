package homework.h03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void calculatesAverageForFirstExample() {
    assertThat(T1.average(new int[] {4000, 3000, 1000, 2000})).isEqualTo(2500.0);
  }

  @Test
  void calculatesAverageForSecondExample() {
    assertThat(T1.average(new int[] {1000, 2000, 3000})).isEqualTo(2000.0);
  }

  @Test
  void handlesEqualSalaries() {
    assertThat(T1.average(new int[] {1000, 1000, 1000})).isEqualTo(1000.0);
  }

  @Test
  void handlesDuplicatedExtremes() {
    assertThat(T1.average(new int[] {1000, 1000, 2000, 2000})).isEqualTo(1500.0);
  }

  @Test
  void handlesMaximumSalaries() {
    assertThat(T1.average(new int[] {1_000_000, 1_000_000, 1_000_000})).isEqualTo(1_000_000.0);
  }

  @Test
  void calculatesAverageWithThreeDifferentSalaries() {
    assertThat(T1.average(new int[] {1000, 500_000, 1_000_000})).isEqualTo(500_000.0);
  }
}
