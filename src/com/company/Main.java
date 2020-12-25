/**
 * 13. Фургон кави. Завантажити фургон певного об’єму вантажем на певну суму з різних
 * видів кави, що може знаходитися у різних фізичних станах (зернова, мелена,
 * розчинна в банках і пакетиках). Враховувати об’єм кави разом з упаковкою.
 * Здійснити сортування товарів на основі співвідношення ціни та ваги. Знайти товар у
 * фургоні, що відповідає заданому діапазону параметрів якості.
 * @version 0.1
 * @Author Andriy Litvinyuk
 */
package com.company;
import com.company.Commands.*;
import com.company.Van.Van;
import java.util.Scanner;


public class Main {
    public static void printMenu(){
        System.out.println("1)Здійснити сортування товарів на основі співвідношення ціни та ваги.\n" +
                "2)Знайти товар у фургоні, що відповідає заданому діапазону параметрів якості.\n" +
                "3)Вивести всі товари на екран\n" +
                "0)Вийти з програми");
    }

    public static void main(String[] args) {
        Van van = new Van(1000);
        CommandExecutor goodsCommands = new CommandExecutor();
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = in.nextInt();

            switch (choice){
                case 1: {
                    goodsCommands.executeCommand(new GoodsFinder(van.getGoods()));
                    break;
                }
                case 2: {
                    goodsCommands.executeCommand(new GoodsSort(van.getGoods()));
                    break;
                }
                case 3: {
                    goodsCommands.executeCommand(new GoodsPrinter(van.getGoods()));
                    break;
                }
                default:break;
            }
        }while(choice!=0);
    }
}
