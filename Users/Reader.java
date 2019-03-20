package Users;

import Library.Lib;
import Library.Book;
public class Reader extends User {
    public Reader(int id, String name) {

        super(id, name);


    }

    @Override
    public void printRentBooks(Lib lib) {

        lib.printRentBooks(this);
    }




    public void rentBook(Lib lib,Book b){

        lib.rentBook(this,b);


    }
    @Override
    public String toString(){


        return  "System user:" + this.getUserId() + " Name: " + this.getUserName() + " Registered on: " + this.getRegDate().toString()+" Status: Reader" ;


    }
}
