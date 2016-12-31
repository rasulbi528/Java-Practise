package prpexam1;

import java.util.*;

public class prime {

    static void calprime(int n) {
        list1 = new ArrayList();
        boolean flag=true;
        list1.add(2);
        for (int i = 3; i <= n; i += 2) {
           Iterator<Integer> itr=list1.iterator();
           while(itr.hasNext()){
            if(i % (itr.next())==0){
               flag=false;
               break;
            }  
           }
           if(flag)
               list1.add(i);
         flag=true;  
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long time1 = System.currentTimeMillis();
        calprime(n);
        long time2 = System.currentTimeMillis();
        System.out.println(list1);
        System.out.println(time2 - time1);
    }
    public static ArrayList<Integer> list1;

}
