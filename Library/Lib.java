package Library;

import Users.Admin;
import Users.Reader;
import Users.SortUser;
import Users.User;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;

public class Lib {

    private HashMap<Book, HashSet<User>> bookMap;
    private HashMap<User, HashSet<Book>> userMap;

    public Lib() {
        bookMap = new HashMap<>();
        userMap = new HashMap<>();
    }

    //rentBook method comes here
    public void rentBook(User u, Book b) {
        try {
            if (bookMap.containsKey(b)) {
                int numb = b.getUnits();
                int exp = 1 / numb;


                b.setUnits(b.getUnits() - 1);

                HashSet<Book> a = userMap.get(u);
                HashSet<User> c=bookMap.get(b);
                c.add(u);

                a.add(b);
            } else {
                throw new IllegalArgumentException();
            }


        } catch (ArithmeticException e) {

            System.out.print("this is not avaiable");


        }

    }

    //printRentBooks method 1 comes here
    public void printRentBooks(Admin u) {

        Book[] a = bookMap.keySet().toArray(new Book[0]);


        for (Book total : a) {
            HashSet<User> b = bookMap.get(total);

            System.out.println(total.getBookName()+" " + bookMap.get(total).toString());


        }


    }


    //printRentBooks method 2 comes here

    public void printRentBooks(Reader r) {

        HashSet<Book> a = userMap.get(r);

        for (Book k : a) {

            System.out.println("BookName: " +k.getBookName()+Arrays.toString(k.getAuthors()));
        }

    }


    public void addBook(User u, Book b) {
        if (bookMap.containsKey(b)) {
            b.setUnits(b.getUnits() + 1);

        } else
            bookMap.put(b, new HashSet<User>());
    }


    public void addUser(User u) {
        if (!userMap.containsKey(u)) {
            userMap.put(u, new HashSet<Book>());
        } else
            throw new IllegalArgumentException("User already exists");
    }


    public void deleteBook(User u, Book b) {
        if (bookMap.containsKey(b)) {
            bookMap.remove(b);
        } else
            throw new IllegalArgumentException("No such book in the system");
    }


    //method printAllUsers comes here
    public void printAllUsers() {

        User[] a = userMap.keySet().toArray(new User[0]);

        for(int x=0; x< a.length;x++){


            for(int y=x+1;y<a.length;y++){
                SortUser l=new SortUser();
                int res=l.compare(a[x],a[y]);

                if(res>0){

                    User temp=a[y];
                    a[y]=a[x];
                    a[x]=temp;


                }


            }




        }




        for (User total : a) {

           System.out.println(total.toString());

        }

    }


    //method printAllBooks comes here

    public void printAllBooks() {

        Book[] a = bookMap.keySet().toArray(new Book[0]);

        for(int x=0; x< a.length;x++){


            for(int y=x+1;y<a.length;y++){

                int res=a[x].compareTo(a[y]);

                if(res>0){

                    Book temp=a[y];
                    a[y]=a[x];
                    a[x]=temp;


                }


            }
        }




        for (Book total : a) {

         System.out.println(total.toString());

        }

    }




}


















