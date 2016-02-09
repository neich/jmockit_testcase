package org.udg.caes.stockmarket.portfolioTest;

import mockit.Injectable;
import mockit.NonStrictExpectations;
import org.junit.Before;
import org.udg.caes.stockmarket.Portfolio;
import org.udg.caes.stockmarket.Stock;

public class portfolioTestBase {
  protected Portfolio p;

  @Injectable
  protected Stock s1, s2, s3;

  @Before
  public void setup() {
    p = new Portfolio("p1");
  }

  protected void defineExpectations() {
    new NonStrictExpectations() {{
      s1.getName();
      result = "s1";
      s2.getName();
      result = "s2";
      s3.getName();
      result = "s3";
    }};
  }
}