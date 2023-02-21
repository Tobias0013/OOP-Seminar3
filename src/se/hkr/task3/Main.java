package se.hkr.task3;

import java.util.Scanner;

public class Main {
    private static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        MyArrayList<Item> shoppingList = new MyArrayList<Item>();
        String choose = "";

        do {
            System.out.printf("1] Add items\n" +
                    "2] View items\n" +
                    "3] Quit\n");

            System.out.print("> ");
            choose = Sc.next();

            switch (choose){
                case "1":
                    shoppingList.add(addItem());
                    break;
                case "2":
                    showList(shoppingList);
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Enter a valid option");
                    break;
            }

        }while (!choose.equals("3"));
    }

    public static Item addItem(){
        String name;
        int quantity = -1;

        System.out.print("Name: ");
        name = Sc.next();

        do {
            System.out.print("Quantity: ");
            if (Sc.hasNextInt()){
                quantity = Sc.nextInt();
                break;
            }
            else {
                System.out.println("Quantity needs to be integer value");
                Sc.next();
            }

        }while (quantity < 1);

        return new Item(name, quantity);
    }

    public static void showList(MyArrayList<Item> items){
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }


}
