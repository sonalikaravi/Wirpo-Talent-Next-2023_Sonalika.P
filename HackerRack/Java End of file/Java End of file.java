import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int c =1;
       while(sc.hasNext())
       {
           String s = sc.nextLine();
           System.out.println(c+" "+s);
           c++;
       }
    }
}
