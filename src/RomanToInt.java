import java.util.List;

class RomanToInt {
    public int romanToInt(String s) {
        int result = 0;
        char[] chars = s.toCharArray();

        List<Character> romanChars = List.of('I', 'V', 'X', 'L', 'C', 'D', 'M');
        List<Integer> charVal = List.of(1, 5, 10, 50, 100, 500, 1000);

        for (int i = 0; i < chars.length - 1; i++) {
            if (charVal.get(romanChars.indexOf(chars[i])) < charVal.get(romanChars.indexOf(chars[i + 1])))
                result -= charVal.get(romanChars.indexOf(chars[i]));
            else
                result += charVal.get(romanChars.indexOf(chars[i]));
        }

        result += charVal.get(romanChars.indexOf(chars[chars.length - 1]));

        return result;
    }
}