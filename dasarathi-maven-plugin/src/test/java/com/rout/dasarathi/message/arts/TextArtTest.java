package com.rout.dasarathi.message.arts;

import org.junit.jupiter.api.Test;

import static com.rout.dasarathi.plugin.message.arts.TextArt.ART_MATRIX;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextArtTest {
    private static final int CHARACTER_HEIGHT_12 = 12;
    private static final int CHARACTER_MIN = 0;
    private static final int CHARACTER_MAX = 127;

    @Test
    void charactersHeightTest() {
        int characterIndex;
        StringBuilder mergedArtLine = new StringBuilder();
        for (characterIndex = CHARACTER_MIN; characterIndex < CHARACTER_MAX; characterIndex++) {
            StringBuilder artSubLine = new StringBuilder();
                for (int height = 0; height < CHARACTER_HEIGHT_12; height++) {
                    assertEquals(CHARACTER_HEIGHT_12, ART_MATRIX.get(characterIndex).size(),
                            "CharArt Size Should Be 12. characterIndex: "+ characterIndex+" => "+ (char) characterIndex );
                    artSubLine.append(System.lineSeparator()).append(ART_MATRIX.get(characterIndex).get(height));
                }
            mergedArtLine.append(artSubLine);
            System.out.println(mergedArtLine);
            }
    }

    @Test
    void charactersWidthTest() {
        int characterIndex;
        StringBuilder mergedArtLine = new StringBuilder();
        for (characterIndex = CHARACTER_MIN; characterIndex < CHARACTER_MAX; characterIndex++) {
            StringBuilder artSubLine = new StringBuilder();
            int currentWidth=0;
            for (int height = 0; height < CHARACTER_HEIGHT_12; height++) {
                if(height==0){
                    currentWidth=ART_MATRIX.get(characterIndex).get(height).length();
                }else{
                    assertEquals(currentWidth,ART_MATRIX.get(characterIndex).get(height).length(),
                            "Text Art Should Have Fixed Width For Each CharArt : "+characterIndex+" => "+ (char) characterIndex );
                }
                artSubLine.append(System.lineSeparator()).append(ART_MATRIX.get(characterIndex).get(height));
            }
            mergedArtLine.append(artSubLine);
        }
        System.out.println(mergedArtLine);
    }
}
