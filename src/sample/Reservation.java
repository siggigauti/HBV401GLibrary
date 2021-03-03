package sample;

public class Reservation {
    private Book book;
    private User user;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Reservation(Book book, User user) {
        this.book = book;
        this.user = user;
    }
}
