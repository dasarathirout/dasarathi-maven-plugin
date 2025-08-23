package com.rout.dasarathi.plugin.message.arts;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;

public final class TextArt {

    public static final String BLANK=
"""
\s
\s
\s
\s
\s
\s
\s
\s
\s
\s
\s
""";

    public static final String SPACE=
"""
 \s
 \s
 \s
 \s
 \s
 \s
 \s
 \s
 \s
 \s
 \s
 """;

    private static final String CHAR_000 = BLANK;

    private static final String CHAR_001 = BLANK;

    private static final String CHAR_002 = BLANK;

    private static final String CHAR_003 = BLANK;

    private static final String CHAR_004 = BLANK;

    private static final String CHAR_005 = BLANK;

    private static final String CHAR_006 = BLANK;;

    private static final String CHAR_007 = BLANK;;

    private static final String CHAR_008 = BLANK;;

    private static final String CHAR_009 = BLANK;;

    private static final String CHAR_010 = BLANK;;

    private static final String CHAR_011 = BLANK;;

    private static final String CHAR_012 = BLANK;;

    private static final String CHAR_013 = BLANK;;

    private static final String CHAR_014 = BLANK;;

    private static final String CHAR_015 = BLANK;;

    private static final String CHAR_016 = BLANK;;

    private static final String CHAR_017 = BLANK;;

    private static final String CHAR_018 = BLANK;;

    private static final String CHAR_019 = BLANK;;

    private static final String CHAR_020 = BLANK;;

    private static final String CHAR_021 = BLANK;;

    private static final String CHAR_022 = BLANK;;

    private static final String CHAR_023 = BLANK;;

    private static final String CHAR_024 = BLANK;;

    private static final String CHAR_025 = BLANK;;

    private static final String CHAR_026 = BLANK;;

    private static final String CHAR_027 = BLANK;;

    private static final String CHAR_028 = BLANK;;

    private static final String CHAR_029 = BLANK;;

    private static final String CHAR_030 = BLANK;;

    private static final String CHAR_031 = BLANK;;

    private static final String CHAR_032 = BLANK;;

    private static final String CHAR_033 =
"""
   \s
 ███
░███
░███
░███
░███
░░░\s
 ███
░░░\s
   \s
   \s
""";

    private static final String CHAR_034 =
"""
     \s
 ██ ██
░██░██
░░ ░░\s
     \s
     \s
     \s
     \s
     \s
     \s
     \s
""";

    private static final String CHAR_035 =
"""
             \s
   ███  ███  \s
 ████████████\s
░░░███░░███░ \s
 ████████████\s
░░░███░░███░ \s
  ░░░  ░░░   \s
             \s
             \s
             \s
             \s
""";

    private static final String CHAR_036 =
"""
       \s
   ███ \s
  ██████
 ███░░░\s
░░█████\s
 ░░░░███
 ██████\s
░░░███ \s
  ░░░  \s
       \s
       \s
""";

    private static final String CHAR_037 =
"""
               \s
  ███        ███
 ░░░       ███░\s
         ███░  \s
       ███░    \s
     ███░      \s
   ███░        \s
 ███░       ███\s
░░░        ░░░ \s
               \s
               \s 
""";

    private static final String CHAR_038 =
"""
          \s
   ██████ \s
  ███░░███\s
 ░░██████ \s
  ██████  \s
░███░░███ \s
░███ ░░███\s
░░█████░███
 ░░░░░ ░░░\s
          \s
          \s
""";

    private static final String CHAR_039 =
"""
   \s
  ██
 ███
░░░\s
   \s
   \s
   \s
   \s
   \s
   \s
   \s
""";

    private static final String CHAR_040 =
"""
     \s
   ███
  ███\s
 ███ \s
░███ \s
░███ \s
░░███\s
 ░░███
  ░░░\s
     \s
     \s
""";

    private static final String CHAR_041 =
"""
     \s
 ███ \s
░░███\s
 ░░███
  ░███
  ░███
  ███\s
 ██░ \s
░░░  \s
     \s
     \s
""";

    private static final String CHAR_042 =
"""
              \s
      ███     \s
 ███ ░███  ███\s
░░░█████████░ \s
  ░░░█████░   \s
   █████████  \s
 ███░░███░░███\s
░░░  ░███ ░░░ \s
     ░░░      \s
              \s
              \s
""";

    private static final String CHAR_043 =
"""
           \s
           \s
     ███   \s
    ░███   \s
 ███████████
░░░░░███░░░\s
    ░███   \s
    ░░░    \s
           \s
           \s
           \s
""";

    private static final String CHAR_044 =
"""
   \s
   \s
   \s
   \s
   \s
   \s
   \s
  ██
 ██\s
░░ \s
   \s
""";

