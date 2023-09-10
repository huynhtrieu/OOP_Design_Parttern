public class FastFoodOrderBuilder implements OrderBuilder {
    private String orderType;
    private String breadType;
    private String sauceType;
    private String vegetableType;

    public FastFoodOrderBuilder orderType(String orderType) {
        this.orderType = orderType;
        return this;
    }

    public FastFoodOrderBuilder orderBread(String breadType) {
        this.breadType = breadType;
        return this;
    }

    public FastFoodOrderBuilder orderSauce(String sauceType) {
        this.sauceType = sauceType;
        return this;
    }

    public FastFoodOrderBuilder orderVegetable(String vegetableType) {
        this.vegetableType = vegetableType;
        return this;
    }

    public Order build() {
        return new Order(orderType, breadType, sauceType, vegetableType);
    }
}
