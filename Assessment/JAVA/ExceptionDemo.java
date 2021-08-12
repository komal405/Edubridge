class ExceptionDemo{
try{
int arr[]={1,2,3,4,5,6,7,8};
void add(int n){
arr[arr.length+1]=n;
}
}
catch(ArrayIndexOutOfBoundException e){
System.out.println(e);
}
public static void main(String args[]){
ExceptionDemo e=new ExceptionDemo();
e.add(7);
}
}