package businesslayer;

import datalayer.TradeInfoList;

public interface Sale {
    TradeInfoList books=null;
    void saleBook(String bookNumber,int counts);
}
