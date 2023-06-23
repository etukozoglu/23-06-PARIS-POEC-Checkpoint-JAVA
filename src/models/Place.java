package models;

import java.util.HashMap;
import java.util.Map;

public class Place {

    private String number;
    public Map<Seance, Boolean> isOccupied;

    public Place(String number) {
        this.number = number;
        this.isOccupied = new HashMap<>();
    }

    public String getNumber() {
        return number;
    }

    public void setOccupied(Seance seance, boolean occupied) {
        isOccupied.put(seance, occupied);
    }

    public boolean isOccupied(Seance seance) {
        return isOccupied.getOrDefault(seance, false);
    }

}
