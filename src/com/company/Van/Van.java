package com.company.Van;


import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Van {
    private static final Logger logger = Logger.getLogger("log");
    ArrayList<UnitOfGoods> goods;
    private int volume;


    public int getVolume(){
        return volume;
    }

    public Van(int volume){
        logger.log(Level.INFO,"Van was successfully created");
        this.volume = volume;
        goods = new ArrayList<UnitOfGoods>();
    }

    public Van(int volume, ArrayList<UnitOfGoods> goods){
        logger.log(Level.INFO,"Van was successfully created");
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
            logger.log(Level.INFO,"Goods was added");
        }
        else{
            logger.log(Level.WARNING,"Volume out of bounds");
        }
    }

    public void addGoods(UnitOfGoods unit){
        if(getFullVolume()+unit.getVolume()  <= volume)
        {
            goods.add(unit);
            logger.log(Level.INFO,"Goods was added");
        }
        else{
            logger.log(Level.WARNING,"Volume out of bounds");
        }
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
