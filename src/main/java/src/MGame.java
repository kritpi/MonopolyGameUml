// 6510405300 Kritpiruch Chaiwong
package src;

public class MGame {
    private int roundCnt;
    private List<Player> players;
    private Board board;
    private Die[] dice = new Die[2];

    public MGame() {
        //initialize new dice, board, including players
        dice[0] = new Die();
        dice[1] = new Die();
        board = new Board();
    }

    public void playGame(){ //Play the game until it's over
        while (!isGameOver()){
            playRound();
        }
    }
    public boolean isGameOver(){ //Stop the game after the game is over
        return false;
    }
    private void playRound(){
        //for loop in players, each player take turn until game is over
    }
}
