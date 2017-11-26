package model;

public class Book extends Product {

    public Book(Integer id, String title, Double price, Double margin) {
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
