package com.company;

public class Main {
    public static void main(String[] args) {

        System.out.println("������ 1");
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = "";
        fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("��� ���������� � " + fullName);
        System.out.println("----");

        System.out.println("������ 2");
        fullName = fullName.toUpperCase();
        System.out.println("������ ��� ���������� ��� ���������� ������ � " + fullName);
        System.out.println("----");

        System.out.println("������ 3");
        fullName = "������ ���� ��������";
        fullName = fullName.replace('�','e');
        System.out.println(fullName);
        System.out.println("----");
    }
}