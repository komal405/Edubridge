import java.util.*;
class Reverse{
public static void main(String s[]){
Scanner sc= new Scanner(System.in);
System.out.print("Enter number: ");
int dig = sc.nextInt();
int r=0;
while(dig != 0)   
{  
int remainder = dig % 10;  
r = r * 10 + remainder;  
dig = dig/10;  
}  
System.out.println("reverse number is: " + r);   
  
}
}