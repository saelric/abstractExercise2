package ar.com.ada.online.second.abstractExercise2.subclass;

import ar.com.ada.online.second.abstractExercise2.superclass.Product;

import java.util.Objects;

public class Clothe extends Product {
    protected String category;
    protected final Double DISCOUNT = 0.15;

    public Clothe(){

    }
    public Clothe(String name, Double listPrice, Double discountPrice ){

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(int category) {
       category = category;
    }

    @Override
    public void calculateDiscount(){
        discountPrice = listPrice * DISCOUNT;
    }

    @Override
    public String toString() {
        return String.format("Clothe { DISCOUNT = "
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
        Clothe that = (Clothe) obj;
        return super.equals(obj) &&
                name.equals(that.DISCOUNT);
    }
}
