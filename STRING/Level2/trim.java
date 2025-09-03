
import java.util.*;

public class trim {
    public static int stringLength(String str){int c=0; try{while(true){str.charAt(c);c++;}}catch(Exception e){} return c;}
    public static int[] trimIndices(String str){
        int start=0,end=stringLength(str)-1;
        while(start<=end && str.charAt(start)==' ') start++;
        while(end>=start && str.charAt(end)==' ') end--;
        return new int[]{start,end};
    }
    public static String customSubstring(String str,int start,int end){
        StringBuilder sb=new StringBuilder();
        for(int i=start;i<=end;i++) sb.append(str.charAt(i));
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String str=sc.nextLine();
        int[] indices=trimIndices(str);
        String trimmed=customSubstring(str,indices[0],indices[1]);
        System.out.println("Custom Trim: '"+trimmed+"'");
        System.out.println("Built-in Trim: '"+str.trim()+"'");
        System.out.println("Are both same? "+trimmed.equals(str.trim()));
    }
}
