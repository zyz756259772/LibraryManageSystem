package datalayer;

public class TradeInfoImp {
    private String bookNumber=null;
    private double priceSum=0;
    private String Date=null;
    private int Count=0;

    public TradeInfoImp(String bookNumber, double priceSum, String date, int count) {
        this.bookNumber = bookNumber;
        this.priceSum = priceSum;
        Date = date;
        Count = count;
    }

    public double getPriceSum() {
        return priceSum;
    }

    public void setPriceSum(int priceSum) {
        this.priceSum = priceSum;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

}
