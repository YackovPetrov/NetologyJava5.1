package ru.netology;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        ScheduleService service = new ScheduleService();
        System.out.println(service.calculate(10000, 3000, 20000));
    }
}