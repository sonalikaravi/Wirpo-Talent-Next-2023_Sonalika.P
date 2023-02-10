public class Main
{
	public static void main(String[] args)
	{
	    int sum=0,i,j;
	    int input1=5;
	    int input2=2;
	    int input3=3;
        for(i=0;i<input1;i++)
        {
            for(j=0;j<=i;j++)
            sum+=input2;
            input2=input2+input3;
        }
    	System.out.println(sum);
	}
}