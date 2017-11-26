package model;

public class Game extends Product {

    public Game(Integer id, String title, Double price, Double margin) {
        super(id, title, price, margin);

    }
    @Override
    public String toString() {
        return "ID: " + this.getId()
                + ", title: " + this.getTitle()
                + ", price: " + this.getPrice()
                + ", margin: " + this.getMargin();
    }
}