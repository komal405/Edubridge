import java.util.*;
class NetSal{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
System.out.println("Enter the employee name");
String name=scan.next();
System.out.println("Enter the basic salary of an employee");
int bsalary=scan.nextInt();
int HRA=(10/100)*bsalary;
int DA=(73/100)*bsalary;
int GS=bsalary+DA+HRA;
int incometax=(30/100)*GS;
int netsalary=GS-incometax;
System.out.println("Net Salary of "+name+" is : "+netsalary);
}
}