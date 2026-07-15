/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.chrono.JapaneseDate;
import java.time.chrono.MinguoDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

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
        //Date date1 = Date.from(Instant.MIN) ;
        //System.out.println(date1);
        LocalDate date2 = LocalDate.now() ;
        System.out.println(date2);
        LocalDate date3 = LocalDate.of(1996, 4, 17);
        System.out.println(date3);
        LocalDate date4 = LocalDate.of(2005, Month.JANUARY, 31);
        System.out.println(date4);
        LocalDate date5 = LocalDate.parse("2027-02-28");
        System.out.println(date5);
        LocalTime time1 = LocalTime.now();
        System.out.println(time1);
        LocalTime time2 = LocalTime.of(20, 15, 33) ;
        System.out.println(time2);
        LocalTime time3 = LocalTime.parse("15:35:55") ;
        System.out.println(time3);
        LocalDateTime datetime1 = LocalDateTime.now() ;
        System.out.println(datetime1);
        LocalDateTime datetime2 = LocalDateTime.of(1987, Month.FEBRUARY, 18, 15, 44, 36) ;
        System.out.println(datetime2);
        System.out.println("年：" + date2.getYear());
        System.out.println("月(英文)：" + date2.getMonth());
        System.out.println("月：" + date2.getMonthValue());
        System.out.println("日：" + date2.getDayOfMonth());
        System.out.println("星期："  + date2.getDayOfWeek());
        System.out.println("一年中的第：" + date2.getDayOfYear() + "天");
        System.out.println("時：" + datetime2.getHour());
        System.out.println("分：" + datetime2.getMinute());
        System.out.println("秒：" + datetime2.getSecond());
        System.out.println("奈秒：" + datetime2.getNano());
        System.out.println(date4.format(DateTimeFormatter.ISO_DATE));
        System.out.println(time1.format(DateTimeFormatter.ISO_TIME));
        System.out.println(date2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(datetime2.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
        System.out.println(time3.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
        MinguoDate date6 = MinguoDate.now();
        JapaneseDate date7 = JapaneseDate.now();
        System.out.println(date6);
        System.out.println(date7);
        
        System.out.println(date3.plusYears(2));
        System.out.println(date2.plusMonths(6).plusWeeks(4).plusDays(20));
        
        System.out.printf("%s年是否為閏年：%b %n",date3.getYear(),date3.isLeapYear());
    }
    
}
