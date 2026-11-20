package homework.h06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void validatesFirstExample() {
    assertThat(T2.isPalindrome("A man, a plan, a canal: Panama")).isTrue();
  }

  @Test
  void rejectsSecondExample() {
    assertThat(T2.isPalindrome("race a car")).isFalse();
  }

  @Test
  void acceptsSingleSpace() {
    assertThat(T2.isPalindrome(" ")).isTrue();
  }

  @Test
  void acceptsStringWithoutAlphanumericCharacters() {
    assertThat(T2.isPalindrome(".,")).isTrue();
  }

  @Test
  void rejectsDifferentAlphanumericCharacters() {
    assertThat(T2.isPalindrome("0P")).isFalse();
  }

  @Test
  void acceptsSingleCharacter() {
    assertThat(T2.isPalindrome("a")).isTrue();
  }

  @Test
  void acceptsPunctuationBetweenLetters() {
    assertThat(T2.isPalindrome("ab_a")).isTrue();
  }

  @Test
  void acceptsEmptyString() {
    assertThat(T2.isPalindrome("")).isTrue();
  }
}
