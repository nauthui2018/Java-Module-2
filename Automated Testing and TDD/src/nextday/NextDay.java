package nextday;

public class NextDay {

    public static String findNextDay(int day, int month, int year) {
        String showNextDay = "";
        int nextYear = getNextYear(day, month, year);
        int nextMonth = getNextMonth(day, month, year);
        int nextDay = getNextDay(day, month, year);
        showNextDay += nextDay + "-" + nextMonth + "-" + nextYear;
        return showNextDay;
    }

    public static int getNextDay(int day, int month, int year) {
        int nextDay = day;
        int dayInMonth = checkDayInMonth(day, month, year);
        if (nextDay == dayInMonth) {
            nextDay = 1;
        } else nextDay++;
        return nextDay;
    }

    public static int getNextMonth(int day, int month, int year) {
        int nextMonth = month;
        int dayInMonth = checkDayInMonth(day, month, year);
        if (day == dayInMonth) {
            if (month == 12) {
                nextMonth = 1;
            } else {
                nextMonth++;
            }
        }
        return nextMonth;
    }

    public static int getNextYear(int day, int month, int year) {
        int nextYear = year;
        if (day == 31 && month == 12) {
            nextYear++;
        }
        return nextYear;
    }

    public static boolean checkLeapYear(int year) {
        boolean isLeapYear = false;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        }
        return isLeapYear;
    }

    public static int checkDayInMonth(int day, int month, int year) {
        boolean isLeapYear = checkLeapYear(year);
        int dayInMonth = 0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                dayInMonth = 31;
                break;
            case 4, 6, 9, 11:
                dayInMonth = 30;
                break;
            case 2:
                if (isLeapYear) {
                    dayInMonth = 29;
                } else {
                    dayInMonth = 28;
                }
                break;
        }
        return dayInMonth;
    }
}
