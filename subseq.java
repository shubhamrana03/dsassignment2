import java.util.*;
class subseq
{
 public static void printsub(String ip,String op)
 {
 	if(ip.length()==0)
 	{
 		System.out.println(op);
 		return;
 	}
 	printsub(ip.substring(1),op);
 	printsub(ip.substring(1),op + ip.charAt(0));
 }
 public static void main(String[] args)
 {
 	Scanner in=new Scanner(System.in);
 	System.out.println("Enter String : ");
 	String s=in.next();
 	String str=" ";
 	printsub(s,str);
 }
}