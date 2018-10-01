package test;

public class Gupta_Sortingstring {

	public static void main(String[] args) {
		// sorting of string
		String arr1[]= { "tan", "tan", "yog","par", "poz" };
		int len=arr1.length;
		
		for(int i=0;i<arr1.length;i++)
		{
			for (int j=i+1;j<len;j++)
			{
				if((arr1[i].compareTo(arr1[j])>0 || arr1[i].compareTo(arr1[j])==0) )
				{
					String temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
							
				}
			}
		}
		
		for(int i=0;i<len;i++)
		{
			System.out.println(arr1[i]); 
		}
	}

}
