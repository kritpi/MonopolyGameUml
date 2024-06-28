// 6510405300 Kritpiruch Chaiwong
package src;

public class Piece {
    private Square location;
    public void movePieceTo(Square newLocation){
        location = newLocation; //Move the piece to tha ordered location
    }

    public Square getLocation() {
        return location; //Get location where the pieces are at in the board
    }
}
