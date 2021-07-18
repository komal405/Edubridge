class MethedOverloading{
void Area(int a,int b){
int c=a*b;
System.out.println("Area of Rectangle:"+c);
}
void Area(int r){
float  c=(float)(3.14*r*r);
System.out.println("Area of Circle:"+c);
}
public static void main(String args[]){
MethedOverloading m=new MethedOverloading();
m.Area(5,8);
m.Area(4);
}
}