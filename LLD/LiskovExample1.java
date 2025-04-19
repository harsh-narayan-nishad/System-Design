public class LiskovExample1 {
    //parent class

    public static class MenuItem {
        public int price;
        public String name;
        public String description;

        public MenuItem(int price, String name, String description){
            this.price = price;
            this.name = name;
            this.description = description;
        }

        public double getPrice(){
            return this.price;
        }
    }

    // child class extanidn MenuItem,

    public static class BeverageItem extends MenuItem{
        public BeverageItem(int price, String name, String description){
            super(price, name, description);
        }

        public double  getPriceWithDiscount(int discountPercent){
            return this.price - (discountPercent * 0.01 * this.price);
        }
    }

    public static void main(String[] args) {
        // Creating instances of MenuItem and BeverageItem
        MenuItem item = new MenuItem(100, "Burger", "A delicious beef burger");
        BeverageItem beverage = new BeverageItem(50, "Coke", "A refreshing soda");

        // Displaying the price of the menu item
        System.out.println("Menu Item: " + item.name + " - Price: " + item.getPrice());
        
        // Displaying the price of the beverage item without discount
        System.out.println("Beverage Item: " + beverage.name + " - Price: " + beverage.getPrice());
        
        // Displaying the price of the beverage item with a 10% discount
        System.out.println("Beverage Item (with discount): " + beverage.name + " - Price: " + beverage.getPriceWithDiscount(10));
    }
}
