package com.java.collections;

import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;

class Book  {

    //Example on javatpoint regarding BOOK
       int id;
       String name,author,publisher;
       int quantity;
       public Book (int id, String name, String author, String publisher, int quantity) {
           this.id = id;
           this.name = name;
           this.author = author;
           this.publisher = publisher;
           this.quantity = quantity;

       }
}

public class ArrayListExample {
    public static void main(String[] args) {
        //Creating list of books
        List<Book> list = new ArrayList<Book>();
        //Creating books
        Book b1 = new Book(101, "Let ud C", "Yashwant Kanetkar","BPB",8);
        Book b2 = new Book(102,"Data Communication an Networking", "Forouzan", "Mcraw Hill", 4);
        Book b3 = new Book(103, "Operating System", "Galvain", "Wiley",6);

        //Adding books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        System.out.println("The size of array is: "+ list.size());
        //Traversing list
        for (Book b:list)
        {
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
