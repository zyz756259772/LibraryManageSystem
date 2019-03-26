package datalayer;

import java.util.List;

public class TradeInfoListImp {
    private List<Books> books=null;
    private List<TradeInfo> tradeInfos=null;

    public List<TradeInfo> getTradeInfos() {
        return tradeInfos;
    }

    public void setTradeInfos(List<TradeInfo> tradeInfos) {
        this.tradeInfos = tradeInfos;
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }

    void outputTradeInfo(){

    }

}
