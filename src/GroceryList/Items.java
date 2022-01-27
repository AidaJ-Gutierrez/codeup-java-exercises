package GroceryList;


public class Items {
    private String ItemName;
    private double ItemPrice;
    private int ItemQty;

    public  Items(String ItemName, double ItemPrice, int ItemQty) {
        this.ItemName = ItemName;
        this.ItemPrice = ItemPrice;
        this.ItemQty = ItemQty;

    }




    public String getItemName() {

        return ItemName;
    }

    public void setItemName(String itemName) {

        this.ItemName = itemName;
    }

    public double getItemPrice() {
        return ItemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.ItemPrice = itemPrice;
    }

    public int getItemQty() {

        return ItemQty;
    }

    public void setItemQty(int itemQty) {
        this.ItemQty = itemQty;
    }

    public String toString() {
        String state = ItemName + " -  $" + ItemPrice + " x " + ItemQty;
        return state;
    }
}