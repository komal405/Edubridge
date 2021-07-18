import java.util.*;
class FtoC{

float convertToCentigrade(float x){
float c=((x-32)*5)/9;
System.out.printf("%.2f", c);
return c;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
float f=sc.nextFloat();
FtoC t=new FtoC();
t.convertToCentigrade(f);




}
}