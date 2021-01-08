package com.company.Tests;

import com.company.Coffee.PackageType;
import com.company.Commands.GoodsPrinter;
import com.company.Van.Van;
import com.company.Van.VanFiller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodsPrinterTest {


    @Test
    void execute() {
        Van van = VanFiller.Fill(1000, 1000, PackageType.JAR);
        GoodsPrinter goodsPrinter = new GoodsPrinter(van.getGoods());
        assertEquals(van.getGoods(), goodsPrinter.execute());
    }
}