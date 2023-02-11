public class Main
{
	public static void main(String[] args) 
	{
	    int input1=32509;
	    double sum=0.0; 
        String str=Integer.toString(input1);   
        for(int i=0;i<str.length()-1;i++)
        {   
            int a=Character.getNumericValue(str.charAt(i)); 
            int b=Character.getNumericValue(str.charAt(i+1));   
            sum=sum + Math.pow(a, b);  
        } 
		System.out.println((int)sum+1);
	}
}