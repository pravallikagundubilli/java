import java.util.Scanner;
class Areas{
    public static void main(String args[]){
           Scanner in=new Scanner(System.in);
           int r,s,l,b;
           r=in.nextInt();
           s=in.nextInt();
           l=in.nextInt();
           b=in.nextInt();
           System.out.println("Area of Square is:"+(s*s));
           System.out.println("Area of Circle is:"+(3.14*r*r));
           System.out.println("Area of Rectangle is:" + (l*b));
}
}
          
 