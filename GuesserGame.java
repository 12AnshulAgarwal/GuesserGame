import java.util.*;

class Guesser {
    int Guessernum;
    public int takeNumberGuesser(){
        System.out.println("Guesser guess any Number:");
        Scanner sc=new Scanner(System.in); 
        Guessernum=sc.nextInt();
        return Guessernum;
        }
}

class Players {
    int playernum;
    public int takeNumberPlayer(){
        System.out.println("Players guess any Number:");
        Scanner sc=new Scanner(System.in); 
        playernum=sc.nextInt();
        return playernum;
        }
}

class Umpire {
    int numfromGuesser;
    int numfromPlayer1;
    int numfromPlayer2;
    int numfromPlayer3;

    void CollectfromGuesser(){
        Guesser g=new Guesser();
        numfromGuesser=g.takeNumberGuesser();
        }
    void CollectfromPlayer(){
        Players P1=new Players();
        numfromPlayer1=P1.takeNumberPlayer();

        Players P2=new Players();
        numfromPlayer2=P2.takeNumberPlayer();

        Players P3=new Players();
        numfromPlayer3=P3.takeNumberPlayer();
    }
}

class GuesserGame{

    public static void main(String[] args) {

        
    }
}