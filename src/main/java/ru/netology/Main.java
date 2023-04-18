package ru.netology;

import ru.netology.services.ScheduleService;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        ScheduleService service = new ScheduleService();
        System.out.println(service.calculate(100000, 60000, 150000));
    }
}