/*
Given two strings check if they are one edit away
*/


public class OneAway{


    public static boolean oneEdit(String s1,String s2){
        int count =0;
        int i=0;
        int j=0;
        while(i<s1.length() && j < s2.length()){
            if(s1.charAt(i) != s2.charAt(j)){
                count++;
                if(count > 1){
                    return false;
                }
                i++;
                continue;
            }else{
                i++;
                j++;
            }
        }
        return true;
    }

    public static boolean equalLength(String s1,String s2){
        int count = 0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                count++;
                if(count > 1){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){

        String s1 = args[0];
        String s2 = args[1];
        if(s1.length() == s2.length()+1){
            System.out.println(oneEdit(s1,s2));
        }else if(s1.length()+1 == s2.length()){
            System.out.println(oneEdit(s2,s1));
        }else if(s1.length()==s2.length()){
            System.out.println(equalLength(s1,s2));
        }else{
            System.out.println(false);
        }

    }
}