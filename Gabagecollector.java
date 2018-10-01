package test;

public class Gabagecollector {

	public void finalize(){System.out.println("object is garbage collected");}  
	 public static void main(String args[]){  
		 Gabagecollector s1=new Gabagecollector();  
		 Gabagecollector s2=new Gabagecollector();  
	  s1=null;  
	  s2=null;  
	  System.gc(); 
	
	 }  


}
