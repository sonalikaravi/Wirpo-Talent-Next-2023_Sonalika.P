public class Main
{
	public static void main(String[] args) 
	{
	    int k=2;
	    int input1=4;
	    int input2=54;
	    int d=input1,i,c=0;
	    int p=0;
	    int cou=0;
	    
	    while(d<=input2)
	    {
	        for(i=2;i<d;i++)
	        {
	            if(d%i==0)
	                c++;
	            
	        }
	        if(c==0)
	        {
	            cou++;
	            System.out.println(d);
	            
	        }
	        d++;
	        c=0;
	        
	    }
	     System.out.println(cou);
    }    
}