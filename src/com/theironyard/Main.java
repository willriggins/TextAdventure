package com.theironyard;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Player player = new Player();

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome traveler!");

        player.chooseName();
        player.chooseWeapon();
        player.chooseLocation();

        player.findItem("armor");
        player.findItem("a potion");

//        System.out.println("Type a number...");
//        String num = scanner.nextLine();
//        int numInt = Integer.valueOf(num);
//
//        if (numInt < 0) {
//            System.out.println("That's a negative number!");
//        }
//        else {
//            System.out.println("That's a positive number!");
//        }

        //System.out.println(player.name);

    }

    public static String nextLine() {
        String line = scanner.nextLine();
        while (line.startsWith("/")) {
            if (line.equals("/inv")) {
                for (String item : player.items) {
                    System.out.println(item);
                }
            }
            else {
                System.out.println("Command not found.");
            }

            line = scanner.nextLine();
        }
        return line;
    }
}
