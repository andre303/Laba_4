package com.company.Commands;

import com.company.Van.UnitOfGoods;
import java.util.ArrayList;

public class GoodsPrinter implements Command {
    ArrayList<UnitOfGoods> goods;
    public GoodsPrinter(ArrayList<UnitOfGoods> goods) {
        this.goods = new ArrayList<>(goods);
    }
    @Override
    public ArrayList<UnitOfGoods> execute() {
        for(UnitOfGoods unit: goods){
            System.out.println(unit.toString());
        }
        return goods;
    }
}