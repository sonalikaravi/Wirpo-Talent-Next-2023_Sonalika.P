public class Main
{
	public static void main(String[] args) {
	    int a=0;
        int b=1;
        int c=0;
        int d=3;
        
        int input1=9;
        
        while(d<=input1)
        {
            c=a+b;
            a=b;
            b=c;
            d++;
        }
        System.out.println(c);
		
	}
}