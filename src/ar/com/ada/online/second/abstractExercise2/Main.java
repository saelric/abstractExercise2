package ar.com.ada.online.second.abstractExercise2;

import ar.com.ada.online.second.abstractExercise2.subclass.Clothe;
import ar.com.ada.online.second.abstractExercise2.subclass.ShoppingCart;
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

        System.out.println("Seleccione una categoría: 1)Comida, 2)Juguete, 3)Ropa, 4)Herramienta ");
        int option = keyboard.nextInt();

        System.out.println("Ingrese la cantidad de productos que va a comprar");
        int size = keyboard.nextInt();

        for (int i = 0; i < size; i++) {


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
        }


    }

    public static Food createFood(Scanner keyboard) {
        Food food = new Food();

        System.out.println("Ingrese el nombre del artículo: ");
        String name = keyboard.next();
        System.out.println("Ingrese el precio de lista: ");
        Double listPrice = keyboard.nextDouble();


        food.setName(name);
        food.setListPrice(listPrice);

        return food;
    }

    public static Toy createToy(Scanner keyboard) {
        Toy toy = new Toy();

        System.out.println("Ingrese el nombre del artículo: ");
        String name = keyboard.next();
        System.out.println("Ingrese el precio de lista: ");
        Double listPrice = keyboard.nextDouble();


        toy.setName(name);
        toy.setListPrice(listPrice);

        return toy;
    }

    public static Clothe createClothe(Scanner keyboard) {
        Clothe clothe = new Clothe();

        System.out.println("Ingrese el nombre del artículo: ");
        String name = keyboard.next();
        System.out.println("Ingrese el precio de lista: ");
        Double listPrice = keyboard.nextDouble();
        System.out.println("Seleccione una categoría: 1)Mujer o niñx, 2)Otro ");
        int category = keyboard.nextInt();


        clothe.setCategory(category);
        clothe.setName(name);
        clothe.setListPrice(listPrice);


        return clothe;
    }

    public static Tool createTool(Scanner keyboard) {
        Tool tool = new Tool();

        System.out.println("Ingrese el nombre del artículo: ");
        String name = keyboard.next();
        System.out.println("Ingrese el precio de lista: ");
        Double listPrice = keyboard.nextDouble();
        System.out.println("Seleccione el método de pago: 1) Efectivo o  débito, 2) Tarjeta de crédito ");
        int option = keyboard.nextInt();

        tool.setName(name);
        tool.setListPrice(listPrice);

        return tool;
    }
}


