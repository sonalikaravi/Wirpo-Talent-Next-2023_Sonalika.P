import java.math.BigDecimal;

public class Main
{
	public static void main(String[] args) 
	{
	    String input1="345";
	    String input2="123";
	    BigDecimal x=new BigDecimal(input1);
	    BigDecimal y=new BigDecimal(input2);
		System.out.println(String.valueOf(x.add(y)));
	}
}
