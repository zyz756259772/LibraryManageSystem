package datalayer;

import java.io.*;
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

    public boolean writeFile(ArrayList books) {
        String filename = "C:/Users/Administrator/Desktop/books.csv";
        try {
            File f = new File(filename);
            if (!f.exists()) {
                f.createNewFile();
            }
            OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f));
            BufferedWriter writer = new BufferedWriter(write);
            do{
                writer.write(books.iterator().toString());
                writer.flush();
            }while(books.iterator().hasNext());
            write.close();
            writer.close();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

}


