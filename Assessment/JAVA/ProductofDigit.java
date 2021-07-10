import java.util.*;
class ProductOfDigit{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
int num , a;
int p=1;
System.out.print("Enter any number : ");
num = scanner.nextInt();
if(num<0){
System.out.println("Invalid Input");
}
else if(num>32767){
System.out.println("Invalid Input");
}
else{
a = num;
while(a != 0) {
p = p* (a % 10);
a = a / 10;
 }
 System.out.println("Product of all digits in " + num + " : " + p);
}
}
}