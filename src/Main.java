/**
 * Created by stanislav on 16.05.2017.
 */

class Main{
    public static void main(String[] args) {
        System.out.println("\t_____bisection_____");
        Methods.bisection(0, 10, 1);
        System.out.println("\n\t_____dichotomy_____");
        Methods.dichotomy(0, 10, 1);
        System.out.println("\n\t_____golden_findMin_____");
        Methods.golden_findMin(0, 10, 1);
        System.out.println("\n\t_____bust_____");
        Methods.bust(0, 10);
    }
}