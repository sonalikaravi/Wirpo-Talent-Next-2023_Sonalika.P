public class Main
{
	public static void main(String[] args) {
	    int c=0,r;
	    int input1=6509;
        while(input1>0)
        {
            r=input1%10;
            c++;
            input1=input1/10;
        }
         System.out.println(c);
	}
}