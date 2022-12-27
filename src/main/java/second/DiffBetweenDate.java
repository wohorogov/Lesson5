package second;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiffBetweenDate {
    public static int getMaxDayInMonth(int month, int year) {
        int maxDay;
        switch (month) {
            case 1:  maxDay = 31;
                break;
            case 2:  if (year % 4 == 0) {
                maxDay = 29;
                }
                else
                    maxDay = 28;
                break;
            case 3:  maxDay = 31;
                break;
            case 4:  maxDay = 30;
                break;
            case 5:  maxDay = 31;
                break;
            case 6:  maxDay = 30;
                break;
            case 7:  maxDay = 31;
                break;
            case 8:  maxDay = 31;
                break;
            case 9:  maxDay = 30;
                break;
            case 10: maxDay = 31;
                break;
            case 11: maxDay = 30;
                break;
            case 12: maxDay = 31;
                break;
            default:
                maxDay = 0;
        }
        return maxDay;
    }
    public static void main(String[] args) {
        int beginDay = 1;
        int beginMonth = 12;
        int beginYear = 2010;
        int endDay = 23;
        int endMonth = 2;
        int endYear = 2012;

        int nowDay = beginDay;
        int nowMonth = beginMonth;
        int  nowYear = beginYear;
        int[] countDayOfWeek = new int[7];
        int countDays = 0;
        int countMonths = 0;
        int countYears = 0;

        int maxDay = getMaxDayInMonth(nowMonth, nowYear);

        LocalDate date = LocalDate.of(nowYear, nowMonth, nowDay);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int numDayOfWeek = dayOfWeek.getValue();

        while ( nowDay != endDay || nowMonth != endMonth || nowYear != endYear) {
            countDays++;
            countDayOfWeek[numDayOfWeek - 1]++;


            if (numDayOfWeek < 7) {
                numDayOfWeek++;
            } else numDayOfWeek = 1;
            nowDay++;

            if (nowDay > maxDay) {
                nowDay = 1;
                nowMonth++;
                countMonths++;
                if (nowMonth > 12 ) {
                    nowYear++;
                    nowMonth = 1;
                    nowDay = 1;
                    countYears++;
                }
                maxDay = getMaxDayInMonth(nowMonth, nowYear);
            }
        }
        System.out.println("Количество дней = " + countDays + " Количество по дням недели:");
        System.out.println("Понедельник: " + countDayOfWeek[0]
                + "; вторник: " + countDayOfWeek[1]
                + "; среда: " + countDayOfWeek[2]
                + "; четверг: " + countDayOfWeek[3]
                + "; пятница: " + countDayOfWeek[4]
                + "; суббота: " + countDayOfWeek[5]
                + "; воскресенье: " + countDayOfWeek[6]);
        System.out.println("Количество месяцев: " + countMonths);
        System.out.println("Количество годов: " + countYears);
    }
}
