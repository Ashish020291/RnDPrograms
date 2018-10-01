package test;

class Test1
{
 static void check() throws ArithmeticException, ArrayIndexOutOfBoundsException
 {
  System.out.println("Inside check function");
  int arr[]= {1,2};
  arr[2]=5;
  throw new ArithmeticException("demo");
  
 }

 public static void main(String args[])
 {
  try
  {
   check();
  }
  catch(ArithmeticException e)
  {
   System.out.println("caught ashish: " + e);
  }
 }
}