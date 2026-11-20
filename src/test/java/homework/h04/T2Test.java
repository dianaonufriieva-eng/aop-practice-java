package homework.h04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void findsComplementForFirstExample() {
    assertThat(T2.findComplement(5)).isEqualTo(2);
  }

  @Test
  void findsComplementForSecondExample() {
    assertThat(T2.findComplement(1)).isEqualTo(0);
  }

  @Test
  void findsComplementForPowerOfTwo() {
    assertThat(T2.findComplement(2)).isEqualTo(1);
  }

  @Test
  void findsComplementForAllOnes() {
    assertThat(T2.findComplement(3)).isEqualTo(0);
  }

  @Test
  void findsComplementForMaximumInput() {
    assertThat(T2.findComplement(Integer.MAX_VALUE)).isEqualTo(0);
  }

  @Test
  void findsComplementForPowerOfThirty() {
    assertThat(T2.findComplement(1_073_741_824)).isEqualTo(1_073_741_823);
  }

  @Test
  void findsComplementForMaximumInputMinusOne() {
    assertThat(T2.findComplement(Integer.MAX_VALUE - 1)).isEqualTo(1);
  }
}
