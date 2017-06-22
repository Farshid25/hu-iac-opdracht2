package model;

public class Bewoner {
    private String naam;
    private int leeftijd;
    private String woonplaats;
    private boolean isWerkloos;

    public Bewoner(String naam, int leeftijd, String woonplaats, boolean isWerkloos) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.woonplaats = woonplaats;
        this.isWerkloos = isWerkloos;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public boolean isWerkloos() {
        return isWerkloos;
    }

    public void setWerkloos(boolean werkloos) {
        isWerkloos = werkloos;
    }
}

