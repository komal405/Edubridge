import java.util.*;
class AddStud{
Scanner sc=new Scanner(System.in);
int age,mark1,mark2;
String Name;
void m1(){
System.out.println("Enter your Name ");
Name=sc.next();
System.out.println("Enter your age ");
age=sc.nextInt();
System.out.println("Enter your Marks 1 ");
mark1=sc.nextInt();
System.out.println("Enter your Marks 2 ");
mark2=sc.nextInt();
}
}
class StudDetails extends AddStud{
void m2(){
System.out.println("Explain Details");
System.out.println("Name:"+Name);
System.out.println("Age:"+age);
System.out.println("Result of "+Name+":"+"Sub1: "+mark1+"   sub2: "+mark2);
}
}
class Result extends StudDetails {
void m3(){
float add=(float)(mark1+mark2);
float res=(add/200)*100;
System.out.println("Result of "+Name+":  "+res+"%");
}
public static void main(String args[]){
Result b=new Result();
b.m1();
b.m2();
b.m3();
}
}