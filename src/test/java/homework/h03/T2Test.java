package homework.h03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void calculatesDifferenceOfSums() {
    assertThat(T2.differenceOfSums(10, 3)).isEqualTo(19);
    assertThat(T2.differenceOfSums(5, 6)).isEqualTo(15);
    assertThat(T2.differenceOfSums(5, 1)).isEqualTo(-15);
  }
}
