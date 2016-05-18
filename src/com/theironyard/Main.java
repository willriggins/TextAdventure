package com.theironyard;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome traveler!");

        Player player = new Player();

        player.chooseName();
        player.chooseWeapon();
        player.chooseLocation();
    }
}
