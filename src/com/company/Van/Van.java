package com.company.Van;

import com.company.Coffee.Coffee;

import java.util.ArrayList;


public class Van {
    ArrayList<UnitOfGoods> goods;
    public Van(){
        goods = new ArrayList<UnitOfGoods>();
    }
    public Van(ArrayList<UnitOfGoods> goods){
        this.goods = goods;
    }
    public void addGoods(Coffee item,int weight){

    }
    public ArrayList<UnitOfGoods>  getGoods(){
        return goods;
    }
    public void setGoods(ArrayList<UnitOfGoods> goods){
        this.goods = goods;
    }
}
