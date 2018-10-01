package test;

public class Gupta_firsttwovalues {

	int array[]= {9,2,-1,0,3,3,1,8}; int temp;
	int l=array.length;
	
	public void firsttwonum()
	{
		
		for(int i=0;i<l;i++)
		{
			
			for(int j=i+1;j<l;j++)
			{
				if(array[i]>array[j] || array[i]==array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			
			
		}
		
		System.out.println("****************sorted array***************");
		
		for(int i=0;i<l;i++)
		{
			
			
			System.out.println(array[i]);
			
		}
		
		
		System.out.println("***************max two values****************");
		for(int i=l-1;i>=l-2;--i)
		{
			
			System.out.println(array[i]);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gupta_firsttwovalues two= new Gupta_firsttwovalues();
		
		System.out.println("*****************unsorted array************************");
		
		for (int i=0;i<two.array.length;i++)
		{
			System.out.println(two.array[i]);
			
		}
	
		two.firsttwonum();
	
	}

}
