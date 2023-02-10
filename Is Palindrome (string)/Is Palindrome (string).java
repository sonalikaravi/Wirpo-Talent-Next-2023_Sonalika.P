public class Main
{
	public static void main(String[] args) 
	{
	    String input1="MADAM";
	    String str=input1.toLowerCase();
        String str1="";
        for(int i=str.length()-1;i>=0;i--)
        {
            str1+=str.charAt(i);
        }
        if(str.equals(str1))
        System.out.println(2);
        else
        System.out.println(1);
	}
}