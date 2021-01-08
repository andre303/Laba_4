package com.company.Tests;

import com.company.Coffee.BeansCoffee;
import com.company.Coffee.Coffee;
import com.company.Coffee.PackageType;
import com.company.Van.UnitOfGoods;
import com.company.Van.Van;
import com.company.Van.VanFiller;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class VanTest {
    Van tested;
    @BeforeEach
    void setUp() {
        tested = null;
    }

    @AfterEach
    void tearDown() {
        tested = null;
    }
    @Test
    void getVolume() {
        tested = new Van(1000);
        assertEquals(1000,tested.getVolume());
    }


    @Test
    @DisplayName("Перевищення об'єму")
    void testAddGoods() {
        tested = VanFiller.Fill(1000,10000,PackageType.BAG);
        ArrayList<UnitOfGoods> expectedResult = new ArrayList<>();
        expectedResult.addAll(tested.getGoods());
        Coffee coffee = new BeansCoffee(PackageType.BAG);
        UnitOfGoods new_good = new UnitOfGoods(coffee,10);
        expectedResult.add(new_good);
        tested.addGoods(new_good);
        assertNotEquals(expectedResult, tested.getGoods());
    }

    @Test//Чи додається
    void testAddGoods1() {
        tested = VanFiller.Fill(1000,10000,PackageType.BAG);
        ArrayList<UnitOfGoods> expectedResult = new ArrayList<>();
        expectedResult.addAll(tested.getGoods());
        Coffee coffee = new BeansCoffee(PackageType.BAG);
        UnitOfGoods new_good = new UnitOfGoods(coffee,2);
        expectedResult.add(new_good);
        tested.addGoods(new_good);
        assertEquals(expectedResult, tested.getGoods());
    }
    @Test//Додавання масиву
    void testAddGoods2() {
        tested = new Van(1000);
        ArrayList<UnitOfGoods> expectedResult = VanFiller.Fill(1000,10000,PackageType.BAG).getGoods();
        tested.addGoods(expectedResult);
        assertEquals(expectedResult, tested.getGoods());

    }
    @Test//Додавання масиву з перевищенням об'єму
    void testAddGoods3() {
        tested = new Van(1000);
        ArrayList<UnitOfGoods> expectedResult = VanFiller.Fill(2000,10000,PackageType.BAG).getGoods();
        tested.addGoods(expectedResult);
        assertNotEquals(expectedResult, tested.getGoods());

    }
    @Test
    void getGoods() {
        ArrayList<UnitOfGoods> goods = new ArrayList<>();
        goods.add(new UnitOfGoods(new BeansCoffee(PackageType.JAR), 10));
        tested = new Van(100);
        tested.setGoods(goods);
        assertEquals(goods, tested.getGoods());
    }

    @Test
    void getFullPrice() {
        ArrayList<UnitOfGoods> goods = new ArrayList<>();
        Coffee coffee = new BeansCoffee(PackageType.JAR);
        goods.add(new UnitOfGoods(coffee, 10));
        tested = new Van(100);
        tested.addGoods(goods);
        assertEquals(coffee.getPrice()*10, tested.getFullPrice());
    }

    @Test
    void getFullVolume() {
        ArrayList<UnitOfGoods> goods = new ArrayList<>();
        Coffee coffee = new BeansCoffee(PackageType.JAR);
        goods.add(new UnitOfGoods(coffee, 10));
        coffee = new BeansCoffee(PackageType.JAR);
        goods.add(new UnitOfGoods(coffee, 20));
        tested = new Van(100);
        tested.addGoods(goods);
        assertEquals(30, tested.getFullVolume());
    }

    @Test
    void setGoods() {
        ArrayList<UnitOfGoods> goods = new ArrayList<>();
        goods.add(new UnitOfGoods(new BeansCoffee(PackageType.JAR), 10));
        tested = new Van(100);
        tested.setGoods(goods);
        assertEquals(goods, tested.getGoods());
    }
}