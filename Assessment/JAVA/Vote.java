import java.util.*;
class Vote{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter age");
int age=sc.nextInt();
if(age>=18){
System.out.println("Person is eligible to vote");
}
else{
System.out.println("Person is not eligible to vote");
}

}
}