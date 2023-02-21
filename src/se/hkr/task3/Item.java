package se.hkr.task3;

public class Item {
    String name;
    int quantity;

    public Item() {
    }

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Quantity: %s", this.name, String.valueOf(this.quantity));
    }
}
