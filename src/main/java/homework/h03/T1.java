package homework.h03;

// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/

public class T1 {
  public static double average(int[] salary) {
    int minimumSalary = salary[0];
    int maximumSalary = salary[0];
    int totalSalary = 0;

    for (int salaryValue : salary) {
      if (salaryValue < minimumSalary) {
        minimumSalary = salaryValue;
      }
      if (salaryValue > maximumSalary) {
        maximumSalary = salaryValue;
      }
      totalSalary += salaryValue;
    }

    return (double) (totalSalary - minimumSalary - maximumSalary) / (salary.length - 2);
  }
}
