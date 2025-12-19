import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Meal{
    String name;
    ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
    private int ingredient_counter = 0;

// Source - https://stackoverflow.com/a
// Posted by Jonik, modified by community. See post 'Timeline' for change history
// Retrieved 2025-12-19, License - CC BY-SA 4.0

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    //Allows us to print meals with System.out
    public String toString() {
        double total_price = 0.0;
        for(Ingredient ingredient : ingredients){
            total_price += ingredient.price;
        }
        return this.name + "\t" + round(total_price, 2);
    }

    //Adds ingredient to a meal
    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    public Meal(String name){
        this.name = name;
    }

}
