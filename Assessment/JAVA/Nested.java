import java.util.*;
class Nested {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int x = sc.nextInt();
int y = sc.nextInt();
if( x == 10) {
        if( y == 20 ) {
        	System.out.print("x = 10 and y = 20");
         }
         else{
	System.out.println("x="+x+"y="+y);
	}

           }
else{
	System.out.println(" Value Not Matching");
	}

   }
}