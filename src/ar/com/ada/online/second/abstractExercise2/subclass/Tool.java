package ar.com.ada.online.second.abstractExercise2.subclass;

import ar.com.ada.online.second.abstractExercise2.superclass.Product;

import java.util.Objects;

public class Tool extends Product {
    protected final Double DISCOUNT = 0.05;

    public Tool(){

    }
    public Tool(String name, Double listPrice, Double discountPrice ){

    }

    @Override
    public void calculateDiscount() {
        if (ShoppingCart.paymentMethod == 2){
            discountPrice = listPrice * DISCOUNT;
        }
    }

    @Override
    public String toString() {
        return String.format("Tool { DISCOUNT = "
                + this.DISCOUNT +
                ", name = "
                + this.name +
                ", listPrice = "
                + this.listPrice +
                ", discountPrice"
                + this.discountPrice
        );

    }

    @Override
    public int hashCode() {
        return 10 * Objects.hash(super.hashCode(), DISCOUNT);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Tool that = (Tool) obj;
        return super.equals(obj) &&
                name.equals(that.DISCOUNT);
    }
}
