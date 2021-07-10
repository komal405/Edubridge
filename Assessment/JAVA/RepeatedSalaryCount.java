import java.util.*;
class RepeatedSalaryCount{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Size of array:");
int n=sc.nextInt();
if(n<0){
System.out.println("Invalid Input");
System.exit(0);
}
System.out.println("Enter Salaries:");
int arr[]=new int[n];
int i;
for (i=0;i<n;i++){
if(arr[i]<0){
System.out.println("Invalid Input");
System.exit(0);
}
else{
arr[i]=sc.nextInt();
}
}
System.out.println(" ");
for (i=0;i<n;i++){
System.out.print(arr[i]+" ");
}
int count=0;
System.out.println();
for( i = 0; i < arr.length; i++) {  
for(int j = i + 1; j < arr.length; j++) {  
if(arr[i] == arr[j]) {
count=count+1;
System.out.println("Repeted Salary count:"+count);  
 }  
}  
}
}
}