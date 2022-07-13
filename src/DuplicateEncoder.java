import java.util.ArrayList;
import java.util.List;

public class DuplicateEncoder {
    static String encode(String word) {

        char[] ch = word.toLowerCase().toCharArray();
        char c;
        int index = 0;
        List<String> result = new ArrayList<>();
        boolean ifFind;

        for (int i = 0; i < ch.length; i++) {
            ifFind = false;
            index = i;
            c = ch[i];
            for (int j = 0; j < ch.length; j++) {
                if (j == index)
                    continue;
                if (c == ch[j]) {
                    result.add(")");
                    ifFind = true;
                    break;
                }
            }
            if (!ifFind)
                result.add("(");
        }
        return result.toString().replaceAll("[^()]", "");
    }
}
