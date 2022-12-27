package third;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class MyCalendar {
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
    public static String getMonth(int numMonth) {
        String nameMonth;
        switch (numMonth) {
            case 1:
                nameMonth = "January";
                break;
            case 2:
                nameMonth = "February";
                break;
            case 3:
                nameMonth = "March";
                break;
            case 4:
                nameMonth = "April";
                break;
            case 5:
                nameMonth = "May";
                break;
            case 6:
                nameMonth = "June";
                break;
            case 7:
                nameMonth = "July";
                break;
            case 8:
                nameMonth = "August";
                break;
            case 9:
                nameMonth = "September";
                break;
            case 10:
                nameMonth = "October";
                break;
            case 11:
                nameMonth = "November";
                break;
            case 12:
                nameMonth = "December";
                break;
            default:
                nameMonth = "Error";
                break;
        }
        return nameMonth;
    }
    public static void main(String[] args) {
        int month = 2;
        int year = 2021;

        String nameMonth = getMonth(month);
        int maxDay = getMaxDayInMonth(month, year);
        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int numDayOfWeek = dayOfWeek.getValue() - 1;
        int dayNumber = 1;
        int[][] dayList = new int[5][7];
        boolean findFirstDay = false;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (dayNumber > maxDay) {
                    continue;
                } else if (j == numDayOfWeek && !findFirstDay) {
                    dayList[i][j] = dayNumber;
                    dayNumber++;
                    findFirstDay = true;
                } else if (findFirstDay) {
                    dayList[i][j] = dayNumber;
                    dayNumber++;
                }
            }
        }
        System.out.println(nameMonth);
        System.out.println("Mo  Tu  We  Th  Fr  Sa  Su");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (dayList[i][j] == 0) {
                    System.out.print("    ");
                }
                else if (dayList[i][j] < 10){
                    System.out.print(dayList[i][j] + "   ");
                }
                else System.out.print(dayList[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
