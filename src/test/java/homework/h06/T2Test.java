package homework.h06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void validatesPalindrome() {
    assertThat(T2.isPalindrome("A man, a plan, a canal: Panama")).isTrue();
    assertThat(T2.isPalindrome("race a car")).isFalse();
    assertThat(T2.isPalindrome(" ")).isTrue();
  }
}
