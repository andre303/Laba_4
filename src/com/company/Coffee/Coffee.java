package com.company.Coffee;

public interface Coffee {
    String[] names = {"Lobadin Coffee Roasters", "Lavazza", "Paulig", "EGOISTE", "Carte Noire",
           "Bushido", "Illy", "Живой Кофе", "Kimbo", "Nespresso", "Nescafe", "Tassimo"};
    int[] prices = {4, 4, 4, 3, 3, 3, 2, 2, 2, 1, 1, 1};
    int getPrice();
    CoffeeType getType();
    String getName();
    PackageType getPackageType();
    String toString();

}
