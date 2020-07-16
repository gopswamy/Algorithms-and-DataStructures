class StringRotation{

    public static boolean stringrotate(String s1,String s2){

        int len = s1.length();
        if(s2.length()==len && len > 0){
            String s1s1 = s1+s1;
            return s1s1.contains(s2);
        }

        return false;


    }

    public static void main(String[] args){
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        System.out.println(stringrotate(s1,s2));
    }
}