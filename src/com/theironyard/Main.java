package com.theironyard;

import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

        Enemy ogre = new Enemy("Ogre", 10, 10);
        player.battle(ogre);
        System.out.println(player);
        System.out.println(ogre);

    }

    public static String nextLine() {
        String line = scanner.nextLine();
        while (line.startsWith("/")) {
            if (line.equals("/inv")) {
                for (String item : player.items) {
                    System.out.println(item);
                }
            }
            else if (line.equals("/save")) {
                saveGame();
            }
            else {
                System.out.println("Command not found.");
            }

            line = scanner.nextLine();
        }
        return line;
    }

    public static void saveGame() {
        //class for going from object to string in JsonLibrary: Serializer
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.include("*").serialize(player); //.inlude("*") makes it include everything

        File f = new File("game.json");
        try {
            FileWriter fw = new FileWriter(f);
            //rest of method should be in the try!
            fw.write(json);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
