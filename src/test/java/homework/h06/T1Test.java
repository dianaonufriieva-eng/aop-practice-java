package homework.h06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void validatesFirstExample() {
    assertThat(T1.isAnagram("anagram", "nagaram")).isTrue();
  }

  @Test
  void rejectsSecondExample() {
    assertThat(T1.isAnagram("rat", "car")).isFalse();
  }

  @Test
  void rejectsDifferentLengths() {
    assertThat(T1.isAnagram("a", "ab")).isFalse();
  }

  @Test
  void acceptsEmptyStrings() {
    assertThat(T1.isAnagram("", "")).isTrue();
  }

  @Test
  void rejectsSameLengthWithDifferentCounts() {
    assertThat(T1.isAnagram("aacc", "ccac")).isFalse();
  }

  @Test
  void acceptsSingleCharacter() {
    assertThat(T1.isAnagram("a", "a")).isTrue();
  }

  @Test
  void handlesMaximumLength() {
    String text = "a".repeat(50_000);

    assertThat(T1.isAnagram(text, text)).isTrue();
  }
}
