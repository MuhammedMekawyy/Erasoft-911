package Problem16;

class Order {

    private Person person;
    private Food[] foods = new Food[50];
    private int count = 0;
    private Bill bill;
    private Gift gift;

    public Order(Person person) {
        this.person = person;
        this.bill = new Bill();
    }

    public void addFood(Food food) {
        foods[count++] = food;
    }

    public void setGift(Gift gift) {
        this.gift = gift;
    }

    public void prepareBill() {
        bill.calculateTotal(foods, count);
    }

    public void showOrder() {
        System.out.println("Customer: " + person.getName());

        System.out.println("Foods:");
        for (int i = 0; i < count; i++) {
            System.out.println("- " + foods[i].getName());
        }

        bill.calculateTotal(foods, count);
        System.out.println("Total Bill: " + bill.getTotal());

        if (gift != null)
            System.out.println("Gift: " + gift.getGiftName());

        System.out.println("----------------------");
    }
}
