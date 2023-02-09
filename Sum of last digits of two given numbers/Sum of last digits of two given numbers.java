public class Main
{
	public static void main(String[] args) {
	    int input1=126;
	    int input2=856;

        if(input1<0)
        input1*=-1;
        
        if(input2<0)
        input2*=-1;
        
        int x=input1%10;
        int y=input2%10;
        int sum = x+y;
        System.out.println("Sum:"+sum);
    }
}