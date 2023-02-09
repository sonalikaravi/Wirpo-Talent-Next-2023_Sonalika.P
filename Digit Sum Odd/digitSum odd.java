public class Main
{
	public static void main(String[] args) 
	{
	    int r,sum=0;
	    int input1=9584;
        while(input1>0)
        {
            r=input1%10;
            if(r%2==1)
            {
                sum=sum+r;
            }
            input1=input1/10;
        }
        System.out.println(sum);
		
	}
}