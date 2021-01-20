package com.company.Commands;

import com.company.Coffee.CoffeeType;
import com.company.Coffee.PackageType;
import com.company.Van.UnitOfGoods;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsFinder implements Command {
    ArrayList<UnitOfGoods> goods;
    public GoodsFinder(ArrayList<UnitOfGoods> goods) {
        this.goods = new ArrayList<>(goods);
    }

    private boolean checkIf(boolean[] rules, UnitOfGoods good, CoffeeType type, int price, String name){
        if(rules[0]){
            if(good.getCoffee().getType() != type) return false;
        }
        if(rules[1]){
            if(good.getCoffee().getPrice() > price) return false;
        }
        if(rules[2]){
            if(!good.getCoffee().getName().toUpperCase().equals(name.toUpperCase())) return false;
        }
        return true;
    }
    private CoffeeType getCoffeeType(Scanner in){
        int choice;
        CoffeeType type;
        do {
            System.out.println("Бажаний тип кави?\n1)Зернова\n2)Мелена\n3)Розчинна");
            choice = in.nextInt();
            type = CoffeeType.getType(choice);
            if (type != null) break;
            else {
                System.out.println("Error! Try again....");
            }
        } while (true);
        return type;
    }
    private boolean[] getChoice(Scanner in){
        boolean[] rules = {false,false,false};
        int choice;
        for (int i = 0; i < 3; i++){
            choice = in.nextInt();
            if(choice > 0 && choice <= 3){
                rules[choice - 1] = true;
            }
            else{
                break;
            }
        }
        return rules;
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
        rules = getChoice(in);
        if(rules[0]) {
            type = getCoffeeType(in);
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
            if(checkIf(rules, o, type, price,name)){
                System.out.println(o.toString());
                result.add(o);
            }

        }
        return result;
    }
}
