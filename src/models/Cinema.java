package models;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cinema {

        private String name;
        private String address;
        private List<Film> films;
        private List<Seance> seances;
        private List<Salle> salles;

        public Cinema(String name, String address) {
            this.name = name;
            this.address = address;
            this.films = new ArrayList<>();
            this.seances = new ArrayList<>();
            this.salles = new ArrayList<>();
        }

        public void addFilm(Film film) {
            films.add(film);
        }

        public void removeFilm(Film film) {
            films.remove(film);
        }

    public void addSalle(Salle salle) {
        salles.add(salle);
    }

    public void removeSalle(Salle salle) {
        salles.remove(salle);
    }

        public void scheduleSeance(Film film, Date date, Time time, Salle salle) {
            Seance seance = new Seance(film, date, time, salle);
            seances.add(seance);
        }

        public List<Seance> getAllSeancesForFilmOnDate(Film film, Date date) {
            List<Seance> result = new ArrayList<>();
            for (Seance seance : seances) {
                if (seance.getFilm().equals(film) && seance.getDate().equals(date)) {
                    result.add(seance);
                }
            }
            return result;
        }

    // Add the getFilms() method to retrieve the list of films
    public List<Film> getFilms() {
        return films;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public List<Seance> getSeances() {
        return seances;
    }

    public void setSeances(List<Seance> seances) {
        this.seances = seances;
    }

    public List<Salle> getSalles() {
        return salles;
    }

    public void setSalles(List<Salle> salles) {
        this.salles = salles;
    }
}
