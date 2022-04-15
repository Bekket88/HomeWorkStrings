package com.company;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = "";
        fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("----");

        System.out.println("Задача 2");
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
        System.out.println("----");

        System.out.println("Задача 3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё','e');
        System.out.println(fullName);
        System.out.println("----");
    }
}