import java.util.*;
class SmallestNum{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter Numbers");
int num1=sc.nextInt();
int num2=sc.nextInt();
if(num1<num2){
System.out.println("Smaller Number is:"+num1);
}
else{
System.out.println("Smaller Number is:"+num2);
}

}
}