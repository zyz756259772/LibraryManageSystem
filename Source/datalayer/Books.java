package datalayer;

import java.io.*;
import java.util.List;

public interface Books {
    List <BookInfo> books=null;
    List <BookInfo> inputBooks(InputStream books);
    void outputBooks();
}
