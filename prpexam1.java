package prpexam1;

import java.util.*;

public class prpexam1
{
    @SuppressWarnings("empty-statement")
    static int sum(int n)
    {
        int i=0;
    String str=n.toString(n);
    System.out.println(str);
    int len=str.length();
    String st[]=new String[len];
     int sum=0;
    int j=len;
    System.out.println(j);
    for(i=0;i<len;i++)
    {
        int a=str[i];
        
    }
    return sum;
    }
    
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
     int y= sum(n);
      System.out.println(y);  
    }
}