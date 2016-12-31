package prpexam1;

import java.util.*;
import java.io.*;
import java.lang.*;

public class negarray
{
    public static void main(String args[])
    {
       int a[]={5, -9, -4, -7, -1, -2, 6, 2, 6, 55};
        int sum=0,sum1=0,start=0,i;
       for(i=0;i<a.length-1;i++)
       {
           if(a[i]<0){
          sum=sum+a[i];i++;
          while(sum<0  && start<=i-1)
          {
              sum=sum+a[i];
            if(sum1<=sum)  {sum1=sum;}
              start++;
          }
         
       }}
        if(sum1>=sum)
          {
             System.out.println(start+" "+i);
          }
    }
}