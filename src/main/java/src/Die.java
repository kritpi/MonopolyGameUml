// 6510405300 Kritpiruch Chaiwong
package src;
import java.util.concurrent.ThreadLocalRandom;
public class Die {
    private int faceValue;
    public int roll(){
        faceValue= ThreadLocalRandom.current().nextInt(1,6+1); //random the number on the dice from 1-6
        return faceValue;
    }
    public int getFaceValue() {
        return faceValue;
    }
}
