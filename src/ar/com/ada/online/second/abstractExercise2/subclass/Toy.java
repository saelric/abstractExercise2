package ar.com.ada.online.second.abstractExercise2.subclass;

import ar.com.ada.online.second.abstractExercise2.superclass.Product;

import java.util.Objects;

public class Toy extends Product {
    protected final Double DISCOUNT = 0.25;

    public Toy(){

    }
    public Toy(String name, Double listPrice, Double discountPrice ){

    }

    @Override
    public void calculateDiscount(){
        if (ShoppingCart.amountOfToys > 3 || this.listPrice > 3000){
            discountPrice = listPrice * DISCOUNT;
        }
    }
    @Override
    public String toString() {
        return String.format("Toy { DISCOUNT = "
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
        Toy that = (Toy) obj;
        return super.equals(obj) &&
                name.equals(that.DISCOUNT);
    }
}
