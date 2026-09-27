package DSA.src.com.sorting;

public class EnumDemo {
    enum Day {
        MONDAY, TUSEDAY, WEDSEDAY, THIRSDAY, FRIDAY, SUTURDAY, SUNDAY;

        Day(){
            System.out.println(this);
        }
    }

    static void main(String[] args) {
        Day day;
        day = Day.TUSEDAY;
      //  System.out.println(day);
    }
}
