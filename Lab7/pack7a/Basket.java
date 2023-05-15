package pack7a;

import java.util.ArrayList;

public class Basket {
    private ArrayList<LineItem> items = new ArrayList<>();

    public void showItemsInBasket(){ 
        System.out.println("This basket contains");
        for(LineItem item : items){
            System.out.println(item);
        }
    }

    public void putInBasket(LineItem item) {
        items.add(item);
    }

    public void printInvoice() {
        System.out.println("invoice header");
        int sum = 0;
        for (LineItem line : items) {
            System.out
            .println(line.getProduct().getpName() + " x " + line.getQuantity() + " " + line.calculateAmount());
            sum += line.calculateAmount();
        }
        System.out.println("Total is " + sum + "******");
    }

    public void buyNow(LineItem item) {
        items.add(item);
        printInvoice();
    }

    public ArrayList<LineItem> getItems() {
        return items;
    }


}
