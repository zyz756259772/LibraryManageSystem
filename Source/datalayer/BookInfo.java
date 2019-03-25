package datalayer;

public interface BookInfo {
    String bookNumber = null;
    String Name=null;
    String publisher=null;
    double price=0;
    int store=0;
}

class BookInfoimp implements BookInfo{
    private String bookNumber = null;
    private String Name=null;
    private String publisher=null;
    private double price=0;
    private int store=0;

    public BookInfoimp(String bookNumber, String name, String publisher, double price, int store) {
        this.bookNumber = bookNumber;
        Name = name;
        this.publisher = publisher;
        this.price = price;
        this.store = store;
    }

    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStore() {
        return store;
    }

    public void setStore(int store) {
        this.store = store;
    }
}

