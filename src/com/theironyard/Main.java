package com.theironyard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome traveler!");
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Welcome, " + name);

        System.out.println("Choose your weapon [sword/mace]");
        String weapon = scanner.nextLine();

        if (weapon.equalsIgnoreCase("sword")) {
            System.out.println("Sword is a fine choice!");
        }
        else if (weapon.equalsIgnoreCase("mace")) {
            System.out.println("Mace is a fine choice!");
        }
        else {
            throw new Exception("Invalid weapon chosen!");
        }

        System.out.println("Choose your location [forest/tunnel]");
        String location = scanner.nextLine();

        if (location.equalsIgnoreCase("forest")) {
            System.out.println("Entering forest...");
        }
        else if (location.equalsIgnoreCase("tunnel")) {
            System.out.println("Entering tunnel...");
        }
        else {
            throw new Exception("Invalid location!");
        }
    }
}
