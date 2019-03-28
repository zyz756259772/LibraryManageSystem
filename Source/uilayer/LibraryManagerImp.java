package uilayer;

import businesslayer.Sale;
import datalayer.Books;
import datalayer.SaleImp;

import java.util.Scanner;
import java.util.List;

public class LibraryManagerImp {
    private List<Books> books=null;
    void prinfBooksInfo(){

    }

    public static void main(String[] args){
         String bookNumber;
         int counts;
         System.out.println("欢迎使用某不知名的图书管理系统");
         prinfBooksInfo();
         System.out.println("============================");
         Scanner sc =new Scanner(System.in);
         System.out.println("请输入所要购买的图书编号：");
         bookNumber=sc.next();
         System.out.println("请输入购买数量：");
         counts=sc.nextInt();
         businesslayer.SaleImp.saleBook(bookNumber,counts);



    }
}
