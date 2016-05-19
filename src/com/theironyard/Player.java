package com.theironyard;

import java.util.ArrayList;

/**
 * Created by will on 5/18/16.
 */
public class Player {
    String name;
    String weapon;
    String location;
    ArrayList<String> items = new ArrayList<>(); // new variable called items, containing strings

    public void chooseName() {
        System.out.println("What is your name?");
        name = Main.scanner.nextLine(); // if String was in front of name, would be a local variable.
        System.out.println("Welcome, " + name); // local variables only live inside of the method. after method ends, they do too
    }

    public void chooseWeapon() throws Exception {
        System.out.println("Choose your weapon [sword/mace]");
        weapon = Main.scanner.nextLine();

        if (weapon.equalsIgnoreCase("sword")) {
            System.out.println("Sword is a fine choice!");
        }
        else if (weapon.equalsIgnoreCase("mace")) {
            System.out.println("Mace is a fine choice!");
        }
        else {
            throw new Exception("Invalid weapon chosen!");
        }
    }

    public void chooseLocation() throws Exception {
        System.out.println("Choose your location [forest/tunnel]");
        location = Main.scanner.nextLine();

        if (location.equalsIgnoreCase("forest")) {
            System.out.println("Entering forest...");
        } else if (location.equalsIgnoreCase("tunnel")) {
            System.out.println("Entering tunnel...");
        } else {
            throw new Exception("Invalid location chosen!");
        }
    }

    public void findItem(String item) {
        System.out.println("You found " + item + "! Pick it up? [y/n]");
        String answer = Main.scanner.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            items.add(item);
            System.out.println("You now have " + items.size() + " items.");
        }
    }
}

