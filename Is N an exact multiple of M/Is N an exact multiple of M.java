public class Main
{
	public static void main(String[] args) {
	    int val=0;
	    int input1=24;
	    int input2=8;
	    if(input1==0 || input2==0) val=3;
	    else if((input1%input2)!=0) val=1;
	    else val=2;
		System.out.println(val);
	}
}