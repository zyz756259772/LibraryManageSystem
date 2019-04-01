package uilayer;

import businesslayer.Sale;
import datalayer.BookInfoImp;
import datalayer.Books;
import datalayer.BooksImp;
import datalayer.SaleImp;

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
        BooksImp books = new BooksImp();
        try {
            books.inputBooks(new FileReader("/home/qibin/Documents/learnsource/Source/java/LibraryManageSystem/Source/books.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("plz enter the bookNumber:");
        bookNumber=sc.next();
        System.out.println("plz enter the number:");
        counts=sc.nextInt();
        SaleImp sale = new SaleImp();
        sale.saleBook(bookNumber,counts);
    }
}
