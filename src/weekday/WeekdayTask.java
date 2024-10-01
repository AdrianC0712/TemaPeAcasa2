package weekday;

public class WeekdayTask {

    enum Weekday {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        public boolean isWeekDay() {
            return this != SATURDAY && this != SUNDAY;
        }

        public boolean isHoliday() {
            return this == SATURDAY || this == SUNDAY;
        }
    }
    public static void main(String[] args) {
        System.out.println(Weekday.MONDAY.isWeekDay());
    }
}
