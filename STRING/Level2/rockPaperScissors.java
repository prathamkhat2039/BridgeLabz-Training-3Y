
import java.util.*;

public class rockPaperScissors {
    public static String computerChoice(){
        String[] choices={"rock","paper","scissors"};
        return choices[(int)(Math.random()*3)];
    }
    public static String winner(String user,String comp){
        if(user.equals(comp)) return "Draw";
        if((user.equals("rock")&&comp.equals("scissors"))||(user.equals("paper")&&comp.equals("rock"))||(user.equals("scissors")&&comp.equals("paper"))) return "User";
        return "Computer";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games=sc.nextInt();
        int userWins=0,compWins=0;
        for(int i=0;i<games;i++){
            System.out.print("Enter choice (rock/paper/scissors): ");
            String user=sc.next();
            String comp=computerChoice();
            String res=winner(user,comp);
            if(res.equals("User")) userWins++;
            else if(res.equals("Computer")) compWins++;
            System.out.println("Game "+(i+1)+": User="+user+", Computer="+comp+" -> "+res);
        }
        System.out.println("User Wins: "+userWins+", Computer Wins: "+compWins);
        System.out.println("User Win%: "+(userWins*100.0/games)+"%, Computer Win%: "+(compWins*100.0/games)+"%");
    }
}
