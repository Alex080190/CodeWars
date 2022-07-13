public class PangramChecker {
    public static boolean check(String sentence){
        long result = sentence.toLowerCase().chars().filter(c -> c >= 'a' && c <= 'z')
                .distinct().count();
        return result >= 26;
    }
}
