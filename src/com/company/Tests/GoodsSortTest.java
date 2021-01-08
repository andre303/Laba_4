package com.company.Tests;

import com.company.Coffee.BeansCoffee;
import com.company.Coffee.Coffee;
import com.company.Coffee.InstantCoffee;
import com.company.Coffee.PackageType;
import com.company.Commands.GoodsSort;
import com.company.Van.UnitOfGoods;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class GoodsSortTest {


    @Test
    void execute() {
        ArrayList<UnitOfGoods> goods = new ArrayList<>();
        Coffee coffee = new InstantCoffee(PackageType.JAR, Coffee.names[10]);
        goods.add(new UnitOfGoods(coffee, 40));
         coffee = new BeansCoffee(PackageType.JAR, Coffee.names[10]);
        goods.add(new UnitOfGoods(coffee, 80));
        coffee = new BeansCoffee(PackageType.JAR, Coffee.names[10]);
        goods.add(new UnitOfGoods(coffee, 60));
        GoodsSort goodsSort = new GoodsSort(goods);
        Collections.swap(goods,1,0);
        Collections.swap(goods,1,2);
        assertEquals(goods,goodsSort.execute());

    }
}