    private static final String CHAR_045 =
"""
         \s
         \s
         \s
         \s
██████████
░░░░░░░░░\s
         \s
         \s
         \s
         \s
         \s
""";

    private static final String CHAR_046 =
"""
  \s
  \s
  \s
  \s
  \s
  \s
  \s
 ██
░░\s
  \s
  \s
""";

    private static final String CHAR_047 =
"""
               \s
             ███
           ███░\s
         ███░  \s
       ███░    \s
     ███░      \s
   ███░        \s
 ███░          \s
░░░            \s
               \s
               \s
""";

    private static final String CHAR_048 =
"""
           \s
    █████  \s
  ███░░░███\s
 ███   ░░███
░███    ░███
░███    ░███
░░███   ███\s
 ░░░█████░ \s
   ░░░░░░  \s
           \s
           \s
""";

    private static final String CHAR_049 =
"""
     \s
 ████\s
░░███\s
 ░███\s
 ░███\s
 ░███\s
 ░███\s
 █████
░░░░░\s
     \s
     \s
""";

    private static final String CHAR_050 =
"""
          \s
  ████████\s
 ███░░░░███
░░░    ░███
   ███████\s
  ███░░░░ \s
 ███      █
░██████████
░░░░░░░░░░\s
          \s
          \s
""";

    private static final String CHAR_051 =
"""
         \s
  ████████
 ███░░░░██
░░░    ░██
   ██████░
  ░░░░░░██
 ███   ░██
░░████████
 ░░░░░░░░\s
         \s
         \s
""";

    private static final String CHAR_052 =
"""
           \s
 █████ █████
░░███ ░░███\s
 ░███  ░███\s
 ░██████████
 ░░░░░░░███░
       ░███░
       █████
      ░░░░░\s
           \s
           \s
""";

    private static final String CHAR_053 =
"""
          \s
 ██████████
░███░░░░░░█
░███     ░\s
░█████████\s
░░░░░░░░███
 ███   ░███
░░████████\s
 ░░░░░░░░ \s
          \s
          \s
""";

    private static final String CHAR_054 =
"""
          \s
  ████████\s
 ███░░░░███
░███   ░░░\s
░█████████\s
░███░░░░███
░███   ░███
░░████████\s
 ░░░░░░░░ \s
          \s   
          \s   
""";

    private static final String CHAR_055 =
"""
          \s
 ██████████
░███░░░░███
░░░    ███\s
      ███ \s
     ███  \s
    ███   \s
   ███    \s
  ░░░     \s
          \s
          \s
""";

    private static final String CHAR_056 =
"""
          \s
  ████████\s
 ███░░░░███
░███   ░███
░░████████\s
 ███░░░░███
░███   ░███
░░████████\s
 ░░░░░░░░ \s
          \s
          \s
""";

    private static final String CHAR_057 =
"""
          \s
  ████████\s
 ███░░░░███
░███   ░███
░░█████████
 ░░░░░░░███
 ███   ░███
░░████████\s
 ░░░░░░░░ \s
          \s
          \s
""";

    private static final String CHAR_058 =
"""
""";

    private static final String CHAR_059 =
"""
""";

    private static final String CHAR_060 =
"""
""";

    private static final String CHAR_061 =
"""
""";

    private static final String CHAR_062 =
"""
""";

    private static final String CHAR_063 =
"""
""";

    private static final String CHAR_064 =
"""
""";

    private static final String CHAR_065 =
"""
""";

    private static final String CHAR_066 =
"""
""";

    private static final String CHAR_067 =
"""
""";

    private static final String CHAR_068 =
"""
""";

    private static final String CHAR_069 =
"""
""";

    private static final String CHAR_070 =
"""
""";

    private static final String CHAR_071 =
"""
""";

    private static final String CHAR_072 =
"""
""";

    private static final String CHAR_073 =
"""
""";

    private static final String CHAR_074 =
"""
""";

    private static final String CHAR_075 =
"""
""";

    private static final String CHAR_076 =
"""
""";

    private static final String CHAR_077 =
"""
""";

    private static final String CHAR_078 =
"""
""";

    private static final String CHAR_079 =
"""
""";

    private static final String CHAR_080 =
"""
""";

    private static final String CHAR_081 =
"""
""";

    private static final String CHAR_082 =
"""
""";

    private static final String CHAR_083 =
"""
""";

    private static final String CHAR_084 =
"""
""";

    private static final String CHAR_085 =
"""
""";

    private static final String CHAR_086 =
"""
""";

    private static final String CHAR_087 =
"""
""";

    private static final String CHAR_088 =
"""
""";

