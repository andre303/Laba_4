package com.company.Coffee;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BeansCoffee implements Coffee {
    private static final Logger logger = Logger.getLogger( "log" );

    private final String name;
    private final int price;
    private final CoffeeType type = CoffeeType.BEANS;
    private final PackageType packageType;

    public BeansCoffee( PackageType packageType ){
        this.packageType = packageType;
        int priceMultiplier = 0;
        if (packageType == PackageType.JAR)
            priceMultiplier = 1;
        int index = ( int ) ( Math.random() * names.length );
        name = names[ index ];
        price = prices[ index ] + priceMultiplier;

    }
    public BeansCoffee ( PackageType packageType, String name ) {
        int index = Arrays.asList( names ).indexOf( name );
        if ( index == -1 ){
            logger.log(Level.WARNING, "Coffe wasn't created, expected coffee type is not in use");
        }
        this.packageType = packageType;
        int priceMultiplier = 0;
        if ( packageType == PackageType.JAR )
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
