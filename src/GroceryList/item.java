package GroceryList;


public class item {
    private String itemName;
    private int itemQuantity;

    public void Item(String itemName, int itemQuantity){
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
    }

    public String getItemName(){
        return itemName;
    }

    public int getItemQuantity(){
        return itemQuantity;
    }
}