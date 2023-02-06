public   {
    public static void main (String[] args){
        double numb_1 = 4;
        double numb_2 = 1;
        double numb_3 = 1;
        double numb_4 = 1;
        formula (numb_1, numb_2, numb_3, numb_4);
    }

    static void formula (double a, double b, double c, double d) {
        double f;
        f = a * (b + (c / d));
        System.out.println(f);
    }
}
