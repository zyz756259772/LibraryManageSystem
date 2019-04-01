package datalayer;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class BooksImp implements Books{
    private ArrayList<BookInfo> books=null;

    public ArrayList <BookInfo> getBooks() {
        return books;
    }

    public ArrayList <BookInfo> inputBooks(FileReader books){
        BufferedReader booksBuff=new BufferedReader(books);
        this.books=new ArrayList<BookInfo>();
        try {
            String str;
            while ((str=booksBuff.readLine()) != null) {
                String [] info=str.split(",");
                BookInfoImp book=new BookInfoImp();
                book.setBookNumber(info[0]);
                book.setName(info[1]);
                book.setPublisher(info[2]);
                book.setPrice(Double.parseDouble(info[3]));
                book.setStore(Integer.parseInt(info[4]));
                this.books.add(book);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return this.books;
    }

    public void outputBooks(){

    }

}


