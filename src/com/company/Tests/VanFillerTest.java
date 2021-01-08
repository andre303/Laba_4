package com.company.Tests;

import com.company.Coffee.PackageType;
import com.company.Van.Van;
import com.company.Van.VanFiller;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class VanFillerTest {

    @Test
    void fill() {
        int[][] parameters = new int[][]{{1000, 0}, {0, 1000}, {0, 0}};
        PackageType type = PackageType.BAG;
        Van expectedResult = null;//Замінити на assertNull
        assertAll(() -> assertEquals(expectedResult, VanFiller.Fill(parameters[0][0], parameters[0][1], type)),
                () -> assertEquals(expectedResult, VanFiller.Fill(parameters[1][0], parameters[1][1], type)),
                () -> assertEquals(expectedResult, VanFiller.Fill(parameters[2][0], parameters[2][1], type)));
    }
}