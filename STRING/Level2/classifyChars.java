
import java.util.*;

public class classifyChars {
    public static int stringLength(String str){int c=0; try{while(true){str.charAt(c);c++;}}catch(Exception e){} return c;}
    public static String checkChar(char c){
        if(c>='A'&&c<='Z') c=(char)(c+32);
        if(c>='a'&&c<='z'){ if("aeiou".indexOf(c)!=-1) return "Vowel"; return "Consonant";}
        return "Not a Letter";
    }
    public static String[][] classifyCharacters(String str){
        String[][] result=new String[stringLength(str)][2];
        for(int i=0;i<stringLength(str);i++){ result[i][0]=String.valueOf(str.charAt(i)); result[i][1]=checkChar(str.charAt(i)); }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        String[][] result=classifyCharacters(str);
        System.out.println("Char\tType");
        for(String[] row:result) System.out.println(row[0]+"\t"+row[1]);
    }
}
