import java.util.Scanner;
import java.lang.Math;
class AreaHerons{
    public static void main(String args[]){
           Scanner in=new Scanner(System.in);
           int a,b,c;
           float s,d;
           a=in.nextInt();
           b=in.nextInt();
           c=in.nextInt();
           s=(a+b+c)/2;
           d=s*(s-a)*(s-b)*(s-c);
           System.out.println("Area of triangle is:"+Math.sqrt(d));
}}
           