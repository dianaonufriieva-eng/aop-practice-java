package homework.h08;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class T1Test {
  @Test
  void returnsThreeForExampleOne() {
    T1 solution = new T1();
    int[] nums = {1, 1, 0, 1, 1, 1};

    assertThat(solution.findMaxConsecutiveOnes(nums)).isEqualTo(3);
  }

  @Test
  void returnsTwoForExampleTwo() {
    T1 solution = new T1();
    int[] nums = {1, 0, 1, 1, 0, 1};

    assertThat(solution.findMaxConsecutiveOnes(nums)).isEqualTo(2);
  }

  @Test
  void returnsZeroForEmptyArray() {
    T1 solution = new T1();
    int[] nums = {};

    assertThat(solution.findMaxConsecutiveOnes(nums)).isEqualTo(0);
  }

  @Test
  void returnsOneForSingleOne() {
    T1 solution = new T1();
    int[] nums = {1};

    assertThat(solution.findMaxConsecutiveOnes(nums)).isEqualTo(1);
  }

  @Test
  void returnsZeroForSingleZero() {
    T1 solution = new T1();
    int[] nums = {0};

    assertThat(solution.findMaxConsecutiveOnes(nums)).isEqualTo(0);
  }

  @Test
  void returnsZeroForAllZeros() {
    T1 solution = new T1();
    int[] nums = {0, 0, 0, 0};

    assertThat(solution.findMaxConsecutiveOnes(nums)).isEqualTo(0);
  }

  @Test
  void returnsLengthForMaxLengthAllOnes() {
    T1 solution = new T1();
    int[] nums = new int[100_000];
    Arrays.fill(nums, 1);

    assertThat(solution.findMaxConsecutiveOnes(nums)).isEqualTo(100_000);
  }
}
