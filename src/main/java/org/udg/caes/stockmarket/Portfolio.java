package org.udg.caes.stockmarket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Portfolio implements Iterable<Stock> {
  private String mId;
  private List<Stock> mStocks = new ArrayList<Stock>();

  public Portfolio(String id) {
    mId = id;
  }

  public Iterator<Stock> iterator() {
    Iterator<Stock> iprof = mStocks.iterator();
    return iprof;
  }

  public void addStock(Stock stock) {
    mStocks.add(stock);
  }

  public Boolean hasStock(String ticker) {
    for (Stock s: mStocks)
      if (s.getName().equals(ticker))
        return true;
    return false;
  }
}
