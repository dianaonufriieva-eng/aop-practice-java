package homework.h04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void calculatesFirstExample() {
    assertThat(T1.hammingDistance(1, 4)).isEqualTo(2);
  }

  @Test
  void calculatesSecondExample() {
    assertThat(T1.hammingDistance(3, 1)).isEqualTo(1);
  }

  @Test
  void returnsZeroForEqualNumbers() {
    assertThat(T1.hammingDistance(0, 0)).isEqualTo(0);
  }

  @Test
  void calculatesMaximumDistance() {
    assertThat(T1.hammingDistance(0, Integer.MAX_VALUE)).isEqualTo(31);
  }

  @Test
  void returnsZeroForEqualMaximumNumbers() {
    assertThat(T1.hammingDistance(Integer.MAX_VALUE, Integer.MAX_VALUE)).isEqualTo(0);
  }

  @Test
  void calculatesDistanceForSingleBit() {
    assertThat(T1.hammingDistance(0, 1)).isEqualTo(1);
  }
}
