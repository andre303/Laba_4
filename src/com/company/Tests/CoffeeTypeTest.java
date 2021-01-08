package com.company.Tests;

import com.company.Coffee.CoffeeType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeTypeTest {

    @Test
    void getType() {
        assertAll(()->assertEquals(CoffeeType.BEANS, CoffeeType.getType(1)),
                ()->assertEquals(CoffeeType.GROUND, CoffeeType.getType(2)),
                ()->assertEquals(CoffeeType.INSTANT, CoffeeType.getType(3)));
    }
}