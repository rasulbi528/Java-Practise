package prpexam1;

import java.util.*;


public class lar_neg_array{
    static void larneg(int a[]){
   int max=0,count=0,start=0,i;
   for(i=0;i<a.length-1;i++){
     if(a[i]<0){
         count++;
     }
     int x=count;
     count=0;
     if(x > max && start<i-1){max=count;
     start++;
     }
       }
  op1=start;
  op2=i;
   
   }
       
    
    public static void main(String[] args) {
        int a[]={1,2,3,-5,5,-5,-6,10,-1,-2,-3};
        larneg(a);
        System.out.println(op1+" "+op2);
    }
    public static  int op1,op2;
}