package com.rout.dasarathi.music;

import com.rout.dasarathi.plugin.music.MP3Player;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;


public class MP3PlayerTest {

    private static final String RESOURCE_MP3_FILE = "RT.mp3";

    private MP3Player mp3Player;

    @BeforeEach
    void setUp() {
        mp3Player = new MP3Player();
    }

    @AfterEach
    void tearDown() {
        mp3Player = null;
    }

    @Test
    @Timeout(10)
    void testPlayMusic() {
        try {
            mp3Player.playMusic(RESOURCE_MP3_FILE);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //
        }
    }

    @Test
    @Timeout(60)
    void testPlayExecutor() {
        try {
            mp3Player.play();
            Thread.sleep(60 * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //
        }
    }

}
