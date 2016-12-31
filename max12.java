package prpexam1;

import java.util.*;
import java.util.stream.IntStream;
public class max12
{
    static void getmax(int a[])
    {
    int temp1=a[0];int temp2=0;
    int n=a.length;
   for(int i=0;i<n;i++){
       if(temp1!=a[i]){
           temp2=a[i];
         
       
       if(temp1<temp2){
          int atemp=temp1;
          temp1=temp2;
          temp2=atemp;}
       }
       
   }
   boolean contains = IntStream.of(a).anyMatch(x -> x ==0);
     if(contains==true)
    System.out.println(temp1+" "+temp2);
      else if(temp1!=0 && temp2!=0)
          System.out.println(temp1+" "+temp2);
      else
       System.out.println(temp1+" "+null);
    }
    
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=s.nextInt();
       }
       getmax(a);
    }
}