package Review3;

//E3.15

public class Bug {
    
    private int position;
    private int direction;
    
    public Bug(int initialPosition) {
        position = initialPosition;
        direction = 1; //1 for right and 0 for left
    }
    
    public void move() {
        if (direction == 1) {
            position++;
        } else {
            position--;
        }
    }
    
    public void turn() {
        if (direction == 1) {
            direction = 0;
        } else {
            direction = 1;
        }
    }
    
    public int getPosition() {
        return position;
    }
}