    private static final String CHAR_089 =
"""
""";

    private static final String CHAR_090 =
"""
""";

    private static final String CHAR_091 =
"""
""";

    private static final String CHAR_092 =
"""
""";

    private static final String CHAR_093 =
"""
""";

    private static final String CHAR_094 =
"""
""";

    private static final String CHAR_095 =
"""
""";

    private static final String CHAR_096 =
"""
""";

    private static final String CHAR_097 =
"""
""";

    private static final String CHAR_098 =
"""
""";

    private static final String CHAR_099 =
"""
""";

    private static final String CHAR_100 =
"""
""";

    private static final String CHAR_101 =
"""
""";

    private static final String CHAR_102 =
"""
""";

    private static final String CHAR_103 =
"""
""";

    private static final String CHAR_104 =
"""
""";

    private static final String CHAR_105 =
"""
""";

    private static final String CHAR_106 =
"""
""";

    private static final String CHAR_107 =
"""
""";

    private static final String CHAR_108 =
"""
""";

    private static final String CHAR_109 =
"""
""";

    private static final String CHAR_110 =
"""
""";

    private static final String CHAR_111 =
"""
""";

    private static final String CHAR_112 =
"""
""";

    private static final String CHAR_113 =
"""
""";

    private static final String CHAR_114 =
"""
""";

    private static final String CHAR_115 =
"""
""";

    private static final String CHAR_116 =
"""
""";

    private static final String CHAR_117 =
"""
""";

    private static final String CHAR_118 =
"""
""";

    private static final String CHAR_119 =
"""
""";

    private static final String CHAR_120 =
"""
""";

    private static final String CHAR_121 =
"""
""";

    private static final String CHAR_122 =
"""
""";

    private static final String CHAR_123 =
"""
""";

    private static final String CHAR_124 =
"""
""";

    private static final String CHAR_125 =
"""
""";

    private static final String CHAR_126 =
"""
""";
    private static final String[] ART_ARRAY = {
            CHAR_000, CHAR_001, CHAR_002, CHAR_003, CHAR_004, CHAR_005, CHAR_006, CHAR_007, CHAR_008,
            CHAR_009, CHAR_010, CHAR_011, CHAR_012, CHAR_013, CHAR_014, CHAR_015, CHAR_016, CHAR_017,
            CHAR_018, CHAR_019, CHAR_020, CHAR_021, CHAR_022, CHAR_023, CHAR_024, CHAR_025, CHAR_026,
            CHAR_027, CHAR_028, CHAR_029, CHAR_030, CHAR_031, CHAR_032, CHAR_033, CHAR_034, CHAR_035,
            CHAR_036, CHAR_037, CHAR_038, CHAR_039, CHAR_040, CHAR_041, CHAR_042, CHAR_043, CHAR_044,
            CHAR_045, CHAR_046, CHAR_047, CHAR_048, CHAR_049, CHAR_050, CHAR_051, CHAR_052, CHAR_053,
            CHAR_054, CHAR_055, CHAR_056, CHAR_057, CHAR_058, CHAR_059, CHAR_060, CHAR_061, CHAR_062,
            CHAR_063, CHAR_064, CHAR_065, CHAR_066, CHAR_067, CHAR_068, CHAR_069, CHAR_070, CHAR_071,
            CHAR_072, CHAR_073, CHAR_074, CHAR_075, CHAR_076, CHAR_077, CHAR_078, CHAR_079, CHAR_080,
            CHAR_081, CHAR_082, CHAR_083, CHAR_084, CHAR_085, CHAR_086, CHAR_087, CHAR_088, CHAR_089,
            CHAR_090, CHAR_091, CHAR_092, CHAR_093, CHAR_094, CHAR_095, CHAR_096, CHAR_097, CHAR_098,
            CHAR_099, CHAR_100, CHAR_101, CHAR_102, CHAR_103, CHAR_104, CHAR_105, CHAR_106, CHAR_107,
            CHAR_108, CHAR_109, CHAR_110, CHAR_111, CHAR_112, CHAR_113, CHAR_114, CHAR_115, CHAR_116,
            CHAR_117, CHAR_118, CHAR_119, CHAR_120, CHAR_121, CHAR_122, CHAR_123, CHAR_124, CHAR_125,
            CHAR_126
    };
    public static final List<String> TEXT_ART_LIST = Collections.synchronizedList(List.of(ART_ARRAY));
    public static final int ART_HEIGHT=11;

    public static final List<List<String>> ART_MATRIX=
            Collections.synchronizedList(
            TEXT_ART_LIST
            .stream()
            .map(characterTextArt->
                    characterTextArt
                            .lines()
                            .toList()
            ).toList());
}
