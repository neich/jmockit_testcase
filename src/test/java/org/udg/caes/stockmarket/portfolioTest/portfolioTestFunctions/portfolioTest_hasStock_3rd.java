package org.udg.caes.stockmarket.portfolioTest.portfolioTestFunctions;

import mockit.Verifications;
import org.junit.Test;
import org.udg.caes.stockmarket.portfolioTest.portfolioTestBase;

import static org.junit.Assert.assertTrue;

public class portfolioTest_hasStock_3rd extends portfolioTestBase {
  @Test
  public void TestPortfolioHasStockOk() {
    p.addStock(s1);
    p.addStock(s2);
    p.addStock(s3);

    defineExpectations();

    assertTrue("Portfolio should have stock", p.hasStock("s3"));

    new Verifications() {{
      s1.getName();
      times = 1;
      s2.getName();
      times = 1;
      s3.getName();
      times = 1;
    }};
  }
}
