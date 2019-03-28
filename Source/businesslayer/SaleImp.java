package businesslayer;

import java.text.SimpleDateFormat;
import java.util.*;

public class SaleImp implements Sale{
    public void saleBook(String bookNumber, int counts) {
        ListIterator it = books.listIterator();
        while(it.hasNext()){ Object obj = it.next();
        if(obj.bookNumber().equals(bookNumber))
        {
            if (counts>obj.store()){
                System.out.println("库存量不足！请重新购买！");
            }else{
                /* 记录booknumber */
                BooksImp.setStore(obj.store()-counts);
                setCount(counts);
                setPriceSum(counts*obj.getPrice());
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
                setDate(df.format(new Date())) ;// new Date()为获取当前系统时间

                System.out.println("购买成功！");
            }
        }


    }


}
