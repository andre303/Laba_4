package com.company.Tests;

import com.company.Coffee.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroundCoffeeTest {
    GroundCoffee tested;
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
            tested = new GroundCoffee(PackageType.BAG, Coffee.names[i]);
            assertEquals(Coffee.prices[i], tested.getPrice());
        }
    }

    @Test
    void getType() {
        tested = new GroundCoffee(PackageType.BAG);
        assertEquals(CoffeeType.GROUND, tested.getType());
    }

    @Test
    void getName() {
        for(int i = 0;i < Coffee.names.length;i++) {
            tested = new GroundCoffee(PackageType.BAG, Coffee.names[i]);
            assertEquals(Coffee.names[i], tested.getName());
        }
    }

    @Test
    void getPackageType() {
        tested = new GroundCoffee(PackageType.BAG);
        assertEquals(PackageType.BAG, tested.getPackageType());
        tested = new GroundCoffee(PackageType.JAR);
        assertEquals(PackageType.JAR, tested.getPackageType());
    }
}
