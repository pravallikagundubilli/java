import java.util.Scanner;
class Swapping{
    public static void main(String args[]){
           Scanner in=new Scanner(System.in);
           int a,b;
           int temp;
           System.out.println("Enter the values of a,b:");
           a=in.nextInt();
           b=in.nextInt();
           System.out.println("Values of a and b before swapping are:"+ a+" "+b);
           temp=a;
           a=b;
           b=temp;
           System.out.println("Values of a and b after swapping using 3rd variable are: "+ a+" "+b);
           System.out.println("Enter the values of a,b:");
           a=in.nextInt();
           b=in.nextInt();
           System.out.println("Values of a and b before swapping are:"+ a+" "+b);
           a=a*b;
           b=a/b;
           a=a/b;
           System.out.println("Values of a and b after swapping without using 3rd variable are: "+ a+" "+b);
}}