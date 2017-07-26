package Chapter5Review;

public class Time {

    private int time1;

    public Time(int time1) {
        this.time1 = time1;
    }

    public int compareTo(Time other) {
        String hours1 = "";
        String minutes1 = "";
        String hours2 = "";
        String minutes2 = "";
        int result;
        
        hours1 = Integer.toString(time1).substring(0, 2);
        minutes1 = Integer.toString(time1).substring(2, 4);
        hours2 = Integer.toString(other.time1).substring(0, 2);
        minutes2 = Integer.toString(other.time1).substring(2, 4);

        int hours1Int = Integer.parseInt(hours1);
        int minutes1Int = Integer.parseInt(minutes1);
        int hours2Int = Integer.parseInt(hours2);
        int minutes2Int = Integer.parseInt(minutes2);

        if (hours1Int < hours2Int) {
            result = -1;
        } else if (hours1Int == hours2Int) {
            if (minutes1Int < minutes2Int) {
                result = -1;
            } else if (minutes1Int == minutes2Int) {
                result = 0;
            } else {
                result = 1;
            }
        } else {
            result = 1;
        }
        return result;

    }

}