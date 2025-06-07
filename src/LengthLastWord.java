public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        int counter = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                counter++;
            }
            if (counter != 0 && s.charAt(i) == ' ') {
                return counter;
            }
        }
        return counter;
    }
}
