// 6510405300 Kritpiruch Chaiwong
package src;

public class Board {
    private Square[] squares = new Square[40]; //Declare to have 40 squares in the board
    public Board() {
        squares[0] = new Square("Start", 0);
        squares[1] = new Square("Property1 - New York", 1);
        squares[2] = new Square("Property2 - Bangkok", 2);
        squares[3] = new Square("Property3 - Dubai", 3);
        //
        //
        //
        //
        //Other Place/Lucky Draw on the board
    }
    public Square getSquare(int location){
        return squares[location];
    }


}
