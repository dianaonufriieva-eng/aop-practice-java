package homework.h04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void findsComplement() {
    assertThat(T2.findComplement(5)).isEqualTo(2);
    assertThat(T2.findComplement(1)).isEqualTo(0);
  }
}
