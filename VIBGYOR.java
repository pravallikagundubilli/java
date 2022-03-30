import java.io.*;
class VIBGYOR{
  public static void main(String args[])throws Exception{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter a Character:");
char ch;
ch=(char)br.read();

switch(ch)
{
case 'Y':
case 'y':
 System.out.println("Yellow");
 break;
case 'R':
case 'r':
System.out.println("Red");
 break;
case 'G':
case 'g':
System.out.println("Green");
 break;
case 'B':
case 'b':
System.out.println("Blue");
 break;
case 'O':
case 'o':
System.out.println("Orange");
 break;
case 'I':
case 'i':
System.out.println("Indigo");
 break;
case 'V':
case 'v':
System.out.println("Violet");
 break;
default:
 System.out.println("Not in VIBGYOR");
 break;
}}}