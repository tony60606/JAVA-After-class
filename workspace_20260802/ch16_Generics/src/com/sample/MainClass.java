/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

/**
 *
 * @author ttoon
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Integer [] age = {12, 47, 83, 29, 65, 91, 34, 76, 58, 20} ;
        String [] name = {"Alice", "Bob", "Carol", "David", "Emma", "Frank", "Grace", "Henry", "Irene", "Jack"} ;
        Double [] num = {3.14, 8.72, 5.63, 9.41, 2.08, 7.95, 6.27, 1.56, 4.89, 0.73} ;
        
        display(age) ;
        display(name) ;
        display(num) ;
        
        System.out.println("--------------------------------------------");
        
        Book book1 = new Book("JAVA",450,6) ;
        book1.show();
        System.out.println("--------------------------------------------");
        Book book2 = new Book('C',25.8,6.4) ;
        book2.show();
        System.out.println("--------------------------------------------");
        Book book3 = new Book(123,50,3.14) ;
        book3.show();
        System.out.println("--------------------------------------------");
        Book book4 = new Book("python",600,4) ;
        book4.show(); 
        System.out.println("--------------------------------------------");
        Book<Integer> book5 = new Book() ;
        book5.add(15) ;
        System.out.println(book5.getT()*2);
        System.out.println("--------------------------------------------");
        Book book6 = new Book() ;
        book6.add("JAVA");
        System.out.println(((String)book6.getT()).toLowerCase());
        
        
        
    }

    private static <T> void display(T [] a) {
        for (T ar : a) {
            System.out.print(ar + " | ");
        } 
        System.out.println("\n -----------------");
    }
    
}



class Book <T> {
    
    private T bookname ;
    private T bookprice ;
    private T bookorder ;
    private T t ;
    
    
    public Book(){
        System.out.println("無參數建構子");
    }
    
    public Book(T bookname,T bookprice,T bookorder) {
        this.bookname = bookname ;
        this.bookprice = bookprice ;
        this.bookorder = bookorder ;
    }

    public T getBookname() {
        return bookname;
    }

    public void setBookname(T bookname) {
        this.bookname = bookname;
    }

    public T getBookprice() {
        return bookprice;
    }

    public void setBookprice(T bookprice) {
        this.bookprice = bookprice;
    }

    public T getBookorder() {
        return bookorder;
    }

    public void setBookorder(T bookorder) {
        this.bookorder = bookorder;
    }

    public T getT() {
        return t;
    }
    
    
    public void add(T t) {
        this.t = t ;
    }
    
    public void show() {
        System.out.println("bookname:" + bookname);
        System.out.println("bookprice:" + bookprice);
        System.out.println("bookorder:" + bookorder);
    }
   
    

}

