package homework.h02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void addsDigitsUntilSingleDigit() {
    assertThat(T1.addDigits(38)).isEqualTo(2);
  }

  @Test
  void handlesZero() {
    assertThat(T1.addDigits(0)).isEqualTo(0);
  }
}
