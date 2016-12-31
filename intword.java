package prpexam1;

import java.util.*;
public class intword{
    
    static void commonChars(String st1,String st2,boolean r){
        
        char str1[]=new char[st1.length()];
        char str2[]=new char[st2.length()];
        str1=st1.toCharArray();
        str2=st2.toCharArray();
         TreeSet<Character> set1=new TreeSet();
          TreeSet<Character> set2=new TreeSet();
           TreeSet<Character> set3=new TreeSet();
          TreeSet<Character> set4=new TreeSet();
           TreeSet<Character> set5=new TreeSet();
          TreeSet<Character> set6=new TreeSet();
         
        if(r==true){
            for(int i=0;i<str1.length;i++){
               if(Character.isLowerCase(str1[i])){
                   set3.add(str1[i]);}
               if(Character.isUpperCase(str1[i])){
                   set4.add(str1[i]);
               }
            }
             for(int i=0;i<str2.length;i++){
               if(Character.isLowerCase(str2[i])){
                   set5.add(str2[i]);}
               if(Character.isUpperCase(str2[i])){
                   set6.add(str2[i]);
               }
            }
             set3.retainAll(set5);
             set4.retainAll(set6);
          output1=set3;
          output2=set4;
            
        }
        if(r==false){
       
        for(int i=0;i<str1.length;i++){
            set1.add(str1[i]);
        }
      
        for(int i=0;i<str2.length;i++){
            set2.add(str2[i]);
        }
       set1.retainAll(set2);
       output1=set1;
        }
    }
    public static void main(String[] args) {
        
// commonChars("gowtham", "gowtham", false);
 commonChars("Gowtham", "Gowtham", true);
 System.out.println((output1.toString().replace("[", "").replace("]", ""))+" , "+(output2.toString().replace("[", "").replace("]", "")));

 commonChars("Gowtham", "Siddarth", false);
 System.out.println(output1.toString().replace("[", "").replace("]", ""));
 
 commonChars("Hell", "Hello", true);
System.out.println((output1.toString().replace("[", "").replace("]", ""))+" , "+(output2.toString().replace("[", "").replace("]", "")));

commonChars("Hell", "Hello", false);
System.out.println(output1.toString().replace("[", "").replace("]", ""));

commonChars("Gowtham", "Siddarth", false);
System.out.println(output1.toString().replace("[", "").replace("]", ""));

commonChars("Gowtham", "Gowtham", true);
System.out.println((output1.toString().replace("[", "").replace("]", ""))+" , "+(output2.toString().replace("[", "").replace("]", "")));

commonChars("Rasul", "Bi", false);
System.out.println(output1.toString().replace("[", "").replace("]", ""));

commonChars("MySQL", "SqL", false);
System.out.println(output1.toString().replace("[", "").replace("]", ""));

commonChars("MySQL", "SqL", true);
System.out.println((output2.toString().replace("[", "").replace("]", ""))+"  "+(output1.toString().replace("[", "").replace("]", "")));

commonChars("Linux", "Unix", true);
System.out.println((output1.toString().replace("[", "").replace("]", ""))+" , "+(output2.toString().replace("[", "").replace("]", "")));

commonChars("Unix", "Linux", false);
System.out.println(output1.toString().replace("[", "").replace("]", ""));

commonChars("MasterMind", "Megamind", true);
System.out.println((output1.toString().replace("[", "").replace("]", ""))+" , "+(output2.toString().replace("[", "").replace("]", "")));

commonChars("MasterMind", "Megamind", false);
System.out.println(output1.toString().replace("[", "").replace("]", ""));

commonChars("True", "False", false);
System.out.println(output1.toString().replace("[", "").replace("]", ""));

commonChars("True", "False", true);
System.out.println((output1.toString().replace("[", "").replace("]", ""))+" , "+(output2.toString().replace("[", "").replace("]", "")));

    }
  static  TreeSet<Character> output1=new TreeSet(); 
  static  TreeSet<Character> output2=new TreeSet();
}