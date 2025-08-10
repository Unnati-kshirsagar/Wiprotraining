package com.wipro.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class FoodItem1 {
    String foodType;
    String foodName;
    String cuisine;
    double price;

    public FoodItem1(String foodType, String foodName, String cuisine, double price) {
        this.foodType = foodType;
        this.foodName = foodName;
        this.cuisine = cuisine;
        this.price = price;
    }

    public String getCuisine() {
        return cuisine;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return foodName + " (" + cuisine + ", " + foodType + ") - ₹" + price;
    }
}

public class MostExpensiveChinese {
    public static void main(String[] args) {

        List<FoodItem> foodList = Arrays.asList(
            new FoodItem("Veg", "Fried Rice", "Chinese", 150),
            new FoodItem("Non Veg", "Chowmein", "Chinese", 180),
            new FoodItem("Veg", "Spring Roll", "Chinese", 120),
            new FoodItem("Veg", "Pasta", "Continental", 250),
            new FoodItem("Non Veg", "Pad Thai", "Thai", 200)
        );


        Optional<FoodItem> expensiveChinese = foodList.stream()
            .filter(f -> f.getCuisine().equalsIgnoreCase("Chinese"))
            .sorted((a, b) -> Double.compare(b.getPrice(), a.getPrice()))  
            .findFirst();

       
        
            System.out.println("Most expensive Chinese dish:");
            System.out.println(expensiveChinese.get());
       
        
    }
}
