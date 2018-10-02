import java.util.*;
class Maxocc
{
	public static char MaxChar(String s)
	{
		int [] count = new int[300];
		int i;
		for(i=0;i<s.length();i++)
		{
			count[s.charAt(i)]++;
		}
		int max=-1;
		char result=' ';
    for(i=0;i<s.length();i++)
    {
     if(max<count[s.charAt(i)])
     {
     	max=count[s.charAt(i)];
     	result =s.charAt(i);
     }
	}
	return result;
    }
    
    public static void main(String[] args)
    {  
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter String : ");
    	String s=in.nextLine();
    	System.out.println("Maximum occurring character in string is "+MaxChar(s));
    }
}