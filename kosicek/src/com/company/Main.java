package com.company;

public class Main {

    public static void main(String[] args) {

        String[] shop = {"houska", "rohlik", "redbull", "polstar", "rajce", "burger", "kvetinac", "svicka", "chleba", "okurka"};
        int[] price = {1, 2, 50, 80, 20, 60, 80, 15, 10, 12};
        int finalPrice = 0;

        if(args[0].equals("help")){
            for (int i = 0; i < shop.length; i++) {
                System.out.println(i + ") " + shop[i] + " - cena: " + price[i]);
            }
            return;
        }

        int[] index = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            index[i] = Integer.parseInt(args[i]);
            price[i] = price[index[i]];
            finalPrice += price[i];
        }

        for (int i = 0; i < args.length; i++) {
            args[i] = shop[Integer.parseInt(args[i])];
        }

        System.out.print("cena: " + finalPrice + " pro: ");
        for (String result : args) {
            System.out.print(result + ", ");
        }
    }
}
