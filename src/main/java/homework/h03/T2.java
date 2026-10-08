package homework.h03;

public class T2 {
    public int differenceOfSums(int n, int m) {
        int num1 = 0; // Сума чисел, що НЕ діляться на m
        int num2 = 0; // Сума чисел, що діляться на m

        for (int i = 1; i <= n; i++) {
            if (i % m != 0) {
                num1 += i;
            } else {
                num2 += i;
            }
        }

        return num1 - num2;
    }
}
