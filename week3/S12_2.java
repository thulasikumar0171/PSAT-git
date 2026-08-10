class Solution {
    public String dayOfTheWeek(int day, int month, int year) {

        String[] days = {
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",;
            "Thursday",
            "Friday",
            "Saturday"
        };

        int[] monthDays = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        int totalDays = 0;

        // Days from 1971 up to the given year
        for (int y = 1971; y < year; y++) {
            if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }

        // Days from previous months in the given year
        for (int m = 1; m < month; m++) {
            totalDays += monthDays[m - 1];

            if (m == 2 && 
                (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
                totalDays++;
            }
        }

        // Add current day - 1
        totalDays += day - 1;

        // January 1, 1971 was Friday
        // Sunday = 0, Monday = 1, ..., Friday = 5
        int index = (5 + totalDays) % 7;

        return days[index];
    }
}

Input:
day =
31
month =
8
year =
2019
Output:
"Saturday"