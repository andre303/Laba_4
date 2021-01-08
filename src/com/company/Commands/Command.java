package com.company.Commands;
import com.company.Van.UnitOfGoods;
import java.util.ArrayList;

public interface Command {
    ArrayList<UnitOfGoods> execute();
}
