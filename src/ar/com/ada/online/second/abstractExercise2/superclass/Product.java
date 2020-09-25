package ar.com.ada.online.second.execirsetwo.superclass;

import java.util.Objects;

public abstract class Product {
    protected String name;
    protected Double listPrice;
    protected Double discountPrice;


    public Product() {

    }

    public Product(String name, Double listPrice, Double discountPrice) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getListPrice() {
        return listPrice;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
    }

    public Double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public abstract void calculateDiscount();

    @Override
    public String toString() {
        return String.format("Product { name = "
                + this.name +
                ", listPrice = "
                + this.listPrice +
                ", discountPrice = "
                + this.discountPrice
        );
    }

    @Override
    public int hashCode() {
        return 10 * Objects.hash(name, listPrice, discountPrice);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Product that = (Product) obj;
        return name.equals(that.name) &&
                listPrice.equals(that.listPrice) &&
                discountPrice.equals(that.discountPrice);
    }

}
