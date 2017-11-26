package software.academy.orders.entities;

public class OrderItem {

    private Integer orderId;
    private Integer productId;
    private Integer quantity;

    public OrderItem(Integer orderId, Integer productId, Integer quantity) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public Integer getOderId() {
        return orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
