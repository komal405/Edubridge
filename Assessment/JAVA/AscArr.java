import java.util.Scanner;
class AscArr{
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int Arr[] = new int[10];
Scanner scan = new Scanner(System.in);
int temp;
System.out.print("Enter array elements : ");
for(int i=0; i<=5; i++){
      Arr[i] = scan.nextInt();
  }
 for (int i = 0; i <= 5; i++) {     
            System.out.print(Arr[i] + " ");    
        }    
for (int i = 0; i <= 5; i++) {     
for (int j = i+1; j <= 5; j++) {     
 if(Arr[i] > Arr[j]) {    
temp = Arr[i];    
 Arr[i] = Arr[j];                      
 Arr[j] = temp;                      
}     
}     
}
System.out.println(" ");      
System.out.print("Array in Ascending order ");      
for (int i = 0; i <= 5; i++) {   
System.out.print(Arr[i] + " ");      
}
}
}