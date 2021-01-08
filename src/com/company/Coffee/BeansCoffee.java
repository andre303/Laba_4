package com.company.Coffee;

import java.util.Arrays;

public class BeansCoffee implements Coffee {
    private final String name;
    private final int price;
    private final CoffeeType type = CoffeeType.BEANS;
    private final PackageType packageType;

    public BeansCoffee(PackageType packageType){
        this.packageType = packageType;
        int priceMultiplier = 0;
        if(packageType == PackageType.JAR)
            priceMultiplier = 1;
        int index = (int)(Math.random()*names.length);
        name = names[ index ];
        price = prices[ index ] + priceMultiplier;

    }
    public BeansCoffee(PackageType packageType, String name){
        int index = Arrays.asList(names).indexOf(name);
        if(index == -1){
            //logger exception
        }
        this.packageType = packageType;
        int priceMultiplier = 0;
        if(packageType == PackageType.JAR)
            priceMultiplier = 1;
        this.name = names[ index ];
        price = prices[ index ] + priceMultiplier;

    }


    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public CoffeeType getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public PackageType getPackageType(){
        return packageType;
    }

    @Override
    public String toString() {
        return "| " + name + " | " + type + " | " + packageType + " | Price: " + price;
    }
}
