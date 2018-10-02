import java.util.*;
class Togglecase
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
        System.out.println("Enter String : ");
		String str=s.nextLine();
		s.close();
		char[] ch=str.toCharArray();
		int i;
		for(i=0;i<ch.length;i++)
		{
			if(Character.isUpperCase(ch[i]))
			{
				ch[i]=Character.toLowerCase(ch[i]);
				System.out.print(ch[i]);
			}
            else if(Character.isLowerCase(ch[i]))
            {
                ch[i]=Character.toUpperCase(ch[i]);
                System.out.print(ch[i]);
            }
        }
	}
}