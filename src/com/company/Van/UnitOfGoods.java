package com.company.Van;

import com.company.Coffee.Coffee;

public class UnitOfGoods implements Comparable<UnitOfGoods> {
    private Coffee coffee;
    private int volume;
    public UnitOfGoods(Coffee coffee,int volume){
        this.coffee = coffee;
        this.volume = volume;
    }
    public Coffee getCoffee(){
        return coffee;
    }
    public int getVolume(){
        return volume;
    }
    public int  getUnitPrice(){
        return coffee.getPrice();
    }
    public int getFullPrice(){
        return coffee.getPrice() * volume;
    }
    @Override
    public String toString() {
        return coffee.toString() + " | Volume:" + volume + " | FullPrice:" + getFullPrice();
    }

    @Override
    public int compareTo(UnitOfGoods o) {
        return Integer.compare((o.volume + o.getFullPrice()) / 2, (volume + getFullPrice()) / 2);
    }
}
