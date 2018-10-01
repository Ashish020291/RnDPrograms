package test;

class MyException extends Exception
{
 private int ex;
 MyException(int a)
 {
  ex=a;
 }
 public String toString()
 {
  return "MyException[" + ex +"] is less than zero";
 }
}

class Test_2
{
 static void sum(int a,int b)
 {
  if(a<0)
  {
   try {
	throw new MyException(a);
} catch (MyException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} //calling constructor of user-defined exception class
  }
  else
  {
   System.out.println(a+b);
  }
 }

 public static void main(String[] args)
 {
  sum(-10, 10);
 }
}