package homework.h03;

public class T1 {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        int sum = 0;

        for (int s : salary) {
            if (s < min) {
                min = s;
            }
            if (s > max) {
                max = s;
            }
            sum += s;
        }

        return (double) (sum - min - max) / (salary.length - 2);
    }
}
