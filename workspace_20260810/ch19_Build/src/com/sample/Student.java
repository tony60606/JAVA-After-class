/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author ttoon
 */
public class Student {
    
    
    private char num ;
    private String name ;
    private String classnum ;
    private int age ;
    private String city ;
    
    public static class Build {
        private char num = ' ';
        private String name = " ";
        private String classnum = " ";
        private int age = 0 ;
        private String city = "台北";
        
        public Student.Build Num(char num) {
            this.num = num ;
            return this ;
        }
        
        public Student.Build Name(String name) {
            this.name = name ;
            return this ;
        }
        
        public Student.Build Classnum(String classnum) {
            this.classnum = classnum ;
            return this ;
        }
        
        public Student.Build Age(int age) {
            this.age = age ;
            return this ;
        }
        
        public Student.Build City(String city) {
            this.city = city ;
            return this ;
        }
        
        public Student get() {
            return new Student(this) ;
        }
    }
    
    private Student (Build build) {
        this.num = build.num ;
        this.name = build.name ;
        this.classnum = build.classnum ;
        this.age = build.age ;
        this.city = build.city ;
    }

    public char getNum() {
        return num;
    }

    public void setNum(char num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassnum() {
        return classnum;
    }

    public void setClassnum(String classnum) {
        this.classnum = classnum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return  "學生學號　: " + num + "\t學生姓名 : " + name + "\t班級 : " + classnum + "\t學生年齡 : " + age + "\t城市 : " + city ;
    }
    
    
   
}
