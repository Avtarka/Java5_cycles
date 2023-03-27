package ru.netology.services;

public class TimeManagementService {
//    public long calculate(long income, long expenses) {
//       int count = 0; // счётчик месяцев отдыха
//        long treshold = 0;
//       for (int month = 0; month < 12; month++) {
//           if (treshold >= 20_000) { // можем ли отдыхать?
//                count++; // увеличиваем счётчик месяцев отдыха
//                treshold = (treshold - expenses) - treshold / 3 * 2;
//            } else {
//                treshold = treshold + income - expenses;
//            }
//        }
//        return count;
//   }

    public long calculate(int income, int expenses, int treshold) {
        int count = 0; // счётчик месяцев отдыха
        int cashAccount = 0;  // денег на счету
        for (int month = 0; month < 12; month++) {
            if (cashAccount >= treshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                cashAccount = (cashAccount - expenses) / 3;
            } else {
                cashAccount = cashAccount + income - expenses;
            }
        }
        return count;
    }
}

