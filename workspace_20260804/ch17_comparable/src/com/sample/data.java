/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author ttoon
 */
public class data implements Comparable<data> {
    
    private String bookname ;
    private char bookmark ;
    private int bookprice ;
    
    public data(String bookname,char bookmark,int bookprice) {
        this.bookname = bookname ;
        this.bookmark = bookmark ;
        this.bookprice = bookprice ;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public char getBookmark() {
        return bookmark;
    }

    public void setBookmark(char bookmark) {
        this.bookmark = bookmark;
    }

    public int getBookprice() {
        return bookprice;
    }

    public void setBookprice(int bookprice) {
        this.bookprice = bookprice;
    }

    @Override
    public String toString() {
        return  "bookname : " + bookname + ", bookmark : " + bookmark + ", bookprice : " + bookprice ;
    }

    @Override
    public int compareTo(data o) {
//        if (this.bookprice > o.bookprice) {
//            return 1 ;
//        } else if (this.bookprice == o.bookprice) {
//            return 0 ;
//        } else {
//            return -1 ;
//        }
        
        return this.bookname.compareTo(o.getBookname()) ;
        
        
    }

    
    
    
    
    
}
