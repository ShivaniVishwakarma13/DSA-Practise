import java.io.*;
import java.util.Scanner;
 
class ReverseString {
    public static void main (String[] args) {
       
        String str= "Hello", newstr="";
        char ch;
       
      System.out.println("Original word: "+str);
     
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        newstr= ch+newstr;
      }
      System.out.println("Reversed word: "+ nstr);
    }
}
