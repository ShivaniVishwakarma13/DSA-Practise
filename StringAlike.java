// Online Java Compiler
import java.util.*; 
class Solution {
    public static boolean halvesAreAlike(String s) {
    

        Set<Character> vowel =new HashSet<>();
        String str ="aeiouAEIOU";

        for(char ch:str.toCharArray()){
            vowel.add(ch);
        }
         

        int vowelsCount = 0;
        int midIndex = s.length() / 2;

        for (int i = 0; i < midIndex; i++) {
            char charA = s.charAt(i);
            char charB = s.charAt(midIndex + i);
            if (vowel.contains(charA)) vowelsCount++;
            if (vowel.contains(charB)) vowelsCount--;
        }

        return vowelsCount == 0;
        
    }


    public static void main(String[] arg){
        String str ="Book";
        boolean isAlike =halvesAreAlike(str);
        System.out.println(isAlike);
        
        

    }
}