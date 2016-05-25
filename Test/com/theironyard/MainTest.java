package com.theironyard;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by will on 5/25/16.
 */
public class MainTest {
    static final String TEST_FILE = "test.json";
    @Test
    public void saveAndLoad() {
        //making fake player object:
        Player player = new Player();
        player.name = "Test Player";
        player.weapon = "Test Weapon";
        player.location = "Test Location";

        Main.saveGame(player, TEST_FILE);
        Player newPlayer = Main.loadGame(TEST_FILE);

        File f = new File(TEST_FILE);
        f.delete();

        assertTrue(newPlayer != null); // want to make sure this isn't null
        assertTrue(newPlayer.name.equals(player.name)); // pulling ame out of new player and then making sure its equal
        // to player name
        assertTrue(newPlayer.location.equals(player.location));
    }
}