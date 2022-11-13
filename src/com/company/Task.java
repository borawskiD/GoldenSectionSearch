package com.company;

public class Task {
    double k = 0.6;
    double a = -10;
    double b = 10;
    double epsilon = 0.0001;
    public void run(){
        //k =  ( Math.sqrt( 5 ) - 1 ) / 2; - if better precision is needed
        double xl = b-(b - a) * k;
        double xr = a+(b - a) * k;

        while (!(b - a < epsilon)){
            System.out.println("Obecna wartosc parametrow:");
            System.out.println("a = " + a);
            System.out.println("xl = " + xl);
            System.out.println("f(xl) = " + F(xl));
            System.out.println("xr  = " + xr);
            System.out.println("f(  = " + xr);
            System.out.println("b  = " + b);
            double fl = F(xl);
            double fr = F(xr);
            if (fl > fr){
                a = xl;
                xl = xr;
                xr = a+(b - a) * k;

            } else if (fl < fr){
                b = xr;
                xr = xl;
                xl = b-(b - a) * k;
            }
            if (b - a < epsilon){
                System.out.println("Przekroczono wymagana dokladnosc");
            }
        }
        System.out.println("Wynik miesci sie w przedziale [a,b]:");
        System.out.println("[" + a + ", " + b + "]");
        System.out.println("Punkt srodkowy przedzialu: x = " + (a + b) / 2 + " f(x) = " + F( (a + b) / 2));
    }
    public double F(double x){
        return 3*x*x - 4 * x - 3;
    }
}
