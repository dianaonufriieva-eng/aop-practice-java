package homework.h07;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void calculatesFirstExample() {
    assertThat(T2.numberOfSteps(14)).isEqualTo(6);
  }

  @Test
  void calculatesSecondExample() {
    assertThat(T2.numberOfSteps(8)).isEqualTo(4);
  }

  @Test
  void calculatesThirdExample() {
    assertThat(T2.numberOfSteps(123)).isEqualTo(12);
  }

  @Test
  void handlesZero() {
    assertThat(T2.numberOfSteps(0)).isEqualTo(0);
  }

  @Test
  void handlesOne() {
    assertThat(T2.numberOfSteps(1)).isEqualTo(1);
  }

  @Test
  void handlesTwo() {
    assertThat(T2.numberOfSteps(2)).isEqualTo(2);
  }

  @Test
  void handlesMaximumInput() {
    assertThat(T2.numberOfSteps(1_000_000)).isEqualTo(26);
  }
}
