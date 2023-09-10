public class Order {
    private String orderType;
    private String breadType;
    private String sauceType;
    private String vegetableType;

    public Order(String orderType, String breadType, String sauceType, String vegetableType) {
        this.orderType = orderType;
        this.breadType = breadType;
        this.sauceType = sauceType;
        this.vegetableType = vegetableType;
    }

    @Override
    public String toString() {
        return "Order [orderType=" + this.orderType + ", breadType=" + this.breadType + ", sauceType=" + this.sauceType + ", vegetableType=" + this.vegetableType + "]";
    }

    public String getOrderType() {
        return this.orderType;
    }
}
