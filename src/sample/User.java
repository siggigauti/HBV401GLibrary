package sample;

import java.util.ArrayList;

public class User {
    private int kennitala;
    private String name;
    private String email;
    private ArrayList<Reservation> reservations;

    @Override
    public String toString() {
        return name;
    }

    public User(int kennitala, String name, String email) {
        this.kennitala = kennitala;
        this.name = name;
        this.email = email;
        this.reservations = new ArrayList<>();
    }

    public int getKennitala() {
        return kennitala;
    }

    public void setKennitala(int kennitala) {
        this.kennitala = kennitala;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }
}
