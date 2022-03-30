import java.util.Scanner;
class Disk{
    public static void main(String args[]){
           Scanner in=new Scanner(System.in);
           int s,b,t;
           t=in.nextInt();
           s=in.nextInt();
           b=in.nextInt();
           System.out.println("Capacity of each disk is:"+(2*s*t*b*512));
}
}
