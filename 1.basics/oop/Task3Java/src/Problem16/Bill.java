package Problem16;

class Bill {
    private double total;

    public void calculateTotal(Food[] foods, int count) {
        total = 0;
        for (int i = 0; i < count; i++) {
            total += foods[i].getPrice();
        }
    }

    public double getTotal() {
        return total;
    }
}