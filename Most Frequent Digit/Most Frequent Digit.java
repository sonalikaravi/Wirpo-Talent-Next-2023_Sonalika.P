public class Main
{
	public static void main(String[] args) 
	{
	    int input1=123;
        int input2=345;
        int input3=567;
        int input4=673;
	    int arr[]={input1,input2,input3,input4};
        int temp[]=new int[10];
        int num;
        for(int i=0;i<arr.length;i++)
        {   num=arr[i];
            while(num!=0)
            {
                int n=num%10;
                temp[n]++;
                num/=10;
            }
        }
        int max=-1;
        int x=0;
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]>=max)
            {
                max=temp[i];
                x=i;
            }
        }
    System.out.println(x);
	}
}
