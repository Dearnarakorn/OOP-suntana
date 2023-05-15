package pack7a;

import java.util.ArrayList;
import java.util.Map;

public class Shop {
    private String name;
    private Catalog catalog = new Catalog();
    private ArrayList<Basket> ordersToday = new ArrayList<>();

    public Shop(String n) {
        name = n;
        catalog.add(new Drink("mix veggies", "refreshing"), 22);
        catalog.add(new Drink("lactasoy", "less hungry"), 15);
        catalog.add(new Noodles("mama", "classic"), 9);
        catalog.add(new Noodles("korean", "i can afford"), 33);
        // duplicate won't update
        catalog.add(new Noodles("mama", "duplicate"), 11);
        showCatalog();
    }

    private void showCatalog() {
        System.out.println("Welcome to "+name);
        catalog.showCatalog();
    }

    public Basket newCustomerArrives() {
        Basket Q = new Basket();
        ordersToday.add(Q);
        return Q;
    }

    public LineItem generateLineItem(String pName, int q) { // add to UML
        return new LineItem(catalog.getProduct(pName), q, catalog.getPrice(pName));
        //return null;
    }

    public LineItem generateBuyNowItem(String pName) {
        return new LineItem(catalog.getProduct(pName), 1, catalog.getPrice(pName))  ;
    }

    public void getPayment(Basket b) {
        System.out.println("I am cashier");
        //ordersToday.add(b);
        b.printInvoice();
    }

    public void dailySalesReport() {
        System.out.println("==dailySalesReport==");
        int total =0;
        for(Basket od : ordersToday){
            int sum=0;
            for(LineItem line : od.getItems()){
                System.out.println(line.getProduct().getpName() + " x " + line.getQuantity() + " " + line.calculateAmount());
                sum += line.calculateAmount();
            }
            System.out.println("total is " + sum + "******");
            total+=sum;
            //od.printInvoice();
        }
        System.out.println("grand total = " + total);
    }



}
