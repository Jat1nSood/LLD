import java.util.*;
public class Game {
    Board board;
    Deque<Player> players;

    public Game(){
        this.board = new Board(3);
        this.players = new LinkedList<>();
        Player player1 = new Player("Jatin", 'X');
        Player player2 = new Player("Rohit", 'O');
        this.players.add(player1);
        this.players.add(player2);
    }

    public String startGame(){

        System.out.println("Welcome, Lets begin 🚀..... ");
        boolean noWinner = true;

        while(noWinner) {

            //Check if Free space Available
            if(!board.getFreeSpace()){
                noWinner = false;
                continue;
            }
            //Check which player turn it is
            Player playerTurn = players.removeFirst();


            // read user Input
            System.out.println(playerTurn.name + '(' + playerTurn.peiceType + ')' + " " + "is to make move, Enter Row and Col, Ex - 0,1");
            board.printBoard();

            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            String[] values = s.split(",");
            if(values.length < 2){
                System.out.println("Incorrect position choosen, Try again");
                players.addFirst(playerTurn);
                continue;
            }
            int row = Integer.valueOf(values[0]);
            int col = Integer.valueOf(values[1]);


            //Place the peice
            boolean peiceAddedSuccessfully = board.addPeice(row, col, playerTurn.peiceType);
            if(!peiceAddedSuccessfully){
                System.out.println("Incorrect position choosen, Try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);


            //Check if after last move there wa winner
            boolean winner = board.isThereWinner(row, col, playerTurn.peiceType);
            if(winner){
                return playerTurn.name;
            }
            continue;
            
        }
        return "Tie";
    }

    
}
