import java.util.Scanner;
class Forexample{
  public static void main(String args[])throws Exception{
   Scanner sc=new Scanner(System.in);
   int sum=0,product=1,n;
   n=sc.nextInt();
   for(int i=1;i<=n;i++){
   if(n%i==0){
     sum+=i;
     product*=i;
}}
System.out.println(product-sum);
}}
   