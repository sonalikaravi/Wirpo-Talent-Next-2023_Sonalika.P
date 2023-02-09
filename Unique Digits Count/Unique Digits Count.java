public class Main
{
	public static void main(String[] args) {
	    int c=0,r,i;
	    int input1=2932;
        int h[]=new int[10];
        while(input1>0)
        {
            r=input1%10;
            h[r]++;
            input1=input1/10;
        }
        for(i=0;i<10;i++)
        {
            if(h[i]>0)
            {
                c++;
            }
        }
        System.out.println(c);
	}
}