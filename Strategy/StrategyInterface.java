public interface OrderBuilder {
    void orderType(String orderType);
    void orderBread(String breadType);
    void orderSauce(String sauceType);
    void orderVegetable(String vegetableType);
    Product build();
}

public class Order implements OrderBuilder {
    private String orderType;
    private String breadType;
    private String sauceType;
    private String vegetableType;

    @Override
    public void orderType(String orderType) {
        this.orderType = orderType;
    }

    @Override
    public void orderBread(String breadType) {
        this.breadType = breadType;
    }

    @Override
    public void orderSauce(String sauceType) {
        this.sauceType = sauceType;
    }

    @Override
    public void orderVegetable(String vegetableType) {
        this.vegetableType = vegetableType;
    }

    @Override
    public Product build() {
        return new Product(orderType, breadType, sauceType, vegetableType);
    }
}

public class Product {
    private String orderType;
    private String breadType;
    private String sauceType;
    private String vegetableType;

    public Product(String orderType, String breadType, String sauceType, String vegetableType) {
        this.orderType = orderType;
        this.breadType = breadType;
        this.sauceType = sauceType;
        this.vegetableType = vegetableType;
    }

    // Các getter và setter cho các thuộc tính

    // Các phương thức khác của Product
}

// Sử dụng
OrderBuilder orderBuilder = new Order();
orderBuilder.orderType("type");
orderBuilder.orderBread("bread");
orderBuilder.orderSauce("sauce");
orderBuilder.orderVegetable("vegetable");

Product product = orderBuilder.build();
