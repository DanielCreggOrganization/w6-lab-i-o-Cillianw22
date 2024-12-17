package ie.atu.iolab;

import java.io.Serializable;

public class Game implements Serializable {
    private String title;
    private String genre;
    private String developer;
    private double price;
    private double rating;

    public Game(String title, String genre, String developer, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.developer = developer;
        this.price = price;
        this.rating = rating;

    }
    //getters + setters

    public String getTitle() { return title; }
    public void setTtitle(String title) {this.title = title;}

    public String getGenre() {return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public String getDeveloper() {return developer; }
    public void setDeveloper(String developer) {this.developer = developer;}

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price;}

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating;}

    @Override
    public String toString(){
        return String.format("Game [Title=%s, Genre=%s, Developer=%s, Price=%.2f, Rating=%.1f]",
                title, genre, developer, price, rating);


    }
}
