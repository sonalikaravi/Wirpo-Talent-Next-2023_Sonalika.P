public class Main
{
	public static void main(String[] args) {
	    int count=0;
	    int input1=11;
        for(int i=1;i<=input1;i++)
        {
            if(input1%i==0)count++;
        }
        if(count==2)
        System.out.println(2);
        else 
        System.out.println(1);
	}
}