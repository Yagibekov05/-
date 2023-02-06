public class Main {
    public static boolean check(int a) {
        return (a < 0);
    }

    public static void main (String[] args) {
        System.out.println(check (20));
        System.out.println(check (-20));
    }
}
