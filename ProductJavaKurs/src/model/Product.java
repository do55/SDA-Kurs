package model;

public abstract class Product {

    private Integer id;
    private String title;
    private Double price;
    private Double margin;




    public Product(Integer id, String title, Double price, Double margin) {
        super();
        this.id = id;
        this.title = title;
        this.price = price;
        this.margin = margin;
    }


    public String getTitle() {
        return title;
    }


    public Double getPrice() {
        return price;
    }


    public Double getMargin() {
        return margin;
    }


    public Integer getId() {
        return id;
    }






}
