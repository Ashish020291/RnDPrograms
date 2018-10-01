package test;

public class Gupta_stringspaces {
String str=" a  s h   is h ";
int l,space=0;boolean b=false;
public String removespaces(String s)
{
	l=s.length();
	char[] charr = new char[l];
	for(int i=0;i<l;i++)
	{
		if((s.charAt(i)) ==' ')
		{
			space=space+1;
			continue;
			//s.replace(" ", "");
		}
		charr[i] = s.charAt(i);
	}
	
	String sad = charr.toString();
	s.replaceAll(" ", "");
	System.out.println(space + s);
	return sad;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gupta_stringspaces s= new Gupta_stringspaces();
		System.out.println("original string= " + s.str);
		String st=s.removespaces(s.str);
		for (int i = 0; i < s.str.length(); i++) {
			
		}
		
		System.out.println("updated string is = "+st);
	}

}
