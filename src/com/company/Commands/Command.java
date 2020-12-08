package com.company.Commands;
import com.company.Coffee.Coffee;
import com.company.Van.UnitOfGoods;
import java.util.ArrayList;
@FunctionalInterface
public interface Command {
    ArrayList<UnitOfGoods> execute();
}
