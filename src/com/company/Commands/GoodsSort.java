package com.company.Commands;

import com.company.Van.UnitOfGoods;
import java.util.ArrayList;
import java.util.Collections;

public class GoodsSort implements Command {
    ArrayList<UnitOfGoods> goods;
    public GoodsSort(ArrayList<UnitOfGoods> goods) {
        this.goods = new ArrayList<>(goods);
    }
    @Override
    public ArrayList<UnitOfGoods> execute() {
        Collections.sort(goods);
        for(UnitOfGoods unit: goods){
            System.out.println(unit.toString());
        }
        return goods;
    }
}
