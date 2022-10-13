package grocery;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryList {

    static HashMap<Integer, String > categories;
    ArrayList<String> items;
    ArrayList<Integer> quantity;

    public GroceryList() {
        this.categories = new HashMap<Integer, String>();
        this.items = new ArrayList<String>();
        this.quantity = new ArrayList<Integer>();
    }

    public void addItem(String item) {
        items.add(item);
    }
    public void addQuantity(int number) {
        quantity.add(number);
    }

    public void setCategories() {
        categories.put(1, "Dairy");
        categories.put(2, "Produce");
        categories.put(3, "Meats");
        categories.put(4, "Fruits");
        categories.put(5, "Vegetables");
        categories.put(6, "Frozen Foods");
        categories.put(7, "Household Goods");
        categories.put(8, "Cleaning");
    }

}
