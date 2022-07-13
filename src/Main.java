
public class Main {

    public static void main(String[] args) {

        System.out.println(Troll.digital_root(458));
        System.out.println("lk;asfjlas;dkjfl;skad");
    }
}

class Troll {

    public static int digital_root(int n) {

        if (n < 10)
            return n;
        else {
            return digital_root(Integer.sum(n % 10, n / 10));
        }

    }
}
