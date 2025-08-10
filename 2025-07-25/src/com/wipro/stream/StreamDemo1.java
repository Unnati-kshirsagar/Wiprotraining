package com.wipro.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class FoodItem {
    String foodType;   
    String foodName;
    String cuisine;
    double price;

    public FoodItem(String foodType, String foodName, String cuisine, double price) {
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

public class StreamDemo1 {
    public static void main(String[] args) {

        FoodItem f1 = new FoodItem("Veg", "Fried Rice", "Chinese", 150);
        FoodItem f2 = new FoodItem("Non Veg", "Chowmein", "Chinese", 180);
        FoodItem f3 = new FoodItem("Veg", "Spring Roll", "Chinese", 120);
        FoodItem f4 = new FoodItem("Veg", "Pasta", "Continental", 250);
        FoodItem f5 = new FoodItem("Non Veg", "Pad Thai", "Thai", 200);

        List<FoodItem> foodList = new ArrayList<>();
        foodList.add(f1);
        foodList.add(f2);
        foodList.add(f3);
        foodList.add(f4);
        foodList.add(f5);

        
        Comparator<FoodItem> comp = (a, b) -> {
            Double d1 = a.getPrice();
            Double d2 = b.getPrice();
            return d1.compareTo(d2);
        };

        List<FoodItem> chineseFoods = foodList.stream()
                .filter(f -> f.getCuisine().equalsIgnoreCase("Chinese"))
                .sorted(comp.reversed())
                .collect(Collectors.toList());

      
        System.out.println(chineseFoods);
    }
}
