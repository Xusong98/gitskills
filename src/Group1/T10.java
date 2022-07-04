package Group1;

public class T10 {
    public static void main(String[] args) {
        String s1="hello world";
        String s2="fly me to the moon  ";
        String s3="  hi world";
        T10 t10 =new T10();
        //int i = t10.lengthOfLastWord(s1);
        System.out.println(t10.lengthOfLastWord(s1));
        System.out.println(t10.lengthOfLastWord(s2));
        System.out.println(t10.lengthOfLastWord(s3));

    }
    public  int lengthOfLastWord(String s){
        char[] ch = s.toCharArray();
        int count =0;
        for (int i = s.length()-1; i >=0 ; i--) {
            if (ch[i]!=' '){
                  count++ ;
            }else if (count!=0){break;}
        }
        /*String[] s1 = s.split(" ");
        for (int i = s1.length-1; i >=0; i--) {
            if (s1[i].equals("")){continue;}
            else {return s1[i].length();}
        }
        return 0;*/
        return count;
    }


    public  int lengthOfLastWord2(String s){
        s=s.trim();
        char[] ch = s.toCharArray();
        int count =0;
        for (int i = s.length()-1; i >=0 ; i--) {
            if (ch[i]==' '){ break;}
            count++;
        }
        /*String[] s1 = s.split(" ");
        for (int i = s1.length-1; i >=0; i--) {
            if (s1[i].equals("")){continue;}
            else {return s1[i].length();}
        }
        return 0;*/
        return count;
    }
}
