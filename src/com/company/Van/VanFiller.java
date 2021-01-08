package com.company.Van;

import com.company.Coffee.*;

import java.util.ArrayList;

public class VanFiller {
    private static Coffee createCoffee(int index, PackageType type, int units){
        Coffee coffee;
        if(index < units /3){
            coffee = new BeansCoffee(type);
        }
        else if(index <( units - units /3) ){
            coffee = new GroundCoffee(type);
        }
        else{
            coffee = new InstantCoffee(type);
        }
        return coffee;
   }
    public static Van Fill(int volume, int price, PackageType type){
        if(volume == 0) return null;
        if(price == 0) return null;
        int units = Coffee.names.length;
        Van new_van = new Van(volume);
        ArrayList<UnitOfGoods> goods = new ArrayList<>();
        Coffee coffee;

        for(int i = 0; i < units; i++){
            coffee = createCoffee(i, type, units);
            if(coffee.getPrice()*(volume/ units) < price/ units){
                goods.add( new UnitOfGoods( coffee, volume/ units));
            }
            else{
                int subtract = 1;
                while(true){
                    if( (volume/ units - subtract) <= 0 ) return null;
                    if(coffee.getPrice()*(volume/ units - subtract) < price/ units){
                        goods.add( new UnitOfGoods( coffee, (volume/ units - subtract)));
                        break;
                    }
                    subtract++;
                }
            }
        }

        new_van.addGoods(goods);
        return new_van;
    }
}
