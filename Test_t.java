package test;




class MException extends Exception
{
 private int ex;
 MException(int a)
 {
  ex=a;
 }
 public String toString()
 {
  return "MyException[" + ex +"] is less than zero";
 }
}

class Test_t
{
 static void sum(int a,int b) throws MException
 {
  if(a<0)
  {
   throw new MException(a); //calling constructor of user-defined exception class
  }
  else
  {
   System.out.println(a+b);
  }
 }

 public static void main(String[] args)
 {
  try
  {
   sum(-10, 10);
  }
  catch(MException me)
  {
   System.out.println(me); //it calls the toString() method of user-defined Exception
  }
 }
}

class a_1
{
	public void trying()
	{
		try
		{
			
		}
		finally {
			
		}
	}
}