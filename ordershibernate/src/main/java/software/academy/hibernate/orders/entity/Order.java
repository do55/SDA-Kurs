package software.academy.hibernate.orders.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="[order]")
public class Order implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;

    @Column(name="insert_date")
    private Date insertDate;

    @Column(name="update_date")
    private Date updateDate;

    @Column(name="status")
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @Column(name="total_cost")
    private BigDecimal totalCost;

    @OneToMany (mappedBy = "order", cascade = CascadeType.ALL) //cascade = CascadeType.REMOVE) //mapped by jest wlascicielem relacji, trzeba wskazać, gdy relacja jest dwukierunkowa
    private List<OrderItem> orderItems = new ArrayList<OrderItem>(); //cascade mowi, ze jezeli usune zamowienie to i usune pozycje zamowienia



    public Order() {}

    public Order(Client client, Date insertDate, Date updateDate, OrderStatus status, BigDecimal totalCost) {
        this.client = client;
        this.insertDate = insertDate;
        this.updateDate = updateDate;
        this.status = status;
        this.totalCost = totalCost;


    }

    public Integer getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void addItem (Product product, Integer quantity) {
        OrderItem orderItem = new OrderItem(this, product, quantity);
        orderItems.add(orderItem);
    }
}
