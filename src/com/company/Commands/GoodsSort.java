package com.company.Commands;

import com.company.Coffee.Coffee;
import com.company.Van.UnitOfGoods;

import java.util.ArrayList;

public class GoodsSort implements Command {
    ArrayList<UnitOfGoods> goods;
    public GoodsSort(ArrayList<UnitOfGoods> goods) {
        this.goods = new ArrayList<UnitOfGoods>(goods);
    }
    public void setItem(ArrayList<UnitOfGoods> goods){
        this.goods = goods;
    }
    @Override
    public ArrayList<UnitOfGoods> execute() {
        return null;
    }
}
