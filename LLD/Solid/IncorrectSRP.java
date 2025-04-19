package Solid;

public class IncorrectSRP {
    class Marker{
        String name;
        String color;
        int year;
        int price;
        
        public Marker(String name, String color, int year , int price){
            this.name = name;
            this.color = color;
            this.year = year;
            this.price = price;        
        }
    }

    class Invoice {
        private  Marker marker;
        private int quantity;
        public Invoice(Marker marker, int quantity){
            this.marker = marker;
            this.quantity = quantity;
        }

        //could be changed -1
        public int calculateTotal(){
            int price = ((marker.price)* this.quantity);
            return price;
        }

        //could be changed -2
        public void printInvoice(){
            // Print invoice
        }

        //could be changed -3
        public void saveToDB(){
            // Save data into DB
        }

        //so here are 3 reasons to change so it is not a SRP. we have to make it SRP.
    }
}
