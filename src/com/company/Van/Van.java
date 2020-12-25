package com.company.Van;

import com.company.Coffee.Coffee;

import java.util.ArrayList;


public class Van {
    ArrayList<UnitOfGoods> goods;
    int volume = 1000;
    public Van(int volume){
        goods = new ArrayList<UnitOfGoods>();
    }
    public Van(ArrayList<UnitOfGoods> goods){
        this.goods = goods;
    }
    public void addGoods(Coffee item,int weight){
     goods.add(new UnitOfGoods(item,weight));
    }
    public void addGoods(ArrayList<UnitOfGoods> goods){
        for (UnitOfGoods unit:goods) {
            this.goods.add(unit);
        }
    }
    public void addGoods(UnitOfGoods unit){
        goods.add(unit);
    }
    public ArrayList<UnitOfGoods>  getGoods(){
        return goods;
    }
    public void setGoods(ArrayList<UnitOfGoods> goods){
        this.goods = goods;
    }
}
