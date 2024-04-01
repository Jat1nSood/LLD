public class Board{
    int size;
    char [][] board;
    int freeSpace;


    public Board(int size){
        this.size = size;
        this.board = new char[size][size];
        this.freeSpace = size*size;
    }

    

    //Print Board Method
    public void printBoard(){
        for(int i = 0; i < this.size; i++){
            for(int j = 0; j < this.size; j++){
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.print("------------");
            System.out.println();
        }
    }



    //Check if Free Space available
    public boolean getFreeSpace(){
        if(freeSpace != 0){
            return true;
        }
        return false;
    }



    //Add Peice tp Board
    public boolean addPeice(int row, int col, char peiceType){
        if(row >= 0 && row < this.size && col >= 0 &&  col < this.size){
            if(board[row][col] != '\u0000'){
                return false;
            }
            board[row][col] = peiceType;
            freeSpace -= 1;
            return true;
        }
        return false;
    }

    

    //Check for winner
    public boolean isThereWinner(int row, int col, char peiceType){
        if(checkRow(row, peiceType) || checkCol(col, peiceType) || checkRightDiag(peiceType) || checkLeftDiag(peiceType)){
            return true;
        }
        return false;
    }



    // Check row
    public boolean checkRow(int row, char peiceType){
        for(int i = 0; i < this.size; i++){
            if(board[row][i] != peiceType){
                return false;
            }
        }
        return true;
    }



    //Check Col
    public boolean checkCol(int col, char peiceType){
        for(int i = 0; i < this.size; i++){
            if(board[i][col] != peiceType){
                return false;
            }
        }
        return true;
    }



    //Check right Diag
    public boolean checkRightDiag(char peiceType){
        for(int i = 0; i < this.size; i++){
            if(board[i][i] != peiceType){
                return false;
            }   
        }
        return true;
    }



    //Check Left Diag
    public boolean checkLeftDiag(char peiceType){
        for(int i = 0; i < this.size; i++){
            if(board[i][this.size - i - 1] != peiceType){
                return false;
            }   
        }
        return true;
    }
}