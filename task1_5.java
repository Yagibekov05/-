public class Main {
    public static void test (int b) {
        if (b >= 0){
            System.out.println("Pos");
        }
        else{
            System.out.println("Neg");
        }
    }
     public static void main (String[] args) {
        test (111);
        test(-111);
     }
}
