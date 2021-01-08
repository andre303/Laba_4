package com.company.Tests;

import com.company.Coffee.BeansCoffee;
import com.company.Coffee.Coffee;
import com.company.Coffee.PackageType;
import com.company.Van.UnitOfGoods;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitOfGoodsTest {
    UnitOfGoods tested;
    @BeforeEach
    void setUp() {
        tested = null;
    }

    @AfterEach
    void tearDown() {
        tested = null;
    }
    @Test
    void getCoffee() {
        Coffee coffee = new BeansCoffee(PackageType.JAR);
        tested = new UnitOfGoods(coffee,10);
        assertEquals(coffee, tested.getCoffee());
    }

    @Test
    void getVolume() {
        Coffee coffee = new BeansCoffee(PackageType.JAR);
        tested = new UnitOfGoods(coffee,10);
        assertEquals(10, tested.getVolume());
    }

    @Test
    void getUnitPrice() {
        Coffee coffee = new BeansCoffee(PackageType.JAR);
        tested = new UnitOfGoods(coffee,10);
        assertEquals(coffee.getPrice(), tested.getUnitPrice());
    }

    @Test
    void getFullPrice() {
        int volume = 10;
        Coffee coffee = new BeansCoffee(PackageType.JAR);
        tested = new UnitOfGoods(coffee,volume);
        assertEquals(coffee.getPrice() * volume, tested.getFullPrice());
    }
}