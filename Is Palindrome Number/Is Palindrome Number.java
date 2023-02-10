public class Main
{
	public static void main(String[] args) 
	{
	    int input1=12321;
	    int temp=input1;
        int rev=0;
        while(input1>0)
        {
            rev=rev*10+input1%10;
            input1/=10;
        }
        if(rev!=temp)
        System.out.println(1);
        else
        System.out.println(2);
    }
}
