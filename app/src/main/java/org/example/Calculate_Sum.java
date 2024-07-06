package org.example;

public class Calculate_Sum {
  public int Calc_sum(int x, int y) {
    int sum = 0;

    for (int i = x; i <= y; i++) {
      sum += i;
    }

    return sum;
  }
}
