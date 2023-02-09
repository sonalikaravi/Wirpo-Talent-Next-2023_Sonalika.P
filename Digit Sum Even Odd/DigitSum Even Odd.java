public class Main
{
	public static void main(String[] args) 
	{
	    int input1=12345;
	    String input2="odd";
	    if(input2.equals("odd"))
        {
            int sum=0;
            while (input1>0)
            {
                int r=input1%10;
                if(r%2==1)
                {
                    sum+=r;
                }
                input1/=10;
            }
            System.out.println(sum);
        }
        else
        {
            int sum=0;
             while (input1>0)
            {
                int r=input1%10;
                if(r%2==0)
                {
                    sum+=r;
                }
                input1/=10;
            }
            System.out.println(sum);
        }
	}
}
