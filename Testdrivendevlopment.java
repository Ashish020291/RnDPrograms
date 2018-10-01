package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testdrivendevlopment {
	private Calculator c= new Calculator();
@Test
public void Sumofpositivenum()
{
	int possum=c.add(2, 4);
	int expected=6;
	Assert.assertEquals(expected, possum);
}
@Test
public void Sumofnegativenum()
{
	int negsum=c.add(-2, -4);
	int expected=-6;
	Assert.assertEquals(expected,negsum);
}
}

class Calculator
{
	public int add(int a, int b)
	{
		return (a+b);
	}
}