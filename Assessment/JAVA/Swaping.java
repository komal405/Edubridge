import java.util.*;
class Swaping{
public static void main(String s[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter First Num:");
int x= sc.nextInt();
System.out.println("Enter Second  Num:");
int y=sc.nextInt();
x=x+y;
y=x-y;
x=x-y;
System.out.println("Swap Numbers");
System.out.print("x=");
System.out.println(x);
System.out.print("y=");
System.out.println(y);
}
}