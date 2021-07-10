import java.util.*;
class AreaVolumeEquation{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value for square: ");
int a=sc.nextInt();
int ac=a*a;
System.out.println("Area of Circle= " +ac);
System.out.println("Ener value for hight and breath of triangle: ");
int h=sc.nextInt();
int b=sc.nextInt();
int at=h*b/2;
System.out.println("Area of Triangle= " +at);
int volume=a*a*a;
System.out.println("volume of cube= " +volume);
System.out.println("Enter values for equation B2-4ac");
int B=sc.nextInt();
int c=sc.nextInt();
int eq=B*2-4*a*c;
System.out.println("B2-4ac="+eq);
}
}