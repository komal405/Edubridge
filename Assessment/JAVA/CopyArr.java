//copy 1 array  to another
//binary search
import java.util.*;
class CopyArr{
public static void main(String args[]){
Scanner sc=new Scanner(System.out);
int i;
int Arr[] = new int[10];
int Arr2[]=new int[Arr.length];
System.out.print("Enter array elements : ");
for( i=0; i<=10; i++){
Arr[i] = scan.nextInt();
  }
System.out.print("First Array ");    
for ( i = 0; i <= 10; i++) {     
System.out.print(Arr[i] + " ");    
 }    

for(i=0;i<=10;++i){
Arr2[i]=Arr1[i];
}
System.out.print("Copy Array ");
for(i=0;i<Arr2.length;++i){
System.out.print(Arr2[i]+" ");
}
}
}
