import java.util.*;
class Claculate{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int sal = sc.nextInt();
int shifts= sc.nextInt();
if(sal > 8000){
System.out.println("Salary too large ");
}
else if(shifts<0){
System.out.println ("Shifts too small");
}
else if(sal<0){
System.out.println("Salary too Small");
}
else{
double salary=sal*0.2+sal*0.3+sal*0.02*shifts;
System.out.println("Salary="+salary);
}
}
}