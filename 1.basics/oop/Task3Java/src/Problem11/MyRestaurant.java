package Problem11;

class MyRestaurant extends Restaurant {

    @Override
    public void showOrders() {
        if (count == 0) {
            System.out.println("No orders yet");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "- " + orders[i]);
        }
    }
}
