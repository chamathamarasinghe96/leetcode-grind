public class FindFirstNeedleInHeystack {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= (haystack.length() - needle.length()); i++) {
            if (needle.equals(haystack.substring(i, i + needle.length()))) {
                return i;
            }
        }
        return -1;
    }
}
