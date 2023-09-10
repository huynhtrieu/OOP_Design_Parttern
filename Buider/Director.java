public class Main {
    public static void main(String[] args) {
        FastFoodOrderBuilder orderBuilder = new FastFoodOrderBuilder();
        Order order = orderBuilder
            .orderType(OrderType.ON_SITE)
            .orderBread(BreadType.OMELETTE)
            .orderSauce(SauceType.SOY_SAUCE)
            .build();

        System.out.println(order);
    }
}
