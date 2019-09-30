package javaapplication1;
/*
// M Firdaus Iqbal R
// NIM 19360014
*/
import java.util.Scanner;
import static java.lang.System.out;
public class rumushambatan {
    private static double seri (double R1,double R2,double R3){
        return (R1+R2+R3);
    }
    private static double paralel(double R1,double R2,double R3){
        return (1/(1/R1+1/R2+1/R3));
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double R1,R2,R3;
        out.println("Masukan Nilai");
        out.print("Hambatan 1 : ");R1=input.nextDouble();
        out.print("Hambatan 2 : ");R2=input.nextDouble();
        out.print("Hambatan 3 : ");R3=input.nextDouble();
        out.println("Seri : "+seri(R1,R2,R3));
        out.println("Paralel : "+paralel(R1,R2,R3));
        
    }
}
