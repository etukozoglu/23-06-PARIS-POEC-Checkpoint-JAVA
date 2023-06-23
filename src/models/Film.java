package models;

import java.util.Date;

public class Film {

        private String name;
        private String synopsis;
        private Date releaseDate;

        public Film(String name, String synopsis, Date releaseDate) {
            this.name = name;
            this.synopsis = synopsis;
            this.releaseDate = releaseDate;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}

