import java.util.*;
class StringPal
{
 public static boolean palindromecheck(String s)
 {
  if(s.length()==0 || s.length() ==1)
    {
    return true;
    }
  if(s.charAt(0)==s.charAt(s.length()-1))
   {
    return palindromecheck(s.substring(1,s.length()-1));
   }
   return false;
 }

	public static void main(String[] args)
  {
  	Scanner in=new Scanner(System.in);
    System.out.println("Enter String : ");
    String s=in.nextLine();
    if(palindromecheck(s))
    {
      System.out.println(s+" is a palindrome.");
    }
    else
    {
      System.out.println(s+" is not a palindrome.");
    }
  }
}