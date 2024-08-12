import java.util.*;

class Guesser {    //Guesser->Whose work is to guess any number 
    int Guessernum;
    public int takeNumberGuesser(){
        System.out.println("Guesser guess any Number:");
        Scanner sc=new Scanner(System.in); 
        Guessernum=sc.nextInt();
        return Guessernum;
        }
}

class Players {   //Players->There work is also to guess any Number.
    int playernum;
    public int takeNumberPlayer(){
        System.out.println("Players 1,2 and 3 guess any Number:");
        Scanner sc=new Scanner(System.in); 
        playernum=sc.nextInt();
        return playernum;
        }
}

class Umpire {    
    //1.Umpire will Collect the Number from the guesser and store it.
    //2.Then Collect the Numbers from the Players for comparing.
    //3.At Last will Compare and show the output.
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
        System.out.println("Player 1 guessed: " + numfromPlayer1);

        Players P2=new Players();
        numfromPlayer2=P2.takeNumberPlayer();
        System.out.println("Player 2 guessed: " + numfromPlayer2);
        
        Players P3=new Players();
        numfromPlayer3=P3.takeNumberPlayer();
        System.out.println("Player 3 guessed: " + numfromPlayer3);
    }

    void compare(){
        if(numfromPlayer1==numfromGuesser){
            if(numfromPlayer2==numfromGuesser && numfromPlayer3==numfromGuesser){
                System.out.println("All players won the game");
            }
            else if(numfromPlayer2==numfromGuesser){
                System.out.println("Only Player1 and Player2 won the game");
            }
            else if(numfromPlayer3==numfromGuesser){
                System.out.println("Only Player1 and Player3 won the game");
            }else{
                System.err.println("Only Player 1 won the game");
            }
        }
        else if(numfromPlayer2==numfromGuesser){
            if(numfromPlayer3==numfromGuesser){
                System.out.println("Only Player2 and Player3 won the game");
            }else{
                System.err.println("Only Player 2 won the game");
            }
        }
        else if(numfromPlayer3==numfromGuesser){
            System.out.println("Only Player3 won the game");
        }else{
            System.err.println("No player won the game");
        }
    }
}
class GuesserGame{
    public static void main(String[] args) {
        Umpire U=new Umpire(); // Create an instance of the Umpire class
        U.CollectfromGuesser(); // Umpire collects the guessed number from the Guesser
        U.CollectfromPlayer(); // Umpire collects the guessed numbers from the Players
        U.compare(); // Umpire compares the Guesser's number with the Players' numbers to determine the winner.
        
    }
}