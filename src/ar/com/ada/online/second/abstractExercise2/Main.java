package ar.com.ada.online.second.abstractExercise2;

import ar.com.ada.online.second.abstractExercise2.subclass.Clothe;
import ar.com.ada.online.second.abstractExercise2.subclass.Tool;
import ar.com.ada.online.second.abstractExercise2.subclass.Toy;
import ar.com.ada.online.second.abstractExercise2.subclass.food.Food;
import ar.com.ada.online.second.abstractExercise2.superclass.Product;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        Calendar cal = Calendar.getInstance();

        System.out.println("Seleccione una categoría: 1)Comida, 2)Juguete, 3)Ropa, 4)Herramienta ");
        int option = keyboard.nextInt();

        switch (option) {
            case 1:
                Food food = createFood(keyboard);
                products.add(food);
                break;
            case 2:
                Toy toy = createToy(keyboard);
                products.add(toy);
                break;
            case 3:
                Clothe clothe = createClothe(keyboard);
                products.add(clothe);
                break;
            case 4:
                Tool tool = createTool(keyboard);
                products.add(tool);
                break;
            default:
                System.out.println("Opción incorrecta");
        }


        if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY || cal.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY) {

        }


    }

    public static Food createFood(Scanner keyboard) {
        Food food = new Food();

        System.out.print("Ingrese el nombre del artículo: ");
        String name = keyboard.nextLine();
        System.out.println("Ingrese el precio de lista: ");
        Double listPrice = keyboard.nextDouble();

        food.calculateDiscount();
        food.setName(name);
        food.setListPrice(listPrice);

        return food;
    }

    public static Toy createToy(Scanner keyboard) {
        Toy toy = new Toy();

        System.out.print("Ingrese el nombre del artículo: ");
        String name = keyboard.nextLine();
        System.out.println("Ingrese el precio de lista: ");
        Double listPrice = keyboard.nextDouble();


        toy.setName(name);
        toy.setListPrice(listPrice);
        toy.calculateDiscount();

        return toy;
    }

    public static Clothe createClothe(Scanner keyboard) {
        Clothe clothe = new Clothe();

        System.out.print("Ingrese el nombre del artículo: ");
        String name = keyboard.next();
        System.out.print("Ingrese el precio de lista: ");
        Double listPrice = keyboard.nextDouble();
        System.out.print("Seleccione una categoría: 1)Mujer o niñx, 2)Otro ");
        int category = keyboard.nextInt();


        clothe.setCategory(category);
        clothe.setName(name);
        clothe.setListPrice(listPrice);
        if (category == 1) {
            clothe.calculateDiscount();
        }


        return clothe;
    }

    public static Tool createTool(Scanner keyboard) {
        Tool tool = new Tool();

        System.out.print("Ingrese el nombre del artículo: ");
        String name = keyboard.nextLine();
        System.out.println("Ingrese el precio de lista: ");
        Double listPrice = keyboard.nextDouble();
        System.out.println("Ingrese el precio de lista: ");
        Double discountPrice = keyboard.nextDouble();

        tool.setName(name);
        tool.setListPrice(listPrice);
        tool.setDiscountPrice(discountPrice);

        return tool;
    }

    public static void calculateDiscount(ArrayList<Product> products) {
        for (Product product : products) {
            Calendar cal = Calendar.getInstance();

            switch (product.getClass().getSimpleName()) {
                case "Food":
                    Food food = (Food) product;
                    if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY || cal.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY) {
                        product.calculateDiscount();
                    }
                    break;
                case "Toy":
                    Toy toy = (Toy) product;
                    if (){

                    }
                        break;

                case "Clothe":
                    Clothe clothe = (Clothe) product;

                    break;
            }
        }

//    public static void showTicket(ArrayList<Product> products) {}


    }
}
