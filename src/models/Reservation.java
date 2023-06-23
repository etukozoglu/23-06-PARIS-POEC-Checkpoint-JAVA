package models;

public class Reservation {

    private Client client;
    private Seance seance;
    private Salle salle;
    private Place number;

    public Reservation(Client client, Seance seance, Salle salle, Place number) {
        this.client = client;
        this.seance = seance;
        this.salle = salle;
        this.number = number;
    }

    public Reservation(Seance seance, Salle salle, String place) {
    }

    public Reservation reserve(Seance seance, Salle salle, Place number) {
        if (seance.isFull()) {
            System.out.println("La séance est complète. Impossible de faire la réservation.");
            return null;
        }

        Reservation reservation = new Reservation(client, seance, salle, number);
        seance.addReservation(reservation);
        return reservation;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Seance getSeance() {
        return seance;
    }

    public void setSeance(Seance seance) {
        this.seance = seance;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }
}
