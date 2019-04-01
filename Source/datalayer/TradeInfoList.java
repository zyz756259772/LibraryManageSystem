package datalayer;

import java.util.ArrayList;
import java.util.List;

public interface TradeInfoList{
    ArrayList<TradeInfo> tradeInfos=null;
    ArrayList <Books> books=null;
    ArrayList getTradeInfos();
    ArrayList getBooks();
    void outputTradeInfo();
}

