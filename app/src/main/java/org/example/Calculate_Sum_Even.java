package org.example;

public class Calculate_Sum_Even {
  public int Calc_sum_even(int x, int y) {
    int sum = 0;

    for (int i = x; i <= y; i++) {
      if (i % 2 == 0)
        sum += i;
    }

    return sum;
  }
}
