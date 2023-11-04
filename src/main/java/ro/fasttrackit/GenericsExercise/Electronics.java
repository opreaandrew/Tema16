package ro.fasttrackit.GenericsExercise;

public class Electronics implements ShopItem {
    private final String name;
    private final int price;
    private final Category category;

    public Electronics(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String name() {
        return name;
    }

    public int price() {
        return price;
    }

    public Category category() {
        return category;
    }

    public String toString() {
        return "Electronics{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
