package com.company.Commands;

import com.company.Coffee.Coffee;
import com.company.Van.UnitOfGoods;

import java.util.ArrayList;

public class GoodsPrinter implements Command {
    ArrayList<UnitOfGoods> goods;
    public GoodsPrinter(ArrayList<UnitOfGoods> goods) {
        this.goods = new ArrayList<UnitOfGoods>(goods);
    }
    public void setItem(ArrayList<UnitOfGoods> goods){
        this.goods = goods;
    }
    @Override
    public ArrayList<UnitOfGoods> execute() {
        for(UnitOfGoods t : goods){
            System.out.println(t.toString());
        }
        return null;
    }
}