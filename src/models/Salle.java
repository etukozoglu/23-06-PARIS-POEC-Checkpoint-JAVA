package models;

import java.util.ArrayList;
import java.util.List;

public class Salle {

    private int capacity;
    private List<String> placeList;

    //constructor
    public Salle(int capacity, List<String> placeList) {
        this.capacity = capacity;
        this.placeList = new ArrayList<>();
        generatePlaces();
    }

    private void generatePlaces() {
        for (int i = 1; i <= capacity; i++) {
            placeList.add(String.valueOf(i));
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public List<String> getPlaces() {
        return placeList;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setPlaces(List<String> places) {
        this.placeList = placeList;
    }
}
