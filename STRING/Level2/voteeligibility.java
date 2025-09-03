
import java.util.*;

public class voteeligibility {
    public static int[] generateAges(int n){
        Random rand=new Random();
        int[] ages=new int[n];
        for(int i=0;i<n;i++) ages[i]=10+rand.nextInt(90);
        return ages;
    }
    public static String[][] votingEligibility(int[] ages){
        String[][] result=new String[ages.length][2];
        for(int i=0;i<ages.length;i++){
            result[i][0]=String.valueOf(ages[i]);
            result[i][1]=(ages[i]>=18)?"Can Vote":"Cannot Vote";
        }
        return result;
    }
    public static void main(String[] args){
        int[] ages=generateAges(10);
        String[][] res=votingEligibility(ages);
        System.out.println("Age\tEligibility");
        for(String[] row:res) System.out.println(row[0]+"\t"+row[1]);
    }
}
