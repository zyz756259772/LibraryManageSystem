package datalayer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
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

    public boolean writeFile(ArrayList trades) {
        String filename = "C:/Users/Administrator/Desktop/trade.csv";
        try {
            File f = new File(filename);
            if (!f.exists()) {
                f.createNewFile();
            }
            OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f));
            BufferedWriter writer = new BufferedWriter(write);
            do{
                writer.write(trades.iterator().toString());
                writer.flush();
            }while(trades.iterator().hasNext());
            write.close();
            writer.close();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }


}
