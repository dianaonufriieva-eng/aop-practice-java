package homework.h01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void countsOddsInInterval() {
    assertThat(T2.countOdds(3, 7)).isEqualTo(3);
    assertThat(T2.countOdds(8, 10)).isEqualTo(1);
  }

  @Test
  void handlesSameLowAndHigh() {
    assertThat(T2.countOdds(3, 3)).isEqualTo(1);
    assertThat(T2.countOdds(4, 4)).isEqualTo(0);
  }
}
