package uilayer;

import businesslayer.Sale;
import datalayer.*;

import java.awt.print.Book;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagerImp {
    private List<Books> books=null;

    public static void  main(String[] args){
        String bookNumber;
        int counts;
        int keep=0;
        BooksImp books = new BooksImp();
        TradeInfoListImp trade = new TradeInfoListImp();
        try {
            books.inputBooks(new FileReader("C:\\Users\\zyz\\Documents\\GitHub\\LibraryManageSystem\\Source\\books.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("plz enter the bookNumber:");
            bookNumber=sc.next();
            System.out.println("plz enter the number:");
            counts=sc.nextInt();
            SaleImp sale = new SaleImp();
            sale.saleBook(bookNumber,counts);
            System.out.println("prees 1 to buy more.");
            keep=sc.nextInt();
            if (keep==1){
                if(books.writeFile(books.getBooks())){
                    System.out.println("写入books文件成功");
                }else{
                    System.out.println("写入books文件失败");
                };//输出到books文件
                if(books.writeFile(trade.getTradeInfos())){
                    System.out.println("写入trade文件成功");
                }else{
                    System.out.println("写入trade文件失败");
                }//输出到trade文件
                break;
            }
        }

    }
}
