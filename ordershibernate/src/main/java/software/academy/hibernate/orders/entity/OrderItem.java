package software.academy.hibernate.orders.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="order_item")
public class OrderItem implements Serializable{

    @Id
    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order;

    @Id
    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;

    private Integer quantity;  //hibernate powinien złapać nawet bez name po nazwie(mozemy dodac table name, ale nie trzeba"
    //mozna dodac transient, to nie wezmie wtedy


    public OrderItem(Order order, Product product, Integer quantity) {
        this.order = order;
        this.product = product;
        this.quantity = quantity;
    }

    public OrderItem() {}

    public Order getOrder() {
        return order;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }
}


