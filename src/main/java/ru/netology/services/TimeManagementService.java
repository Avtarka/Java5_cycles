package ru.netology.services;
public class TimeManagementService {
    public long calculate(long income, long expenses) {
        int count = 0; // счётчик месяцев отдыха
        long treshold = 0;
        for (int month = 0; month < 12; month++) {
            if (treshold >= 20_000) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                treshold = (treshold - expenses) - treshold / 3 * 2;
            } else {
                treshold = treshold + income - expenses;
            }
        }
        return count;
    }
}

