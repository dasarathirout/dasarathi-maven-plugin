package com.rout.dasarathi.message.arts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.rout.dasarathi.plugin.message.arts.TextArt.ART_MATRIX;

public class TextArtTest {
    private static final int CHARACTER_HEIGHT = 11;
    private static final int CHARACTER_MIN = 0;
    private static final int CHARACTER_MAX = 128;

    @Test
    void charactersHeightTest() {
        int characterIndex;
        StringBuilder mergedArtLine = new StringBuilder();
        for (characterIndex = CHARACTER_MIN; characterIndex < CHARACTER_MAX; characterIndex++) {
            StringBuilder artSubLine = new StringBuilder();
            for (int height = 0; height < CHARACTER_HEIGHT; height++) {
                Assertions.assertEquals(CHARACTER_HEIGHT, ART_MATRIX.get(characterIndex).size(), "Size Should Be 11");
                artSubLine.append(System.lineSeparator()).append(ART_MATRIX.get(characterIndex).get(height));
            }
            mergedArtLine.append(artSubLine);
        }
        // System.out.println(String.format("Character: %c | Index: %d ", (char) characterIndex, characterIndex));
        System.out.println(mergedArtLine);
    }
}
