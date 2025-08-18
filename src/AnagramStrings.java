import java.util.HashMap;
import java.util.Map;

public class AnagramStrings {
    public static boolean checkIsAnagramMethod1(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> charMapS = new HashMap<>();
        generateCharacterFrequencies(s, charMapS);

        Map<Character, Integer> charMapT = new HashMap<>();
        generateCharacterFrequencies(t, charMapT);

        return charMapS.equals(charMapT);
    }

    private static void generateCharacterFrequencies(String s, Map<Character, Integer> charMap) {
        for (char c : s.toCharArray()) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }
    }
}
