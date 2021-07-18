import java.util.*;
class AddStud{
Scanner sc=new Scanner(System.in);
int age,mark1,mark2;
String Name;
void m1(){
System.out.println("Enter your Name and Age");
Name=sc.next();
age=sc.nextInt();
mark1=sc.nextInt();
mark2=sc.nextInt();
}
}
class DisplaytStud extends AddStud{
void m2(){
System.out.println("Explain Details");
System.out.println("Name:"+Name);
System.out.println("Age:"+age);
int res=((mark1+mark2)/200)*100;
System.out.println("Result of "+Name+": "+res);
}
public static void main(String args[]){
DisplayStud b=new DisplayStud();
b.m1();
b.m2();
}
}