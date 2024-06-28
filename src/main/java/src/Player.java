// 6510405300 Kritpiruch Chaiwong
package src;

public class Player {
    private String name;
    private Piece piece;

    public Player(String name, Piece piece) {
        this.name = name;
        this.piece = piece;
    }

    public void takeTurn(Die[] dice, Board board){ //When roll the dice, get face number of each die and added together
        int rollNumber = dice[0].roll() + dice[1].roll();
        int newLocation= ; //Location of player's piece at the moment + rollNumber = if calculated number are more than 40 -> take that number - 40
        piece.movePieceTo(newLocation);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
