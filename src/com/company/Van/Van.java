package com.company.Van;


import java.util.ArrayList;


public class Van {
    ArrayList<UnitOfGoods> goods;
    private int volume;


    public int getVolume(){
        return volume;
    }

    public Van(int volume){
        this.volume = volume;
        goods = new ArrayList<UnitOfGoods>();
    }

    public Van(int volume, ArrayList<UnitOfGoods> goods){
        this.volume = volume;
        this.goods = goods;
    }

    public void addGoods(ArrayList<UnitOfGoods> goods){
        int volume = 0;
        for (UnitOfGoods unit : goods) {
            volume += unit.getVolume();
        }
        if (getFullVolume() + volume <= this.volume) {
            this.goods.addAll(goods);
        }
    }

    public void addGoods(UnitOfGoods unit){
        if(getFullVolume()+unit.getVolume()  <= volume)
            goods.add(unit);
    }

    public ArrayList<UnitOfGoods>  getGoods(){
        return goods;
    }
    public int getFullPrice(){
        int price = 0;
        for (UnitOfGoods unit : goods) {
            price += unit.getFullPrice();
        }
        return price;
    }
    public int getFullVolume(){
        int Volume = 0;
        for (UnitOfGoods unit : goods) {
            Volume += unit.getVolume();
        }
        return Volume;
    }
    public void setGoods(ArrayList<UnitOfGoods> goods){
        this.goods = goods;
    }

}
