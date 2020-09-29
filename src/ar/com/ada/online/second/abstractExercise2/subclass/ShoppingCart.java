package ar.com.ada.online.second.abstractExercise2.subclass;

import ar.com.ada.online.second.abstractExercise2.superclass.Product;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class ShoppingCart {
    public static String dayOfWeek;
    public static Integer amountOfToys = 0;
    public static int paymentMethod;

    private ArrayList<Product> products;


    public ShoppingCart() {
        DateFormat formatter = new SimpleDateFormat("EEEE", Locale.US);
        Date now = new Date();
        ShoppingCart.dayOfWeek = formatter.format(now);
        this.products = new ArrayList<>();
    }



    public ArrayList<Product> getProducts(){
        return products;
    }
    public void setProducts(ArrayList<Product> products){
        this.products = products;
    }
    public void addProduct(Product product){
        if (product instanceof Toy) amountOfToys++;
        this.products.add(product);
    }

    public static void setPaymentMethod(int paymentMethod) {
        ShoppingCart.paymentMethod = paymentMethod;
    }
}
