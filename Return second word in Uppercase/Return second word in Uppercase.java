public class Main
{
	public static void main(String[] args) 
	{
	    String input1="Wipro Technologies Bangalore";
	    String s[]=input1.split(" ");
        if(s.length==1)
        System.out.println("LESS");
        String s1=s[1];
        s1=s1.toUpperCase();
        System.out.println(s1);
	}
}