package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setLastNameAndNameAndPatronymic("Набиуллин Назим Халилович");
        student.setGroup("5103");
        student.setReceipts(new Date());

        System.out.println(student.getLastNameAndNameAndPatronymic() + " зачислен в группу " + student.getGroup() + ". Дата поступления " + student.getReceipts() + ".");

    }
}
