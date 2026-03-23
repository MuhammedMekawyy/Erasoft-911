package Problem16;

class Restaurant {

    private String name;
    private Order[] orders = new Order[50];
    private int count = 0;

    public Restaurant(String name) {
        this.name = name;
    }

    public void addOrder(Order order) {
        orders[count++] = order;
    }

    public void showAllOrders() {
        System.out.println("Restaurant: " + name);

        for (int i = 0; i < count; i++) {
            orders[i].showOrder();
        }
    }
}