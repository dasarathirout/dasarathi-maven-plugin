package com.rout.dasarathi;

import org.junit.jupiter.api.Test;

public class ApplicationTest {
    @Test
    void doApplicationTest() {
        assert (true);
    }

    @Test
    void testSleepTestToPlayMusic() {
        try {
            Thread.sleep(5 * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            assert (true);
        }
    }

}
