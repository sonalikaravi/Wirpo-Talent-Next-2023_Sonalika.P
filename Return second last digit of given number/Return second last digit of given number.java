public class Main
{
	public static void main(String[] args) {
	    int input1=126;
	    
	    if (input1>=-9&&input1<=9)
	    System.out.println(-1);
	    
        if(input1<0)
        input1*=-1;
        input1/=10;
        int n=input1%10;
        System.out.println(n);
    }
}