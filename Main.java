import java.util.*;
public class Main {
    public static void main(String[] args) {
        //TIC_TAC_TOE_GAME
        Main ob = new Main();
        Scanner sc = new Scanner(System.in);
        char tic[][]=new char[3][3];
        for(int r =0;r<tic.length;r++) {
            for (int c = 0; c < tic[r].length; c++) {
                tic[r][c] = ' ';
            }
        }
        char p='X';
        boolean gameover=false;
        while(!gameover){
            ob.print_board(tic);
            System.out.println("Enter the position");
            int row = sc.nextInt();
            int col =sc.nextInt();
            if(tic[row][col]==' '){
                tic[row][col]=p;
                gameover = ob.havewon(tic,p);
                if(gameover){
                    ob.print_board(tic);
                    System.out.println("Player "+p+" has won.");
                }
                else {
                    p = p == 'X' ? 'O' : 'X';//swapping the player from X to O and vice-versa
                }
            }
            else {
                System.out.println("Invalid choice re-enter choice");
            }
        }
    }
    void print_board(char tic[][]){
        for(int r =0;r<tic.length;r++)
        {
            for(int c=0;c<tic[r].length;c++){
                System.out.print(tic[r][c]+" | ");
            }
            System.out.println();
        }
    }
    boolean havewon(char tic[][],char p){
        //to check for rows
        for (int r=0;r<tic.length;r++){
            if(tic[r][0]==p &&tic[r][1]==p &&tic[r][2]==p){
                return(true);
            }
        }
        //check for columns
        for (int r=0;r<tic.length;r++){
            if(tic[0][r]==p &&tic[1][r]==p &&tic[2][r]==p){
                return(true);
            }
        }
        if(tic[0][0]==p && tic[1][1]==p && tic[2][2]==p)
            return (true);
        if(tic[0][2]==p && tic[1][1]==p && tic[2][0]==p)
            return (true);
       return(false);
    }
}