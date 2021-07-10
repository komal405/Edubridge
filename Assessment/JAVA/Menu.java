import java.util.*;
class Menu{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter 1 for Area of Circle");
System.out.println("Enter 2 for Area of Triangle");
System.out.println("Enter 3 for Area of Square");
System.out.println("Enter 4 for Area of Rectangle");
System.out.println("Enter A Number:  ");
int n=sc.nextInt();
if(n==1){
System.out.println("Enter Radius:");
Double r=sc.nextDouble();
Double Area=3.14*r*r;
System.out.println("Area of Circle = "+Area);
}
else if(n==2){
System.out.println("Enter hight & breath of Triangle:");
int h=sc.nextInt();
int b=sc.nextInt();
int Area2=h*b*1/2;
System.out.println("Area of Triangle = "+Area2);
}
else if(n==3){ 
System.out.println("Enter value of Side of Square");
float a=sc.nextInt();
float Area3=a*a;
System.out.println("Area of Square = "+Area3);
}
else if(n==4){
System.out.println("Enter Length & breath of Rectangle");
int l=sc.nextInt();
int b1=sc.nextInt();
int Area4=l*b1;
System.out.println("Area of Triangle = "+Area4);
}
else{
System.out.println("Enter a valid Number");
}

}
}