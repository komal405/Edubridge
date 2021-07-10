import java.util.*;
class RevNum{  
public static void main(String[] args)   
{  
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int  reverse = 0;  
while(num != 0)   
{  
int r = num % 10;  
reverse = reverse * 10 + r;  
num = num/10;  
}  
System.out.println("The reverse of the given number is: " + reverse);  
if(num==reverse){
System.out.println("Num");  
System.out.println("Palindrom Number"+reverse);  
}
}  
}  