/*
Implements a basic string compression using the counts of repeated characters.
*/

class StringCompression{

    public static String compress(String s){
        StringBuilder sb = new StringBuilder();
        char temp = s.charAt(0);
        int count = 0;

        for(int i=0;i<s.length();i++){
            if(temp!=s.charAt(i)){
                sb.append(temp);
                sb.append(count);
                temp = s.charAt(i);
                count = 0;
            }
            count++;
            if(i==s.length()-1){
                sb.append(temp);
                sb.append(count);
            }
        }

        return sb.length()>s.length()?s:sb.toString();
    }


    public static void main(String[] args){

        System.out.println(compress("abc"));


    }
}