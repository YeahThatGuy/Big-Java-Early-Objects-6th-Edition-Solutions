package Chapter5Review;

//E5.15

public class Date {

    private int month;
    private int day;

    public Date(int sMonth, int sDay) {
        month = sMonth;
        day = sDay;
    }

    public String getSeason() {
        String season = "";
        if ((month == 1) || (month == 2) || (month == 3)) {
            season = "Winter";
        } else if ((month == 4) || (month == 5) || (month == 6)) {
            season = "Spring";
        } else if ((month == 7) || (month == 8) || (month == 9)) {
            season = "Summer";
        } else if ((month == 10) || (month == 11) || (month == 12)) {
            season = "Fall";
        }

        if ((month % 3 == 0) && (day <= 31)) {
            if (season.equals("Winter")) {
                season = "Spring";
            } else if (season.equals("Spring")) {
                season = "Summer";
            } else if (season.equals("Summer")) {
                season = "Fall";
            } else {
                season = "Winter";
            }
        }

        return season;
    }

}
