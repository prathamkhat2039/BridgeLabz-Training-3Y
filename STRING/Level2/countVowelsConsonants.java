
import java.util.*;

public class countVowelsConsonants {
    public static int stringLength(String str) {
        int count=0; try{ while(true){ str.charAt(count); count++; } } catch(Exception e){}
        return count;
    }
    public static String checkChar(char c) {
        if(c>='A' && c<='Z') c=(char)(c+32);
        if(c>='a' && c<='z') {
            if("aeiou".indexOf(c)!=-1) return "Vowel";
            return "Consonant";
        }
        return "Not a Letter";
    }
    public static int[] countVowelsConsonants(String str){
        int v=0,c=0;
        for(int i=0;i<stringLength(str);i++){
            String type=checkChar(str.charAt(i));
            if(type.equals("Vowel")) v++;
            else if(type.equals("Consonant")) c++;
        }
        return new int[]{v,c};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        int[] res=countVowelsConsonants(str);
        System.out.println("Vowels: "+res[0]+", Consonants: "+res[1]);
    }
}
