import java.io.*;
class Employee{
  public static void main(String[] args)throws Exception{
   int empId;
    String ename,address;
    float salary;
   InputStreamReader isr=new InputStreamReader(System.in);
   BufferedReader br=new BufferedReader(isr);
System.out.println("Enter Employee ID , Name , Salary and address");
  empId=Integer.parseInt(br.readLine());
  ename=br.readLine();
  salary=Float.parseFloat(br.readLine());
  address=br.readLine();
  System.out.println("Employee Information");
  System.out.println(empId+" "+ename+" "+salary+" "+address);
}
}