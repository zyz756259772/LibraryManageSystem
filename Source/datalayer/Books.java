package datalayer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public interface Books {
    ArrayList <BookInfo> books=null;
    ArrayList<BookInfo> inputBooks(FileReader books);
    void outputBooks();
}

