package homework.h08;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

public class T2Test {
  @Test
  void returnsThreeForExampleOne() {
    T2 solution = new T2();
    List<Integer> nums = List.of(-1, 1, 2, 3, 1);

    assertThat(solution.countPairs(nums, 2)).isEqualTo(3);
  }

  @Test
  void returnsTenForExampleTwo() {
    T2 solution = new T2();
    List<Integer> nums = List.of(-6, 2, 5, -2, -7, -1, 3);

    assertThat(solution.countPairs(nums, -2)).isEqualTo(10);
  }

  @Test
  void returnsZeroForEmptyList() {
    T2 solution = new T2();
    List<Integer> nums = List.of();

    assertThat(solution.countPairs(nums, 0)).isEqualTo(0);
  }

  @Test
  void returnsZeroForSingleElement() {
    T2 solution = new T2();
    List<Integer> nums = List.of(5);

    assertThat(solution.countPairs(nums, 10)).isEqualTo(0);
  }

  @Test
  void returnsZeroWhenSumEqualsTarget() {
    T2 solution = new T2();
    List<Integer> nums = List.of(1, 1);

    assertThat(solution.countPairs(nums, 2)).isEqualTo(0);
  }

  @Test
  void returnsOneForMinimumBoundaryValues() {
    T2 solution = new T2();
    List<Integer> nums = List.of(-50, -50);

    assertThat(solution.countPairs(nums, -50)).isEqualTo(1);
  }

  @Test
  void returnsZeroForMaximumBoundaryValues() {
    T2 solution = new T2();
    List<Integer> nums = List.of(50, 50);

    assertThat(solution.countPairs(nums, 50)).isEqualTo(0);
  }

  @Test
  void countsAllPairsForMaxLengthList() {
    T2 solution = new T2();
    List<Integer> nums = Collections.nCopies(50, -50);

    assertThat(solution.countPairs(nums, 50)).isEqualTo(1225);
  }
}
