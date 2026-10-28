package homework.h06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void validatesAnagram() {
    assertThat(T1.isAnagram("anagram", "nagaram")).isTrue();
    assertThat(T1.isAnagram("rat", "car")).isFalse();
  }
}
