import java.utol.*;
class Super{
void sum(){
int a=10,b=40;
int c= a+b;
System.out.println("Sum of two numbers: "+c);
}
}
class SuperExample{
void sum(){
int x=5,y=10,z=30;
int s=x+y+z;
System.out.println("Sum of 3 Numbers: "+s);
super.sum();
}
public static void main(String args[]){
SuperExample se=new SuperExample();
se.sum();
}
}