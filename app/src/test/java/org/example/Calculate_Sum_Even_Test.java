package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Calculate_Sum_Even_Test {
  @Test
  public void testCalculate_Sum_Even() {
    Calculate_Sum_Even calculate_sum_even = new Calculate_Sum_Even();
    int expected = 30;
    assertEquals(expected, calculate_sum_even.Calc_sum_even(1, 10));
  }
}
