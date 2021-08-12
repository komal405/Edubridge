interface Computer
{
     public void m1();
}
 
class User implements Computer{
String  firstName,lastName;
int age;
  public void m1() {
        System.out.println("This"+firstName+" "+lastName+" is Buing my computer");
    }
 
}
 
class User2 extends User
{

 public void m2() {
        System.out.println("This"+firstName+" "+lastName+" is Buing my computer");
    }
    
}
 
class hybrid
{
    public static void main(String[] args)
    {
        User2 u = new User2();
 
        u.firstName = "John";
        u.lastName = "Smith";
       
 
        System.out.println(u.m2());
 
    }
}