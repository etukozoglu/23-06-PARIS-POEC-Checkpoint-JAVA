package models;

import java.util.ArrayList;
import java.util.List;

public class Client {

        private String name;
        private String email;
        private List<Reservation> reservations;

        public Client(String name, String email) {
            this.name = name;
            this.email = email;
            this.reservations = new ArrayList<>();
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

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Reservation reserve(Seance seance, Salle salle, String place) {
        if (seance.isFull()) {
            System.out.println("La séance est complète. Impossible de faire la réservation.");
            return null;
        }

        Reservation reservation = new Reservation (seance, salle, place);
        reservations.add(reservation);
        seance.addReservation(reservation);
        return reservation;
    }
}
