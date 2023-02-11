public class Main
{
	public static void main(String[] args) 
	{
	    String input1= "The Good The Bad and The Ugly";
	    String word[]=input1.split(" ");  
	    int sum=0;  
	    for(int i=0;i<word.length;i++)  
	    {          
	        sum+=word[i].length();  
	        
	    }   
	    System.out.println(1 + (sum-1) %9);
	}
}