package datalayer;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class BooksImp implements Books{
    private List<BookInfo> books=null;

    public List<BookInfo> getBooks() {
        return books;
    }

    public void setBooks(List<BookInfo> books) {
        this.books = books;
    }

    public List <BookInfo> inputBooks(InputStream books){

    }

    public void outputBooks(){

    }
}


