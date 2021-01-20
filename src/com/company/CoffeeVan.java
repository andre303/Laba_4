package com.company;

import com.company.Commands.CommandExecutor;
import com.company.Commands.GoodsFinder;
import com.company.Commands.GoodsPrinter;
import com.company.Commands.GoodsSort;
import com.company.Coffee.PackageType;
import com.company.Van.Van;
import com.company.Van.VanFiller;

import java.util.Scanner;

public class CoffeeVan {
    public void printMenu() {
        System.out.println("1)Здійснити сортування товарів на основі співвідношення ціни та ваги.\n" +
                "2)Знайти товар у фургоні, що відповідає заданому діапазону параметрів якості.\n" +
                "3)Вивести всі товари на екран\n" +
                "0)Вийти з програми");
    }

    public void Menu (Scanner in, Van van, CommandExecutor goodsCommands, int choice) {
        switch (choice) {
            case 1: {
                goodsCommands.executeCommand(new GoodsSort(van.getGoods()));
                break;
            }
            case 2: {
                goodsCommands.executeCommand(new GoodsFinder(van.getGoods()));
                break;
            }
            case 3: {
                goodsCommands.executeCommand(new GoodsPrinter(van.getGoods()));
                break;
            }
            default:
                break;
        }
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        Van van;
        int volume, money_amount;
        int choice;
        PackageType p_type;
        System.out.println("Введіть об'єм фургону:");
        volume = in.nextInt();
        System.out.println("Введіть кількість грошей:");
        money_amount = in.nextInt();
        System.out.println("Виберіть в чому буде зберігатись кава:\n1)Банки\n2)Пакетики:");
        choice = in.nextInt();
        if (choice == 1) p_type = PackageType.JAR;
        else p_type = PackageType.BAG;
        van = VanFiller.Fill(volume, money_amount, p_type);
        if (van == null) {
            System.out.println("ERROR");
            return;
        }
        CommandExecutor goodsCommands = new CommandExecutor();
        System.out.println(van.getVolume());
        System.out.println("Price for all:" + van.getFullPrice());
        System.out.println("Volume of all:" + van.getFullVolume());
        do {
            printMenu();
            choice = in.nextInt();
            Menu(in, van, goodsCommands, choice);
        } while (choice != 0);
    }
}
