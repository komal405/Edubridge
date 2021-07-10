import java.util.*;
class SimpleInetrest{
public static void main(String args[]){
float p, r, t, si;
Scanner sc = new Scanner(System.in);
System.out.print("Principal : ");
p = sc.nextFloat();
System.out.print("Rate of interest : ");
r = sc.nextFloat();
System.out.print("Time period : ");
t = sc.nextFloat();
si = (p * r * t) / 100;
 System.out.print("Simple Interest is: " +si);
}
}