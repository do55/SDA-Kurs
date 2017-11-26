package model;

public class Music extends Product {

    public Music(Integer id, String title, Double price, Double margin) {
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