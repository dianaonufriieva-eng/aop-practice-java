package homework.h09;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

public class T2Test {

  private final T2 solution = new T2();

  @Test
  void returnsExpectedResultForExampleOne() {
    List<Boolean> actual = solution.kidsWithCandies(new int[] {2, 3, 5, 1, 3}, 3);

    assertThat(actual).containsExactly(true, true, true, false, true);
  }

  @Test
  void returnsExpectedResultForExampleTwo() {
    List<Boolean> actual = solution.kidsWithCandies(new int[] {4, 2, 1, 1, 2}, 1);

    assertThat(actual).containsExactly(true, false, false, false, false);
  }

  @Test
  void returnsExpectedResultForExampleThree() {
    List<Boolean> actual = solution.kidsWithCandies(new int[] {12, 1, 12}, 10);

    assertThat(actual).containsExactly(true, false, true);
  }

  @Test
  void handlesMinimumLengthAndMinimumValues() {
    List<Boolean> actual = solution.kidsWithCandies(new int[] {1, 1}, 1);

    assertThat(actual).containsExactly(true, true);
  }

  @Test
  void handlesMaximumCandyAndExtraCandiesValues() {
    List<Boolean> actual = solution.kidsWithCandies(new int[] {50, 100, 49}, 50);

    assertThat(actual).containsExactly(true, true, false);
  }

  @Test
  void handlesMaximumArrayLength() {
    int[] candies = new int[100];
    Boolean[] expected = new Boolean[100];
    for (int i = 0; i < 99; i++) {
      candies[i] = 1;
      expected[i] = false;
    }
    candies[99] = 100;
    expected[99] = true;

    List<Boolean> actual = solution.kidsWithCandies(candies, 1);

    assertThat(actual).containsExactly(expected);
  }
}
