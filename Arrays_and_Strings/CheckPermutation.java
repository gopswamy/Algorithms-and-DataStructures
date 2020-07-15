public class CheckPermutation {

    public static boolean check(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        int[] chars = new int[26];
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        for(int i=0;i<s1.length();i++){
            chars[s1.charAt(i)-'a']++;
            chars[s2.charAt(i)-'a']--;

        }

        for(int i : chars){
            if(i>0){
                return false;
            }
        }
        return true;

    }


    public static void main(String[] args) {
        System.out.println(check("gopi", "ipod"));
    }
    
}

/*
check string length,
if not equal, return false

char[] 

*/
