package org.example;

public class Calculate_Ave {
  public double Calc_ave(int x, int y) {
    int sum = 0;
    int cnt = 0;

    for (int i = x; i <= y; i++) {
      sum += i;
      cnt += 1;
    }

    return (double) sum / cnt;
  }
}
