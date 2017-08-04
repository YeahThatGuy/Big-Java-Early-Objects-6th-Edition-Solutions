package Chapter6Review;

//E6.13
import java.util.ArrayList;
import java.util.List;

public class Powers {

    private int target;
    private int power;
    private int result;

    public Powers(int target, int power) {
        this.target = target;
        this.power = power;
    }

    /*
     public void calculatePower(int iPower) {
     result = (int) Math.pow(target, iPower);
     }
     */
    public List<Integer> calculatePower() {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i <= power; i++) {
            result.add((int) Math.pow(target, i));
        }
        return result;
    }

    public int getPower() {
        return result;
    }

}
