public class ShortestWord {
    public static int findShort(String str) {
        int min = Integer.MAX_VALUE;
        String[] arr = str.split(" ");
        for (String s : arr) {
            if (s.length() < min)
                min = s.length();
        }
        return min;
    }
}
