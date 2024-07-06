package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Calculate_Sum_Test {
  @Test
  public void testCalculate_Sum() {
    Calculate_Sum calculate_sum = new Calculate_Sum();
    int expected = 55;
    assertEquals(expected, calculate_sum.Calc_sum(1, 10));
  }
}
