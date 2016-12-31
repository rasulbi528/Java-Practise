package prpexam1;

import java.util.*;

public class charcount{
    
    static void  mostOccCharInWord(String str,boolean r){
        
       if(r==true){
           String str1=str.toLowerCase();
            char[] st1=str1.toCharArray();
        //System.out.println(st.length);
           HashMap<Character,Integer> hp1=new HashMap<Character,Integer>();
        
      for(char ct:st1)
          if(hp1.containsKey(ct))
              hp1.put(ct,hp1.get(ct)+1);
      else
          hp1.put(ct,1);
      int max=0;
    Set<Character> hs=hp1.keySet();
   
    for(char s:hs){
        int k=hp1.get(s);
        if(k>max)
           max=k;    
    }
  
    for(char st2:hs)
         if(hp1.get(st2)==max)
             System.out.println(st2+" :"+hp1.get(st2));
      
       }
      if(r==false){
      char[] st=str.toCharArray();
        //System.out.println(st.length);
        HashMap<Character,Integer> hp=new HashMap<Character,Integer>(); 
        
      for(char ct:st)
          if(hp.containsKey(ct))
              hp.put(ct,hp.get(ct)+1);
      else
          hp.put(ct,1);
      int max=0;
   Set<Character> hs=hp.keySet();

    for(char s:hs){
        int k=hp.get(s);
        if(k>max)
     
           max=k;  
       
    }
    for(char st1:hs)
         if(hp.get(st1)==max)
             System.out.println(st1+" :"+hp.get(st1));
      }
    }
    public static void main(String[] args) {
      mostOccCharInWord("GayatriVidyaParishadCollegeofEngineering", false); 
      mostOccCharInWord("GayatriVidyaParishadCollegeofEngineering", true);  
        mostOccCharInWord("IiiiIIaaaa", false); 
      mostOccCharInWord("IiiiIIaaaa", true);
    }
    
}