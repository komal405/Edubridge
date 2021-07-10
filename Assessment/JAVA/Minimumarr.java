//Insert an element in array 
//Deletr element from array 
//Search element in Array
//Minimum number in array
//Maximum no in array


import java.util.Scanner;
 
public class Minimumarr
{
   public static void main(String args[])
   {
int sml, size=10, i;
int Arr[] = new int[50];
Scanner scan = new Scanner(System.in);
System.out.print("Enter array elements : ");
for(i=0; i<=size; i++){
      Arr[i] = scan.nextInt();
  }
sml = Arr[0];
for(i=0; i<size; i++){ 
     if(sml > Arr[i]){
               sml = Arr[i];
       }
 }
 System.out.print("Smallest Element = " + sml); 
 }
}
 
