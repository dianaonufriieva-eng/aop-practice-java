package homework.h04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void calculatesHammingDistance() {
    assertThat(T1.hammingDistance(1, 4)).isEqualTo(2);
    assertThat(T1.hammingDistance(3, 1)).isEqualTo(1);
  }
}
