public class C4 {
    public static void main(String[] args){
        boolean t = true;
        boolean f = false;
        int numb_1 = 10;
        int numb_2 = 10;
        double sum = summ(numb_1, numb_2);
        if ((sum >= 10) && (sum <= 20)){
            System.out.println(t);
        }
        else {
            System.out.println(f);
        }
    }
    static double summ(double a, double b){
        return a + b;

    }
}
