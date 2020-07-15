/*
Implement an algorithm to determine if a string has all unique character
*/

class isUnique{

    public static boolean isUniqueMethod(String s){
        int[] chars = new int[26];
        for(char c : s.toCharArray()){
            chars[c-'a']++;
        }

        for(int i : chars){
            if(i>1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        System.out.println(isUniqueMethod("aab"));
    }    
}
