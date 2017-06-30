class X
{
   public void methodX()
   {
     System.out.println("Class X method in X class");
   }
}
class Y extends X
{
public void methodX()
{
System.out.println("class X method in Y class ");
}
}
class Z extends Y
{
   public void methodX()
   {
     System.out.println("class x method in Z class");
   }
   public static void main(String args[])
   {
     X obj = new Z();
     //obj.methodX(); //calling grand parent class method
     obj.methodX(); //calling parent class method
     X obj1 = new Y();
     obj1.methodX();
   
     
     
  }
}