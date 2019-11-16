/**
 * Simple Java program for StringBuilder
 * @author R.GOPALAKRISHNAN
 * @author gopalakrishnanr94@gmail.com
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
 
public class Sample 
{

	public static void main(String[] args) 
	{
		String s=new String("James Bond");
		
		StringBuilder s1=new StringBuilder("hello");
		
		
		
		s+="OO7";
		
		System.out.println("length of s1 ="+s1.length());
		
		System.out.println(s.toUpperCase());
		
		System.out.println(s.toLowerCase());
		
		//s.concat("vhjvhj");//it not work
		
		s1.append("hi");
		
		System.out.println("length of s1 ="+s1.length());
		
		System.out.println(s1);
		
		System.out.println(s);
		
		System.out.println("LastIndex="+s.lastIndexOf("b"));
		System.out.println("Charat="+s.charAt(3));
		
		

	}

}
