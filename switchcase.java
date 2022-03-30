import java.io.*;
class Vowel{
  public static void main(String args[])throws Exception{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
char ch;
ch=(char)br.read();
System.out.println("Enter a Character:");
switch(ch)
{
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':
 System.out.println("Vowel");
 break;
default:
 System.out.println("Not a Vowel");
 break;
}}}