package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Calculate_Ave_Test {
  @Test
  public void testCalculate_Ave() {
    Calculate_Ave calculate_ave = new Calculate_Ave();
    double expected = 2.5;
    double delta = 0.0001;
    assertEquals(expected, calculate_ave.Calc_ave(2, 3), delta);
  }
}
