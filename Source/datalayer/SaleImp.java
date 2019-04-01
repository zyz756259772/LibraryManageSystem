package datalayer;

import jdk.nashorn.internal.runtime.arrays.IteratorAction;

import java.util.Date;
import java.util.Iterator;

public class SaleImp {
    private TradeInfoList books=null;

    public TradeInfoList getBooks() {
        return books;
    }
    public void setBooks(TradeInfoList books) {
        this.books = books;
    }

    public void saleBook(String bookNumber, int counts){
        books=new TradeInfoListImp();
        Iterator <BookInfoImp> it = books.getBooks().iterator();
        while(it.hasNext())
        {
            if (bookNumber==it.next().getBookNumber()){
                if (counts<=it.next().getStore()){
                    it.next().setStore(it.next().getStore()-counts);
                    Date date= new Date();
                    TradeInfoImp Trade = new TradeInfoImp(bookNumber,counts*it.next().getPrice(),date.toString(),counts);
                    books.getTradeInfos().add(Trade);
                    System.out.println("DEAL FINISHED!");
                }else{
                    System.out.println("the store is less than your required!");
                }
            }

        }
    }
}
