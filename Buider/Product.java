class Order {
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
        return "Order [orderType=" + this.orderType + ", breadType=" + this.breadType + ", sauceType=" + this.sauceType
                + ", vegetableType=" + this.vegetableType + "]";
    }

    public String getOrderType() {
        return this.orderType;
    }

    public String getBreadType() {
        return this.breadType;
    }

    public String getSauceType() {
        return this.sauceType;
    }

    public String getVegetableType() {
        return this.vegetableType;
    }
}

class OrderBuilder {
    private String orderType;
    private String breadType;
    private String sauceType;
    private String vegetableType;

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public void setSauceType(String sauceType) {
        this.sauceType = sauceType;
    }

    public void setVegetableType(String vegetableType) {
        this.vegetableType = vegetableType;
    }

    public Order build() {
        return new Order(this.orderType, this.breadType, this.sauceType, this.vegetableType);
    }
}

class OrderFacade {
    private OrderBuilder builder;

    public OrderFacade() {
        this.builder = new OrderBuilder();
    }

    public void setOrderType(String orderType) {
        this.builder.setOrderType(orderType);
    }

    public void setBreadType(String breadType) {
        this.builder.setBreadType(breadType);
    }

    public void setSauceType(String sauceType) {
        this.builder.setSauceType(sauceType);
    }

    public void setVegetableType(String vegetableType) {
        this.builder.setVegetableType(vegetableType);
    }

    public Order buildOrder() {
        return this.builder.build();
    }
}

public class Main {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.setOrderType(OrderType.ON_SITE);
        orderFacade.setBreadType(BreadType.SIMPLE);
        orderFacade.setSauceType(SauceType.SOY_SAUCE);
        orderFacade.setVegetableType(VegetableType.SALAD);
        Order order = orderFacade.buildOrder();
        System.out.println(order);
    }
}
