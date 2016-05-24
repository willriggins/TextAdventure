package com.theironyard;

import java.util.ArrayList;

/**
 * Created by will on 5/18/16.
 */
public class Player extends Character{
    String weapon;
    String location;
    ArrayList<String> items = new ArrayList<>(); // new variable called items, containing strings

    public Player() {
        this.health = 20;
        this.damage = 20;
    }

    public void chooseName() {
        System.out.println("What is your name?");
        name = Main.nextLine(); // if String was in front of name, would be a local variable.
        System.out.printf("Welcome, %s\n", name); // local variables only live inside of the method. after method ends, they do too
    }

    public void chooseWeapon() throws Exception {
        System.out.println("Choose your weapon [sword/mace]");
        weapon = Main.nextLine();

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
        location = Main.nextLine();

        if (location.equalsIgnoreCase("forest")) {
            System.out.println("Entering forest...");
        } else if (location.equalsIgnoreCase("tunnel")) {
            System.out.println("Entering tunnel...");
        } else {
            throw new Exception("Invalid location chosen!");
        }
    }

    public void findItem(String item) {
        System.out.printf("You found %s! Pick it up? [y/n]\n", item);
        String answer = Main.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            items.add(item);
            System.out.printf("You now have %s items.\n", items.size());
        }
    }
}

