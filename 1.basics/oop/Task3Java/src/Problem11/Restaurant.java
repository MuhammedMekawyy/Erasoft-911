package Problem11;

abstract class Restaurant {

    protected String[] orders = new String[100];
    protected int count = 0;

    public void addOrder(String order) {
        orders[count++] = order;
    }
    public abstract void showOrders();
}