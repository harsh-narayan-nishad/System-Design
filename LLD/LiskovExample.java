package solid;

public class LiskovExample {

    // Parent class
    public static class MenuItem {
        public int price;
        public String name;
        public String description;

        public MenuItem(int price, String name, String description) {
            this.price = price;
            this.name = name;
            this.description = description;
        }

        public double getPrice() {
            return this.price;
        }
    }

    // Child class extending MenuItem
    public static class BeverageItem extends MenuItem {

        public BeverageItem(int price, String name, String description) {
            super(price, name, description);
        }

        public double getPriceWithDiscount(int discountPercent) {
            return this.price - (discountPercent * 0.01 * this.price);
        }
    }
}
