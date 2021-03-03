package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class DataFactory {
    public DataFactory() {
    }
    public ObservableList<User> getUsers(){
        //Create an empty Observable list that we will fill with data
        ObservableList<User> users = FXCollections.observableArrayList();
        User user1 = new User(1,"Hannes", "hannes@postfang.is");
        User user2 = new User(2,"Andri", "andri@posturinn.is");
        User user3 = new User(3,"Katrín", "katrinR@postur.is");

        ArrayList<Book> books = getBooks(); //Get available books

        // Set up reservations for each user using the available books
        ArrayList<Reservation> reservations1 = new ArrayList<>(); //Empty reservation list to be filled
        // books.get(0) Gets the 0th entry (e.g. The Great Gatsby) and .getID() gets that books ID.
        // similar for user
        reservations1.add(new Reservation(books.get(0), user1));
        reservations1.add(new Reservation(books.get(3), user1));
        reservations1.add(new Reservation(books.get(4), user1));
        user1.setReservations(reservations1);

        // Do the same for the 2nd user
        ArrayList<Reservation> reservations2 = new ArrayList<>(); //Empty reservation list to be filled
        // books.get(0) Gets the 0th entry (e.g. The Great Gatsby) and .getID() gets that books ID.
        // similar for user
        reservations2.add(new Reservation(books.get(2), user1));
        user2.setReservations(reservations2);

        ArrayList<Reservation> reservations3 = new ArrayList<>();
        reservations3.add(new Reservation(books.get(1), user3));
        user3.setReservations(reservations3);

        // Now we have books available, reservations and users.
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return users;
    }

    public ArrayList<Book> getBooks(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("The Great Gatsby","F. Scott Fitzgerald"));
        books.add(new Book( "The Hobbit", "J.R.R. Tolkien"));
        books.add(new Book( "Why We Sleep", "Matthew Walker"));
        books.add(new Book( "Mistborn: The Final Empire", "Brandon Sanderson"));
        books.add(new Book("Mistborn: The Well of Ascension", "Brandon Sanderson"));
        return books;
    }
}
