package ro.fasttrackit;


import ro.fasttrackit.GenericsExercise.*;

import java.util.List;
import java.util.Optional;

import static ro.fasttrackit.RecursionExercises.Exercises.*;

public class Main {
    public static void main(String[] args) {

        // Part 1

//        System.out.println(sumOfFirst_n_integers(5));
//        System.out.println(sumOfFirst_n_EvenIntegers(3));
//        System.out.println(palindromeFirstAndLastLetter("asdfgfdsa"));
//        System.out.println(palindromeStringReverse("asdgffdsa"));
//        System.out.println(sumOfDigits(351));
//        System.out.println(fibonacci(30));

        // Part 2

        Shop<Clothes> clothesShop = new Shop<>();
        Shop<Electronics> electronicsShop = new Shop<>();
        Shop<Fruits> fruitsShop = new Shop<>();

        Clothes shirt1 = new Clothes("Shirt1", 30, Category.ON_SALE);
        Clothes shirt2 = new Clothes("Shirt2", 15, Category.NEW);
        Electronics phone1 = new Electronics("Phone1", 500, Category.NEW);
        Electronics phone2 = new Electronics("Phone2", 250, Category.REFURBISHED);
        Fruits apple1 = new Fruits("Apple1", 2, Category.ON_SALE);
        Fruits apple2 = new Fruits("Apple2", 4, Category.REFURBISHED);


        clothesShop.addItem(shirt1);
        clothesShop.addItem(shirt2);
        electronicsShop.addItem(phone1);
        electronicsShop.addItem(phone2);
        fruitsShop.addItem(apple1);
        fruitsShop.addItem(apple2);

        List<Clothes> onSaleClothes = clothesShop.findByCategory(Category.ON_SALE);
        System.out.println("On Sale Clothes: " + onSaleClothes);

        List<Clothes> lowerPrice = clothesShop.findWithLowerPrice((35));
        System.out.println("Clothes with price lower than 35: " + lowerPrice);

        Optional<Electronics> foundPhone = electronicsShop.findByName("Phone2");
        foundPhone.ifPresent(product -> System.out.println("Found: " + product.name()));

        Optional<Fruits> removedFruit = fruitsShop.removeItem("Apple1");
        removedFruit.ifPresent(product -> System.out.println("Removed: " + product.name()));


    }
}