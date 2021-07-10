import java.util.*;
class Swap{
public static void main(String s[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter First Num:");
int x= sc.nextInt();
System.out.println("Enter Second  Num:");
int y=sc.nextInt();
int temp;
temp=x;
x=y;
y=temp;
System.out.println("Swap Numbers");
System.out.print("x=");
System.out.println(x);
System.out.print("y=");
System.out.println(y);
}
}