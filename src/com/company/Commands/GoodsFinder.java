package com.company.Commands;

import com.company.Coffee.CoffeeType;
import com.company.Van.UnitOfGoods;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsFinder implements Command {
    ArrayList<UnitOfGoods> goods;
    public GoodsFinder(ArrayList<UnitOfGoods> goods) {
        this.goods = new ArrayList<>(goods);
    }
    @Override
    public ArrayList<UnitOfGoods> execute() {
        Scanner in = new Scanner(System.in);
        CoffeeType type = null;
        boolean[] rules = {false, false, false};
        ArrayList<UnitOfGoods> result = new ArrayList<>();
        int choice, price = 0;
        String name = "";
        System.out.println("Виберіть бажані критерії:\n1)Тип кави\n2)Ціна\n3)Марка кави\n0)Кінець вибору");
        for (int i = 0; i < 3; i++){
            choice = in.nextInt();
            if(choice > 0 && choice <= 3){
                rules[choice - 1] = true;
            }
            else{
                break;
            }
        }
        if(rules[0]) {
            do {
                System.out.println("Бажаний тип кави?\n1)Зернова\n2)Мелена\n3)Розчинна");
                choice = in.nextInt();
                type = CoffeeType.getType(choice);
                if (type != null) break;
                else {
                    System.out.println("Error! Try again....");
                }
            } while (true);
        }
        if(rules[1]) {
            System.out.println("Введіть ціну менше якої бажаєте:");
            price = in.nextInt();
        }
        if(rules[2]){
            System.out.println("Введіть бажану марку кави:");
            name = in.next();
        }
        for (UnitOfGoods o:goods) {
            if(rules[0]){
                if(o.getCoffee().getType() != type) continue;
            }
            if(rules[1]){
                if(o.getCoffee().getPrice() > price) continue;
            }
            if(rules[2]){
                if(!o.getCoffee().getName().toUpperCase().equals(name.toUpperCase())) continue;
            }
            System.out.println(o.toString());
            result.add(o);
        }
        return result;
    }
}
