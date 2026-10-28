package homework.h07;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void countsStepsToZero() {
    assertThat(T2.numberOfSteps(14)).isEqualTo(6);
    assertThat(T2.numberOfSteps(8)).isEqualTo(4);
    assertThat(T2.numberOfSteps(0)).isEqualTo(0);
  }
}
