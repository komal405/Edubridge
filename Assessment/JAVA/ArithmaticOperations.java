import java.util.*;
class ArithmaticOperations{
public static void main(String s[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter First Num:");
int x= sc.nextInt();
System.out.println("Enter Second  Num:");
int y=sc.nextInt();
int add=x+y;
int sub=x-y;
int mul=x*y;
int div=x/y;
int mod=x%y;
System.out.print("Addition:     ");
System.out.println(add);
System.out.print("Substraction:    ");
System.out.println(sub);
System.out.print("Multiplication:    ");
System.out.println(mul);
System.out.print("Division:    ");
System.out.println(div);
System.out.print("Mod:      ");
System.out.println(mod);

}
}
