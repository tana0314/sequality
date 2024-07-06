package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Calculate_Sum_Odd_Test {
  @Test
  public void testCalculate_Sum_Odd() {
    Calculate_Sum_Odd calculate_sum_odd = new Calculate_Sum_Odd();
    int expected = 15;
    assertEquals(expected, calculate_sum_odd.Calc_sum_odd(1, 10));
  }
}
