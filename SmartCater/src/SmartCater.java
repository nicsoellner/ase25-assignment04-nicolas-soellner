import javax.swing.*;
import java.util.ArrayList;


public class SmartCater {
    private static ArrayList<Meal> Meals = new ArrayList<Meal>();

    public static void printMeals(){
        for(Meal meal : Meals){
            System.out.println(meal);
        }
    }

    public static void main(String[] args){
        //The Idea here is that the Maintainer starts by setting up ingredients out of which they can build meals
        //We start by setting up some ingredients
        Ingredient onion = new Ingredient("Onion", 0.69);
        Ingredient egg = new Ingredient("Egg", 0.23);
        Ingredient bacon = new Ingredient("Bacon", 1.00);

        //Then we create some new meals
        Meal baconAndEggs = new Meal("Bacon and Eggs");
        Meal eggsAndOnion = new Meal("Eggs and Onion");

        //And add ingredients to the meals
        baconAndEggs.addIngredient(bacon);
        baconAndEggs.addIngredient(egg);

        //same as above
        eggsAndOnion.addIngredient(egg);
        eggsAndOnion.addIngredient(onion);

        Meals.add(baconAndEggs);
        Meals.add(eggsAndOnion);

        //Using printMeals we can see all available meals
        printMeals();
    }




}

