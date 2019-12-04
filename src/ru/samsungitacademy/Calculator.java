package ru.samsungitacademy;

import static java.lang.Math.pow;

public class Calculator {

    public int sum(int x, int y){
        return x+y;
    }
    public int divide(int x, int y){
        return x/y;
    }
    public int multiply(int x,int y){
        return x*y;
    }
    public double line(int x){
        double m=1;
        for (int i=0; i<10; i++){
            if (i%2==0)
                m+=( -(i+2) / ( (i+3) *pow (x,(i+1) ) ) );
            else
                m+=( (i+2) / ( (i+3) *pow (x,(i+1) ) ) );
        }
        return m;
    }
}
