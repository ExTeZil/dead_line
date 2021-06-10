package com.company;

import java.io.IOException;

public enum Month {
    January("Січень"),
    February("Лютий"),
    March("Березень"),
    April("Квітень"),
    May("Травень"),
    June("Червень"),
    July("Липень"),
    August("Серпень"),
    September("Вересень"),
    October("Жовтень"),
    November("Листопад"),
    December("Грудень");

    private final String monthToUA;

    Month(String monthToUA) {
        this.monthToUA = monthToUA;
    }

    public String getMonthToUA() {
        return monthToUA;
    }

    public static Month setMonthByNumber(int month) throws IOException {
        switch (month) {
            case 1:
                return Month.January;
            case 2:
                return Month.February;
            case 3:
                return Month.March;
            case 4:
                return Month.April;
            case 5:
                return Month.May;
            case 6:
                return Month.June;
            case 7:
                return Month.July;
            case 8:
                return Month.August;
            case 9:
                return Month.September;
            case 10:
                return Month.October;
            case 11:
                return Month.November;
            case 12:
                return Month.December;
            default:
                throw  new IOException("");
        }
        //return Month.December;
    }
}