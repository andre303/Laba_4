package com.company.Tests;

import com.company.Coffee.BeansCoffee;
import com.company.Coffee.CoffeeType;
import com.company.Coffee.Coffee;
import com.company.Coffee.PackageType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeansCoffeeTest {
    BeansCoffee tested;
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
        for(int i = 0;i < Coffee.names.length;i++) {
            tested = new BeansCoffee(PackageType.BAG, Coffee.names[i]);
            assertEquals(Coffee.prices[i], tested.getPrice());
        }
    }

    @Test
    void getType() {
        tested = new BeansCoffee(PackageType.BAG);
        assertEquals(CoffeeType.BEANS, tested.getType());
    }

    @Test
    void getName() {
        for(int i = 0;i < Coffee.names.length;i++) {
            tested = new BeansCoffee(PackageType.BAG, Coffee.names[i]);
            assertEquals(Coffee.names[i], tested.getName());
        }
    }

    @Test
    void getPackageType() {
        tested = new BeansCoffee(PackageType.BAG);
        assertEquals(PackageType.BAG, tested.getPackageType());
        tested = new BeansCoffee(PackageType.JAR);
        assertEquals(PackageType.JAR, tested.getPackageType());
    }
}