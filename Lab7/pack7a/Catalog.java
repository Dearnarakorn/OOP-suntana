package pack7a;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
    private Map<String, Product> productList;
    private Map<String, Integer> priceList;

    public Catalog() {
        productList = new HashMap<>();
        priceList = new HashMap<>();
    }

    public void add(Product product, int price) {
        if(!productList.containsKey(product.pName)){
            productList.put(product.pName, product);
            priceList.put(product.pName, price);
        }
    }

    public void showCatalog() {
        for(String pname : priceList.keySet()){
            System.out.println(pname +" @ "+ priceList.get(pname));
        }
    }

    public int getPrice(String productName) {
        return priceList.get(productName);
    }

    public Product getProduct(String productName) {
        return productList.get(productName);
    }
}
