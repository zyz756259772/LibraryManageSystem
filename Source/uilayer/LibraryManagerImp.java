package uilayer;

import businesslayer.Sale;
import datalayer.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class LibraryManagerImp {
    private List<Books> books=null;
    void prinfBooksInfo(){

    }

    public static void main(String[] args){
        String bookNumber;
        int counts;
        int keep=0;
        BooksImp books = new BooksImp();
        try {
            books.inputBooks(new FileReader("/home/qibin/Documents/learnsource/Source/java/LibraryManageSystem/Source/books.csv"));
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
                //输出到trade文件
                break;
            }
        }

    }
}
