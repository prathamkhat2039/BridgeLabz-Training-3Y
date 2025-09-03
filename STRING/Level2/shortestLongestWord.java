
import java.util.*;

public class shortestLongestWord {
    public static int stringLength(String str) {
        int count = 0; try{ while(true){ str.charAt(count); count++; }}catch(Exception e){}
        return count;
    }
    public static String[] customSplit(String text) {
        int n = stringLength(text);
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i=0;i<n;i++){ char c=text.charAt(i);
            if(c==' '){ if(word.length()>0){words.add(word.toString());word.setLength(0);}}
            else word.append(c);
        }
        if(word.length()>0) words.add(word.toString());
        return words.toArray(new String[0]);
    }
    public static String[][] wordsWithLength(String[] words){
        String[][] result=new String[words.length][2];
        for(int i=0;i<words.length;i++){ result[i][0]=words[i]; result[i][1]=String.valueOf(stringLength(words[i])); }
        return result;
    }
    public static int[] shortestLongest(String[][] arr){
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,minIndex=-1,maxIndex=-1;
        for(int i=0;i<arr.length;i++){ int len=Integer.parseInt(arr[i][1]);
            if(len<min){min=len;minIndex=i;} if(len>max){max=len;maxIndex=i;}
        }
        return new int[]{minIndex,maxIndex};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text=sc.nextLine();
        String[] words=customSplit(text);
        String[][] result=wordsWithLength(words);
        int[] minMax=shortestLongest(result);
        System.out.println("Shortest: "+result[minMax[0]][0]);
        System.out.println("Longest: "+result[minMax[1]][0]);
    }
}
