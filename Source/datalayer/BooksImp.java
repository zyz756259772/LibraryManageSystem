package datalayer;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class BooksImp implements Books{
    private List<BookInfo> books=null;

    public List<BookInfo> getBooks() {
        return books;
    }

    public void setBooks(List<BookInfo> books) {
        this.books = books;
    }

    public List <BookInfo> inputBooks(FileReader books){
        BufferedReader booksBuff=new BufferedReader(books);
        try {
            String str;
            while ((str=booksBuff.readLine()) != null) {
                String [] info=str.split(",");
                BookInfoImp book=new BookInfoImp();
                book.setBookNumber(info[0]);
                book.setName(info[1]);
                book.setPrice(Double.parseDouble(info[2]));
                book.setPublisher(info[3]);
                book.setStore(Integer.parseInt(info[4]));
                books=new ArrayList<BookInfo>();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void outputBooks(){

    }

}


