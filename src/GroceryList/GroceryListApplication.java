package GroceryList;


import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListApplication {


    ArrayList<Items> list = new ArrayList<Items>();




    //create new Item on the grocery list with user input
    public void addItem() {
        System.out.println();
        System.out.println("Enter the name of your item");
        Scanner input = new Scanner(System.in);
        String ItemName = input.nextLine();

        System.out.println("Enter the price of your item");
        double ItemPrice = input.nextDouble();

        System.out.println("Enter the Qty of your item");
        int ItemQty = input.nextInt();

        Items Item = new Items(ItemName, ItemPrice, ItemQty);
        list.add(Item);
        System.out.println("Item Added");
    }

    //Display list and total number of items.
    public void displayItem() {
        System.out.println(list.size() + " items. ");
        for (Items x : list) {
            System.out.println(x.toString());
        }

    }


    //prompts user for item
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GroceryListApplication myList = new GroceryListApplication();
        int userOpt = 0;
        while (userOpt != 3) {
            System.out.println("");
            System.out.println("----- Shopping List------");
            System.out.println("(1) Add an item to the list. ");
            System.out.println("(2) Display list and total number of items. ");
            System.out.println("(3) Exit. ");
            userOpt = input.nextInt();

            if (userOpt == 1) {
                myList.addItem();

            }

            if (userOpt == 2) {
                myList.displayItem();
            }
        }
    }

    }