class Fibo{
public static void main(String args[]){
int a, b, c, i, n;
i=1;
n = 10;
a = 1;
b=1; 
while(i<n) {
c = a + b; 
System.out.print(" ");
System.out.print(c);
a = b;
b = c;
i++;
}
}
}