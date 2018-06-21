#include <stdio.h>

typedef struct
{
    char *week_day;
    int day;
    int month;
} Date;

typedef struct
{
    char *name;
    Date *date; // to access memory address of Date
} Holiday;

void print_holiday()
{
    Date ny = {.week_day = "monday", .day = 1, .month = 1};
    Date gf = {.week_day = "friday", .day = 30, .month = 3};
    Date em = {.week_day = "monday", .day = 4, .month = 2};
    Date vd = {.week_day = "tuesday", .day = 20, .month = 5};
    Date ch = {.week_day = "wednesday", .day = 4, .month = 4};

    Holiday hd1 = {.name = "New Year's Day", .date = &ny};
    Holiday hd2 = {.name = "good friday", .date = &gf};
    Holiday hd3 = {.name = "easter monday", .date = &em};
    Holiday hd4 = {.name = "victoria day", .date = &vd};
    Holiday hd5 = {.name = "civic day", .date = &ch};

    Holiday hdays[5];
    hdays[0] = hd1;
    hdays[1] = hd2;
    hdays[2] = hd3;
    hdays[3] = hd4;
    hdays[4] = hd5;
    for (int i = 0; i < 5; i++)
    {
        printf("%02d/%02d - %-9s - %s\n", hdays[i].date->month, hdays[i].date->day, hdays[i].date->week_day, hdays[i].name);
    }
}

int main()
{
    print_holiday();
    return 0;
}
