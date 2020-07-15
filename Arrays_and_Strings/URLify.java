public class URLify {

    public static String url(String s,int trueLength){
        char[] ch = new char[100];
        char[] chars = s.toCharArray();
        int numSpace = countSpace(' ',0,trueLength,chars);
        int newIndex = trueLength - 1 + numSpace * 2;

        if(newIndex + 1 < ch.length){
            ch[newIndex+1] = '\0';
        }

        for(int i=trueLength-1;i>=0;i--){
            if(chars[i] == ' '){
                ch[newIndex] = '0';
                ch[newIndex-1] = '2';
                ch[newIndex-2] = '%';
                newIndex = newIndex - 3;
            }else{
                ch[newIndex] = chars[i];
                newIndex--;
            }
        }

        return new String(ch);
    }


    public static int countSpace(char target,int start,int end,char[] chars){
        int count = 0;
        for(int i=start;i<end;i++){
            if(chars[i] == target){
                count++;
            }
        }
        return count;
    }
    


    public static void main(String[] args) {

        System.out.println(url("Mr John Smith     ",13));
        
    }
}