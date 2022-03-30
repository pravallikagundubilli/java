import java.util.Scanner;
import java.lang.Math;
class Herons
{
public static void main(String args[])
{
int a,b,c;
float s,area;
System.out.println("enter the values of a,b,c");
Scanner cp=new Scanner(System.in);
a=cp.nextInt();
b=cp.nextInt();
c=cp.nextInt();
s=(a+b+c)/3;
area=(s*(s-a)*(s-b)*(s-c));
System.out.println(Math.sqrt(area));
}
}