package datalayer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
public class TradeInfoListImp implements TradeInfoList {
        private ArrayList<Books> books=null;
        private ArrayList<TradeInfo> tradeInfos=null;

        public ArrayList<TradeInfo> getTradeInfos() {
            return tradeInfos;
        }

        public void setTradeInfos(ArrayList<TradeInfo> tradeInfos) {
            this.tradeInfos = tradeInfos;
        }


    public ArrayList<Books> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Books> books) {
        this.books = books;
    }

    public void outputTradeInfo(){

    }

}
