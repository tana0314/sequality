package org.example;

public class Calculate_Sum_Odd {
  public int Calc_sum_odd(int x, int y) {
    int sum = 0;

    for (int i = x; i <= y; i++) {
      if (i % 2 == 1)
        sum += i;
    }

    return sum;
  }
}
