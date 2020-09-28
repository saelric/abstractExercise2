package ar.com.ada.online.second.abstractExercise2.subclass.food;

import ar.com.ada.online.second.abstractExercise2.superclass.Product;

import java.util.Objects;

public class Food extends Product {
    protected final Double DISCOUNT = 0.1;

    public Food(){

    }
    public Food(String name, Double listPrice, Double discountPrice ){

    }


    @Override
    public void calculateDiscount(){
        discountPrice = listPrice * DISCOUNT;
    }
    @Override
    public String toString() {
        return String.format("Food { DISCOUNT = "
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
        Food that = (Food) obj;
        return super.equals(obj) &&
                name.equals(that.DISCOUNT);
    }

}
