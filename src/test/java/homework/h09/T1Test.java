package homework.h09;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {

  private final T1 solution = new T1();

  @Test
  void returnsFourForExampleOne() {
    assertThat(solution.numIdenticalPairs(new int[] {1, 2, 3, 1, 1, 3})).isEqualTo(4);
  }

  @Test
  void returnsSixForExampleTwo() {
    assertThat(solution.numIdenticalPairs(new int[] {1, 1, 1, 1})).isEqualTo(6);
  }

  @Test
  void returnsZeroForExampleThree() {
    assertThat(solution.numIdenticalPairs(new int[] {1, 2, 3})).isZero();
  }

  @Test
  void returnsZeroForSingleElement() {
    assertThat(solution.numIdenticalPairs(new int[] {1})).isZero();
  }

  @Test
  void returnsZeroForEmptyArray() {
    assertThat(solution.numIdenticalPairs(new int[] {})).isZero();
  }

  @Test
  void countsPairsForMaximumElementValue() {
    assertThat(solution.numIdenticalPairs(new int[] {100, 100})).isEqualTo(1);
  }

  @Test
  void countsPairsForMaximumArrayLength() {
    int[] nums = new int[100];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = 1;
    }

    assertThat(solution.numIdenticalPairs(nums)).isEqualTo(4950);
  }
}
