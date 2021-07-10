import java.util.*;
public class electricity{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
float unit=sc.nextFloat();
if(unit<=50){
double amount=unit*0.50;
System.out.println("Charge="+amount);
}
else if(unit<=150){
double amount=25+(unit-50)*0.75;
System.out.println("Charge="+amount);
}
else if(unit<=250){
double amount=100+(unit-150)*1.20;
System.out.println("Charge="+amount);
}
else{
double amount=220+(unit-250)*1.50;
System.out.println("Charge="+amount);
}

}

}