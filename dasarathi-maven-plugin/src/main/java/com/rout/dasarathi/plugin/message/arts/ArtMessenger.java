package com.rout.dasarathi.plugin.message.arts;

import java.util.List;

import static com.rout.dasarathi.plugin.message.arts.TextArt.ART_HEIGHT_12;
import static com.rout.dasarathi.plugin.message.arts.TextArt.ART_MATRIX;

public final class ArtMessenger {

    private ArtMessenger() {
    }

    public synchronized static void logTextArtMessage(final String userMessage) {
        final List<Character> characterList = getASCIIMessageCharacterList(cleanWhiteSpaceEscapeSequences(userMessage));

        final StringBuilder mergedRow = new StringBuilder();
        for (int row = 0; row < ART_HEIGHT_12; row++) {
            StringBuilder mergedColumn = new StringBuilder();
            for (int column = 0; column < characterList.size(); column++) {
                mergedColumn.append("").append(ART_MATRIX.get(characterList.get(column)).get(row));
            }
            mergedRow.append(System.lineSeparator()).append(mergedColumn);
        }
        System.out.println(mergedRow);
    }

    private synchronized static String cleanWhiteSpaceEscapeSequences(final String userMessage) {
        return "    "+userMessage.replaceAll("[\\t\\n\\r]", "");
    }

    private synchronized static List<Character> getASCIIMessageCharacterList(final String userMessage) {
        // Allowed Character Range [ 33,127 ]
        return userMessage
                .chars()
                .mapToObj(character -> (char) character)
                .filter(character -> (character >= 33 || character <= 127))
                .toList();
    }
}
