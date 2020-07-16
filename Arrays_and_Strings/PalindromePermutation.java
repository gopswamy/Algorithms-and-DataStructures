/*
Given a String, write a functoin to check if its a permutuation of a plaindrome.

*/

public class PalindromePermutation {

    public static boolean check(String s){
        s = s.toLowerCase();
        int[] chars = new int[26];

        for(char c : s.toCharArray()){
            if(c==' '){
                continue;
            }
            chars[c-'a']++;
        }
        int count=0;
        for(int i : chars){
            if(i%2!=0){
                count++;
            }
        }
        return count <=1;

    }



    public static void main(String[] args) {

        System.out.println(check("Tact Coa"));
        
    }
    
}