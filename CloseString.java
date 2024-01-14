import java.util.*;
public class CloseString{


public static boolean closeStrings(String word1, String word2) {

       int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (char c : word1.toCharArray()) {
            arr1[c - 'a']++;
        }

        for (char c : word2.toCharArray()) {
            arr2[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if ((arr1[i] == 0 && arr2[i] != 0) || (arr1[i] != 0 && arr2[i] == 0)) {
                return false;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
        
        
    }
    public static void main(String[] arg){
        String word1 ="aba";
        String word2 ="aab";
        
        System.out.println("String are Close to each other :"+closeStrings(word1,word2));

    }
}