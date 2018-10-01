package test;

public class gupta_swapwithtwovar {

	int x=1,y=-1;
	public void swap(int a, int b)
	{
		System.out.println("variables values before swap: " + "a = " + a + " b =" + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("variables values after swap: " + "a = " + a + " b =" + b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gupta_swapwithtwovar s= new gupta_swapwithtwovar();
		s.swap(s.x,s.y);
	}

}
