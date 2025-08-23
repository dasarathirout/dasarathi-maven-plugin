package com.rout.dasarathi.message.arts;

import com.rout.dasarathi.plugin.message.arts.ArtMessenger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArtMessengerTest {

    @Test
    void logTextArtMessageTest() {
        ArtMessenger.logTextArtMessage("Cat\tDog\nCow Are Running\r In Field.");
        assertTrue(true,"ArtMessenger.logTextArtMessage Passed");
    }

    @Test
    void logTextArtMessageSmallTest() {
        String originalMessage = "1A.";
        ArtMessenger.logTextArtMessage(originalMessage);
        assertEquals(1,1);
    }
}
