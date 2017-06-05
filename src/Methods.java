/**
 * Created by stanislav on 01.06.2017.
 */

public class Methods {
    private static final double PHI = (1 + Math.sqrt(5)) / 2;

    private static double f(double x){
        return Math.pow(x , 2)*2 - 12 * x;
    }

    static void bisection(double x, double y, double z){
        double eps=1;
        double a=x;
        double b=y;

        while(b-a > eps){
            double c = (a+b)/2;
            if(f(c)>=0)
                b=c;
            else
                a=c;
            z = ((a + b) / 2);
            System.out.println(z + ", ");
        }

        System.out.println("Ответ: "+" " +  z);
    }

    static void dichotomy(double x, double y, double z){
        double eps=0.001;
        double a=x;
        double b=y;

        while(b-a > eps){
            double c = (a+b)/2;
            if(f(c)>=0)
                b=c;
            else
                a=c;
            z = ((a + b) / 2);
            System.out.println(z + ", ");
        }
        System.out.println("Ответ: " +  z);
    }

    static void bust(double a, double b){
        double max = -100;
        for(double i = a; i < b; i++){
            double y = f(i);
            System.out.println("Сравниваем " + y + " и " + max);
            if(y > max) max = y;
        }
        System.out.println("Максимум равен: " + max);
    }

    static void golden_findMin(double a, double b, double e){
        double x1, x2;
        int iterator = 0;
        while (true){
            x1 = b - (b - a) / PHI;
            x2 = a + (b - a) / PHI;
            System.out.println("ITER_NUM: "+iterator + " X1="+x1 +"\t X2=" +x2);
            if (f(x1) >= f(x2))
                a = x1;
            else
                b = x2;
            if (Math.abs(b - a) < e)
                break;
            iterator++;
        }
    }
}