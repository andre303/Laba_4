package com.company.Tests;

import com.company.Coffee.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InstantCoffeeTest {
    InstantCoffee tested;
    @BeforeEach
    void setUp() {
        tested = null;
    }

    @AfterEach
    void tearDown() {
        tested = null;
    }

    @Test
    void getPrice() {
        for(int i = 0; i < Coffee.names.length; i++) {
            tested = new InstantCoffee(PackageType.BAG, Coffee.names[i]);
            assertEquals(Coffee.prices[i], tested.getPrice());
        }
    }

    @Test
    void getType() {
        tested = new InstantCoffee(PackageType.BAG);
        assertEquals(CoffeeType.INSTANT, tested.getType());
    }

    @Test
    void getName() {
        for(int i = 0;i < Coffee.names.length;i++) {
            tested = new InstantCoffee(PackageType.BAG, Coffee.names[i]);
            assertEquals(Coffee.names[i], tested.getName());
        }
    }

    @Test
    void getPackageType() {
        tested = new InstantCoffee(PackageType.BAG);
        assertEquals(PackageType.BAG, tested.getPackageType());
        tested = new InstantCoffee(PackageType.JAR);
        assertEquals(PackageType.JAR, tested.getPackageType());
    }
}
