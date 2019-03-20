package Users;

import Library.Lib;
import Library.Book;

public class Admin extends User {


    public Admin(int id, String name) {
        super(id, name);
    }

    @Override
    public void printRentBooks(Lib lib) {

    lib.printRentBooks(this);
    }


    public void addBook(Lib lib,Book b){


        lib.addBook(this,b);

    }

    public void deleteBook(Lib lib,Book b){

        lib.deleteBook(this,b);


    }
@Override
    public String toString(){


    return  "System user:" + this.getUserId() + " Name: " + this.getUserName() + " Registered on: " + this.getRegDate().toString()+" Status: Admin" ;


    }
}



