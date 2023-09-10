public interface OrderBuilder {
    void orderType(String orderType);
    void orderBread(String breadType);
    void orderSauce(String sauceType);
    void orderVegetable(String vegetableType);
    Product build();
}
